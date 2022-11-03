package br.com.uniamerica.npju.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_controles",schema = "npju")
public class ControleEstagiario extends AbstractEntity {
    @Getter @Setter
    @JoinColumn(name = "id_estagiario", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Administrador estagiario;
    @Getter @Setter
    @Column(name = "atendimentos-contemplados",nullable = false)
    private int atendimentosContemplados;
    @Getter @Setter
    @Column(name = "atendimentos_nao_contemplados",nullable = false)
    private int atendimentosNaoContemplados;
    @Getter @Setter
    @Column(name = "atendimentos_convertidos",nullable = false)
    private int atendimentosConvertidos;
    @Getter @Setter
    @Column(name = "mediacoes_realizadas",nullable = false)
    private int mediacoesRealizadas;
    @Getter @Setter
    @Column(name = "conciliacoes_realizadas",nullable = false)
    private int conciliacoesRealizadas;
    @Getter @Setter
    @Column(name = "procuracoes_realizadas",nullable = false)
    private int procuracoesRealizadas;
    @Getter @Setter
    @Column(name = "declaracoes_hipossuficiencia",nullable = false)
    private int declaracoesHipossuficiencia;
    @Getter @Setter
    @Column(name = "cartas_convite_realizadas",nullable = false)
    private int cartasConviteRealizadas;
    @Getter @Setter
    @Column(name = "termos_compromisso_realizados",nullable = false)
    private int termosCompromissoRealizados;
    @Getter @Setter
    @Column(name = "atas_mediacao",nullable = false)
    private int atasMediacao;
    @Getter @Setter
    @Column(name = "pecas_principais",nullable = false)
    private int pecasPrincipais;
    @Getter @Setter
    @Column(name = "pecas_prosseguimento",nullable = false)
    private int pecasProsseguimento;
    @Getter @Setter
    @Column(name = "relatorios_elaborados",nullable = false)
    private int relatoriosElaborados;
    @Getter @Setter
    @Column(name = "casos_baixados",nullable = false)
    private int casosBaixados;
    @Getter @Setter
    @Column(name = "audiencias_assistidas",nullable = false)
    private int audienciasAssistidas;
    @Getter @Setter
    @Column(name = "estudos_realizados",nullable = false)
    private String estudosRealizados;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "abatimento_estagio",nullable = false)
    private AbatimentoEstagio abatimentoEstagio; // COM CAMPO PARA HORAS, IMPLEMENTAR FUTURAMENTE
    @Getter @Setter
    @Column(name = "observacao")
    private String observacao;

    //metodo para comportamento de gerar automaticamente a quantidade ex: de atendimentos
}