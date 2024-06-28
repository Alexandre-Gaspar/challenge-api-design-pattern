package com.alex.dev.api_design_pattern.service;

import com.alex.dev.api_design_pattern.model.Cliente;

public interface iClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarTodosPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
