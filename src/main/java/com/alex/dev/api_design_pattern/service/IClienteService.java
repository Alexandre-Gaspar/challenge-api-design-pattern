package com.alex.dev.api_design_pattern.service;

import com.alex.dev.api_design_pattern.model.Cliente;

public interface IClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
