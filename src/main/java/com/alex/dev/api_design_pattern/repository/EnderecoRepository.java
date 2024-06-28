package com.alex.dev.api_design_pattern.repository;

import com.alex.dev.api_design_pattern.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
