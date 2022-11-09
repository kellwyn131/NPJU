package br.com.uniamerica.npju.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "tb_processos", schema = "npju")
public class Processo extends AbstractEntity{
    @Getter @Setter
    @JoinColumn(name = "id_assistido", nullable = false)
    @OneToOne(fetch = FetchType.EAGER)
    //@JsonIgnore
    private Assistido assistido; //na classe assistido fazer a volta

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "hipossuficiencia", nullable = false)
    private Hipossuficiencia hipossuficiencia;

    @Getter @Setter
    @JoinColumn(name = "id_estagiario", nullable = false)
    @OneToOne(fetch = FetchType.EAGER)
    //@JsonIgnore
    private Adm estagiario;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "carta_convite", nullable = false)
    private CartaConvite cartaConvite; // é um documento em que um residente legal no país assume a responsabilidade pela chegada e hospedagem de uma pessoa.

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "mediacao", nullable = false)
    private Mediacao mediacao; //???demandante quer a opção MARCADA com data, como fazer ? não será mais enum?
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "encaminhado_para_protocolo", nullable = false)
    private EncaminhadoParaProtocolo encaminhadoParaProtocolo;
    @Getter @Setter
    @Column(name = "processo_medicao", length = 255)
    private String processoMediacao; //campo para numero do processo
    @Getter @Setter
    @Column(name = "processo_judicial", length = 255)
    private String processoJudicial; // campo para numero do processo
    @Getter @Setter
    @Column(name= "procuracao")
    private boolean procuracao;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "peca_inicial", nullable = false)
    private PecaInicial pecaInicial;
    @Getter @Setter
    @Column(name = "juizo", length = 255)
    private String juizo;
    @Getter @Setter
    @JoinColumn(name = "id_professor", nullable = false)
    @OneToOne(fetch = FetchType.EAGER)
    //@JsonIgnore
    private Adm professor;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "audiencia_marcada", nullable = false)
    private AudienciaMarcada audienciaMarcada;  // campo para data no MARCADA
    @Getter @Setter
    @Column(name ="ciente_da_audiencia")
    private boolean clienteCienteDaAudiencia;
    @Getter @Setter
    @Column(name = "outra_parte_ciente")
    private boolean outraParteIntimada;
    @Getter @Setter
    @Column(name = "encaminhamento", length = 255)
    private String encaminhamento;
    @Getter @Setter
    @Column(name = "ultimo_atendimento")
    private LocalDateTime ultimoAtendimento;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "sentenca", nullable = false)
    private Sentenca sentenca;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "recurso", nullable = false)
    private RecursoLiquidacaoExecucao recurso;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "liquidacao", nullable = false)
    private RecursoLiquidacaoExecucao liquidacao;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "execucao", nullable = false)
    private RecursoLiquidacaoExecucao execucao;

    //para arquivamento - com campo para a data - para indicar que o caso deve ir para a pasta de arquivo. casos que já foram atendidos ou não

    @Getter @Setter
    @Column(name = "arquivado")
    private boolean arquivado;
    //CLASSE PASTA - 2 caixas para seleção, "criar" e "criada" com campo para descrição da localização da pasta

    @Getter @Setter
    @Column(name = "observacao")
    private String observacao;
    public Processo(){

    }
}
