package br.com.uniamerica.npju.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_administradores",schema = "npju")
public class Adm extends AbstractEntity{
    @Getter @Setter
    @Column(name = "nome",length = 255,nullable = false)
    private String nome;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "periodo_id",nullable = false)
    private Periodo periodo;
    @Getter @Setter
    @Column(name = "semestre",length = 255,nullable = false)
    private String semestre;
    @Getter @Setter
    @Column(name = "telefone",length = 255, nullable = false)
    private String telefone;
    @Getter @Setter
    @Column(name = "email",length = 255, nullable = false)
    private String email;
    @Getter @Setter
    @Column(name = "escala",length = 255,nullable = false)
    private String escala;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "grupo_id", nullable = false)
    private Grupo grupo;

    public Adm() {
    }
}
