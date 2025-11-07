package br.com.rachel.confeitaria_api.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rachel.confeitaria_api.dto.ProdutoDetalhesDTO;
import br.com.rachel.confeitaria_api.exception.EntidadeNaoEncontradaException;
import br.com.rachel.confeitaria_api.mapper.ProdutoMapper;
import br.com.rachel.confeitaria_api.model.Produto;
import br.com.rachel.confeitaria_api.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
    private ProdutoMapper produtoMapper;

	public ProdutoDetalhesDTO buscarPorId(UUID id) {
		Produto produto = produtoRepository.findById(id)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Produto não encontrado com id: " + id));

		return produtoMapper.toDto(produto);
	}
}