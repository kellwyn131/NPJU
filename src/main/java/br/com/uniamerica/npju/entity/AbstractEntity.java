package br.com.uniamerica.npju.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @Getter
    @Setter
    @Column(name = "id")
    private Long id;
    @Getter @Setter
    @Column(name = "cadastro",nullable = false)
    private LocalDateTime cadastrado;
    @Getter @Setter
    @Column(name = "atualizado")
    private LocalDateTime atualizado;
    @Getter @Setter
    @Column(name = "ativo", nullable = false)
    private boolean ativo;
}