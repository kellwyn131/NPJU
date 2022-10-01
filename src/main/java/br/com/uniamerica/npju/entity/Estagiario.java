package br.com.uniamerica.npju.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_estagiarios",schema = "npju")
public class Estagiario extends AbstractEntity{
    @Getter @Setter
    @Column(name = "nome",length = 25,nullable = false)
    private String nome;
    @Getter @Setter
    @Column(name = "telefone",length = 15)
    private String telefone;
    @Getter @Setter
    @Column(name = "email",length = 25)
    private String email;
    @Getter @Setter
    @Column(name = "escala",length = 100,nullable = false)
    private String escala;
}
