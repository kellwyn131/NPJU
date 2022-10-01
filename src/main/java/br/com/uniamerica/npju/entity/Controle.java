package br.com.uniamerica.npju.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_controles",schema = "NPJU")
public class Controle extends AbstractEntity {
    @Getter @Setter
    @Column(name = "atendimentos_contemplados",nullable = false)
    private Integer atendimentos_contemplados;
    @Getter @Setter
    @Column(name = "atendimentos_nao_contemplados",nullable = false)
    private Integer atendimentos_nao_contemplados;
    @Getter @Setter
    @Column(name = "atendimentos_convertidos",nullable = false)
    private Integer atendimentos_convertidos;
    @Getter @Setter
    @Column(name = "mediacoes_realizadas",nullable = false)
    private Integer mediacoes_realizadas;
    @Getter @Setter
    @Column(name = "conciliacoes_realizadas",nullable = false)
    private Integer conciliacoes_realizadas;
    @Getter @Setter
    @Column(name = "procuracoes_realizadas",nullable = false)
    private Integer procuracoes_realizadas;
    @Getter @Setter
    @Column(name = "declaracoes_hipossuficiencia",nullable = false)
    private Integer declaracoes_hipossuficiencia;
    @Getter @Setter
    @Column(name = "cartas_convite_realizadas",nullable = false)
    private Integer cartas_convite_realizadas;
    @Getter @Setter
    @Column(name = "termos_compromisso_realizados",nullable = false)
    private Integer termos_compromisso_realizados;
    @Getter @Setter
    @Column(name = "atas_mediacao",nullable = false)
    private Integer atas_mediacao;
    @Getter @Setter
    @Column(name = "pecas_principais",nullable = false)
    private Integer pecas_principais;
    @Getter @Setter
    @Column(name = "pecas_prosseguimento",nullable = false)
    private Integer pecas_prosseguimento;
    @Getter @Setter
    @Column(name = "relatorios_elaborados",nullable = false)
    private Integer relatorios_elaborados;
    @Getter @Setter
    @Column(name = "casos_baixados",nullable = false)
    private Integer casos_baixados;
    @Getter @Setter
    @Column(name = "audiencias_assistidas",nullable = false)
    private Integer audiencias_assistidas;
    @Getter @Setter
    @Column(name = "estudos_realizados",nullable = false)
    private Integer estudos_realizados;

}
