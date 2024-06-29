package com.alex.dev.api_design_pattern.service;

import com.alex.dev.api_design_pattern.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    //@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/"): One way to do it
    @GetMapping("/{cep}/json/") // another way to do it
    Endereco consultarCep(@PathVariable("cep") String cep);
}
