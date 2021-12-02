import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PaisesServices {
    private final PaisesRepository repository;
//    private final PaisesRepository repository1 = null;

    @Autowired
    public PaisesServices(PaisesRepository repository) {
        this.repository = repository;
    }

    public List<com.example.demo_spring.paises.Paises> listar() {
        return repository.findAll();
    }
public List<com.example.demo_spring.paises.Paises> list_ordenada_paises(){
        return repository.findTop10ByOrderByLevelDesc();
}
    public void addNewPais(com.example.demo_spring.paises.Paises pais) {
        Optional<com.example.demo_spring.paises.Paises> optionalPaises = repository.findPaisesByNome_pais(pais.getNome_pais());
        if (optionalPaises.isPresent()) {
            throw new IllegalStateException("Este pais ja foi registado");
        } else {
            repository.save(pais);
        }
    }

    public void deletePais(Long paisId) {
//        repository.findAllById(paisId);
        boolean existe = repository.existsById(Math.toIntExact(paisId));
        if (!existe) {
            throw new IllegalStateException("Este id=> (" + paisId + ") nao existe");
        } else {
            repository.deleteById(Math.toIntExact(paisId));
        }
    }

    @Transactional
    public void atualizar_dados_pais(Long paisId, String nome_pais,String capital,
                                     String regiao, String area, String sub_regiao) {

        com.example.demo_spring.paises.Paises paises = repository.findById(Math.toIntExact(paisId)).orElseThrow(() -> new IllegalStateException("Este Id->(" + paisId + ") nao existe"));
        if (nome_pais != null && nome_pais.length() > 0 && !Objects.equals(paises.getNome_pais(), nome_pais)) {
            Optional<com.example.demo_spring.paises.Paises> optionalPaises=repository.findPaisesByNome_pais(nome_pais);
            if (optionalPaises.isPresent()){
                throw new IllegalStateException("Este Nome=>("+nome_pais+") ja existe");
            }else paises.setNome_pais(nome_pais);

        }
        if (regiao != null && regiao.length() > 0 && !Objects.equals(paises.getRegiao(), regiao)) {
            paises.setRegiao(regiao);
        }
        if (area != null && area.length() > 0 && !Objects.equals(paises.getArea(), area)) {
            paises.setArea(area);
        }
        if (sub_regiao != null && sub_regiao.length() > 0 && !Objects.equals(paises.getSub_region(), sub_regiao)) {
            paises.setSub_region(sub_regiao);
        }
        if (capital != null && capital.length() > 0 && !Objects.equals(paises.getCapital(), capital)) {
            paises.setCapital(capital);
        }
    }
}
