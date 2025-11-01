package br.com.rachel.confeitaria_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @GetMapping("/{id}")
    public Map<String, String> getProduto(@PathVariable String id) {
        return Collections.singletonMap("mensagem", "Produto " + id + " encontrado!");
    }
}
