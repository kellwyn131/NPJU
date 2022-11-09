package br.com.uniamerica.npju.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_controles",schema = "npju")
public class ControleEstagiario extends AbstractEntity {
    @Getter @Setter
    @JoinColumn(name = "id_estagiario", nullable = false)
    @OneToOne(fetch = FetchType.EAGER)
    private Adm estagiario;
    @Getter @Setter
    @Column(name = "atendimentos_contemplados",nullable = false)
    private Long atendimentosContemplados;
    @Getter @Setter
    @Column(name = "atendimentos_nao_contemplados",nullable = false)
    private Long atendimentosNaoContemplados;
    @Getter @Setter
    @Column(name = "atendimentos_convertidos",nullable = false)
    private Long atendimentosConvertidos;
    @Getter @Setter
    @Column(name = "mediacoes_realizadas",nullable = false)
    private Long mediacoesRealizadas;
    @Getter @Setter
    @Column(name = "conciliacoes_realizadas",nullable = false)
    private Long conciliacoesRealizadas;
    @Getter @Setter
    @Column(name = "procuracoes_realizadas",nullable = false)
    private Long procuracoesRealizadas;
    @Getter @Setter
    @Column(name = "declaracoes_hipossuficiencia",nullable = false)
    private Long declaracoesHipossuficiencia;
    @Getter @Setter
    @Column(name = "cartas_convite_realizadas",nullable = false)
    private Long cartasConviteRealizadas;
    @Getter @Setter
    @Column(name = "termos_compromisso_realizados",nullable = false)
    private Long termosCompromissoRealizados;
    @Getter @Setter
    @Column(name = "atas_mediacao",nullable = false)
    private Long atasMediacao;
    @Getter @Setter
    @Column(name = "pecas_principais",nullable = false)
    private Long pecasPrincipais;
    @Getter @Setter
    @Column(name = "pecas_prosseguimento",nullable = false)
    private Long pecasProsseguimento;
    @Getter @Setter
    @Column(name = "relatorios_elaborados",nullable = false)
    private Long relatoriosElaborados;
    @Getter @Setter
    @Column(name = "casos_baixados",nullable = false)
    private Long casosBaixados;
    @Getter @Setter
    @Column(name = "audiencias_assistidas",nullable = false)
    private Long audienciasAssistidas;
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
    public ControleEstagiario(){

    }
}