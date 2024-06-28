package com.alex.dev.api_design_pattern.repository;

import com.alex.dev.api_design_pattern.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
