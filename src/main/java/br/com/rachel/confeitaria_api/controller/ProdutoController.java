package br.com.rachel.confeitaria_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rachel.confeitaria_api.dto.ProdutoDetalhesDTO;
import br.com.rachel.confeitaria_api.service.ProdutoService;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDetalhesDTO> getProduto(@PathVariable @NotNull UUID id) {
        return ResponseEntity.ok(produtoService.buscarPorId(id));
    }
}
