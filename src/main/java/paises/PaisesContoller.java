import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/paises")
public class PaisesContoller {
    private final com.example.demo_spring.paises.PaisesServices paisesServices;
//    private PaisesServices paiseservices;

    @Autowired //ajuda a injectar a variavel paises visto que esta a vir de PaisesService
    public PaisesContoller(com.example.demo_spring.paises.PaisesServices paisesServices) {
        this.paisesServices = paisesServices;
    }

    @GetMapping("/listagem_em_ordem") //rota
    public List<com.example.demo_spring.paises.Paises> getpaises_home() {
        return paisesServices.list_ordenada_paises();
    }
    @GetMapping("/listarpaises") //rota
    public List<com.example.demo_spring.paises.Paises> getpaises() {
        return paisesServices.listar();
    }

    @PostMapping("/postpaises")
    public void registarNovoPais(@RequestBody com.example.demo_spring.paises.Paises pais) {
        paisesServices.addNewPais(pais);
    }

    @DeleteMapping(path = "eliminar_pais/{paisId}")
    public void removePais(@PathVariable("paisId") Long paisId) {
        paisesServices.deletePais(paisId);
    }

    @PutMapping(path = "atualizar_pais/{paisId}")
    public void updatePaise(@PathVariable("paisId") Long paisId,
                            @RequestParam(required = false) String nome_pais,
                            @RequestParam(required = false) String capital,
                            @RequestParam(required = false) String regiao,
                            @RequestParam(required = false) String area,
                            @RequestParam(required = false) String sub_regiao) {
        paisesServices.atualizar_dados_pais(paisId, nome_pais, capital,regiao, area, sub_regiao);
    }
}
