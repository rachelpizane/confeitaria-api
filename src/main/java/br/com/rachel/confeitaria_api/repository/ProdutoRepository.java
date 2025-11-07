package br.com.rachel.confeitaria_api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rachel.confeitaria_api.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
}
