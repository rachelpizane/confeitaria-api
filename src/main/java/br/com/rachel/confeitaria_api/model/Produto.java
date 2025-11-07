package br.com.rachel.confeitaria_api.model;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

@Entity
@Table(name = "produto")
@NoArgsConstructor
@Getter
@Setter
public class Produto {

    @Id
    @Setter(AccessLevel.NONE)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 500)
    private String descricao;

    @Column(length = 255)
    private String complementar;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;
}
