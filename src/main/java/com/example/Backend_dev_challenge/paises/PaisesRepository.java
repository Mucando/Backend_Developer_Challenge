package com.example.Backend_dev_challenge.paises;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Primary
@Repository
public interface PaisesRepository extends JpaRepository<Paises, Integer> {
    @Query("SELECT p FROM Paises p WHERE p.nome_pais=?1")
    Optional<Paises> findPaisesByNome_pais(String nome_pais);
    @Query("SELECT p FROM Paises p order by p.nome_pais ")
    public List<Paises> findTop10ByOrderByLevelDesc();
}
