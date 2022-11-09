package br.com.uniamerica.npju.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Getter @Setter
    @Column(name = "cadastro")
    private LocalDateTime cadastro;
    @Getter @Setter
    @Column(name = "ativo", nullable = false)
    private boolean ativo; //  será o arquivado ? também citado na classe PROCESSO
 }
