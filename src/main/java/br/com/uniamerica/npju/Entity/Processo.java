package br.com.uniamerica.npju.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "tb_processo", schema = "npju")
public class Processo extends AbstractEntity{
    @Getter @Setter
    @JoinColumn(name = "id_assistido", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Assistido assistido; //na classe assistido fazer a volta
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private Hipossuficiencia hipossuficiencia;
    @Getter @Setter
    @JoinColumn(name = "id_estagiario", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Administrador estagiario;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private CartaConvite cartaConvite; // é um documento em que um residente legal no país assume a responsabilidade pela chegada e hospedagem de uma pessoa.
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private Mediacao mediacao; //???demandante quer a opção MARCADA com data, como fazer ? não será mais enum?
    @Getter @Setter
    @Enumerated(EnumType.STRING)
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
    private PeçaInicial peçaInicial;
    @Getter @Setter
    @Column(name = "juizo", length = 255)
    private String juizo;
    @Getter @Setter
    @JoinColumn(name = "professor", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Administrador professor;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private AudienciaMarcada audienciaMarcada;  // campo para data no MARCADA
    @Getter @Setter
    @Column(name ="ciente_da_audiencia")
    private boolean clienteCienteDaAudiencia;
    //campo para descrição
    @Getter @Setter
    @Column(name = "outra-parte-ciente")
    private boolean outraParteIntimada;
    @Getter @Setter
    @Column(name = "encaminhamento", length = 255)
    private String Encaminhamento;
    @Getter @Setter
    @Column(name = "ultimo-atendimento")
    private LocalDateTime ultimoAtendimento;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private Sentenca sentenca;
    //campo para descrição
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private RecursoLiquidacaoExecucao recurso;
    //campo para descrição
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private RecursoLiquidacaoExecucao liquidacao;
    //campo para descricao;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private RecursoLiquidacaoExecucao Execucao;

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
