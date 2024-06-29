package com.alex.dev.api_design_pattern.service;

import com.alex.dev.api_design_pattern.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
