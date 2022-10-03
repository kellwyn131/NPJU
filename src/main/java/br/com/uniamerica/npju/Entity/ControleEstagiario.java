package br.com.uniamerica.npju.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@Entity
//@Table(name = "tb_controles",schema = "npju")
public class ControleEstagiario extends AbstractEntity {

    @Getter @Setter
    @Column(name = "atendimentosContemplados",nullable = false)
    private Integer atendimentosContemplados;
    @Getter @Setter
    @Column(name = "atendimentosNaoContemplados",nullable = false)
    private Integer atendimentosNaoContemplados;
    @Getter @Setter
    @Column(name = "atendimentosConvertidos",nullable = false)
    private Integer atendimentosConvertidos;
    @Getter @Setter
    @Column(name = "mediacoesRealizadas",nullable = false)
    private Integer mediacoesRealizadas;
    @Getter @Setter
    @Column(name = "conciliacoesRealizadas",nullable = false)
    private Integer conciliacoesRealizadas;
    @Getter @Setter
    @Column(name = "procuracoesRealizadas",nullable = false)
    private Integer procuracoesRealizadas;
    @Getter @Setter
    @Column(name = "declaracoesHipossuficiencia",nullable = false)
    private Integer declaracoesHipossuficiencia;
    @Getter @Setter
    @Column(name = "cartasConviteRealizadas",nullable = false)
    private Integer cartasConviteRealizadas;
    @Getter @Setter
    @Column(name = "termosCompromissoRealizados",nullable = false)
    private Integer termosCompromissoRealizados;
    @Getter @Setter
    @Column(name = "atasMediacao",nullable = false)
    private Integer atasMediacao;
    @Getter @Setter
    @Column(name = "pecasPrincipais",nullable = false)
    private Integer pecasPrincipais;
    @Getter @Setter
    @Column(name = "pecasProsseguimento",nullable = false)
    private Integer pecasProsseguimento;
    @Getter @Setter
    @Column(name = "relatoriosElaborados",nullable = false)
    private Integer relatoriosElaborados;
    @Getter @Setter
    @Column(name = "casosBaixados",nullable = false)
    private Integer casosBaixados;
    @Getter @Setter
    @Column(name = "audienciasAssistidas",nullable = false)
    private Integer audienciasAssistidas;
    @Getter @Setter
    @Column(name = "estudosRealizados",nullable = false)
    private Integer estudosRealizados;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "abatimentoEstagio",nullable = false)
    private AbatimentoEstagio abatimentoEstagio; // COM CAMPO PARA HORAS, IMPLEMENTAR FUTURAMENTE
    public ControleEstagiario(int atendimentosContemplados, int atendimentosNaoContemplados, int atendimentosConvertidos) {
        this.atendimentosContemplados = atendimentosContemplados;
        this.atendimentosNaoContemplados = atendimentosNaoContemplados;
        this.atendimentosConvertidos = atendimentosConvertidos;
    }

    public ControleEstagiario() {
    }
}