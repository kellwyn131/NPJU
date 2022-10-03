package br.com.uniamerica.npju.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@Entity
//@Table(name = "tb_estagiarios",schema = "npju")
public class Estagiario extends AbstractEntity{
    @Getter @Setter
    @Column(name = "nome",length = 25,nullable = false)
    private String nome;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "periodo",nullable = false)
    private Periodo periodo;
    @Getter @Setter
    @Column(name = "semestre",length = 10,nullable = false)
    private String semestre;
    @Getter @Setter
    @Column(name = "telefone",length = 15)
    private String telefone;
    @Getter @Setter
    @Column(name = "email",length = 25)
    private String email;
    @Getter @Setter
    @Column(name = "escala",length = 100,nullable = false)
    private String escala;

    public Estagiario(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Estagiario() {
    }
}
