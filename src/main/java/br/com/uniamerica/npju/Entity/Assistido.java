package br.com.uniamerica.npju.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_assistido", schema = "npju")
public class Assistido extends AbstractEntity {
    @Column(name = "nome", nullable = false, length = 100)
    @Getter @Setter
    private String nome;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "registro_nacional", nullable = false)
    private RegistroNacional registroNacional;
    @Getter @Setter
    @Column(name = "cpf", nullable = false, unique = true, length = 11)
    private String cpf;
    @Getter @Setter
    @Column(name = "telefone", nullable = false, length = 20)
    private String telefone;
    @Getter @Setter
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_endereco", nullable = false)
    private Endereco endereco;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_civil",nullable = false)
    private EstadoCivil estadoCivil;
    @Getter @Setter
    @Column(name = "uniao_estavel", nullable = false)
    private boolean uniaoEstavel;
    public Assistido(){
       }
    }
