package com.projeto.backend.repositories;

import com.projeto.backend.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
