import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Primary
@Repository
public interface PaisesRepository extends JpaRepository<com.example.demo_spring.paises.Paises, Integer> {
    @Query("SELECT p FROM Paises p WHERE p.nome_pais=?1")
    Optional<com.example.demo_spring.paises.Paises> findPaisesByNome_pais(String nome_pais);
    @Query("SELECT p FROM Paises order by  ")
    public List<com.example.demo_spring.paises.Paises> findTop10ByOrderByLevelDesc();
}
