package br.com.uniamerica.npju.Entity;


import java.time.LocalDateTime;

public abstract class AbstractEntity {
    private Long id;
    private LocalDateTime cadastro;
    private LocalDateTime atualizado;
    private boolean ativo; //  será o arquivado ? também citado na classe PROCESSO
 }
