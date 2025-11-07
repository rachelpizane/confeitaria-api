package br.com.rachel.confeitaria_api.mapper;

import org.mapstruct.Mapper;

import br.com.rachel.confeitaria_api.dto.ProdutoDetalhesDTO;
import br.com.rachel.confeitaria_api.model.Produto;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {
    ProdutoDetalhesDTO toDto(Produto produto);
}
