package com.aneor.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aneor.cursomc.domain.Endereco;;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
