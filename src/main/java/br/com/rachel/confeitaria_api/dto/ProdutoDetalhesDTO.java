package br.com.rachel.confeitaria_api.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record ProdutoDetalhesDTO(
    UUID id,
    String nome,
    String descricao,
    String complementar,
    BigDecimal valor
) {}