package br.com.uniamerica.npju.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

public class Processo extends AbstractEntity{
    private Assistido assistido;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private Hipossuficiencia hipossuficiencia;
    @Getter @Setter
    private Estagiario estagiario;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private CartaConvite cartaConvite; // é um documento em que um residente legal no país assume a responsabilidade pela chegada e hospedagem de uma pessoa.
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private Mediacao mediacao; //???demandante quer a opção MARCADA com data, como fazer ? não será mais enum?
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private EncaminhadoParaProtocolo encaminhadoParaProtocolo;
    private String processoMediacao; //campo para numero do processo
    private String processoJudicial; // campo para numero do processo
    private boolean procuracao;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private PeçaInicial peçaInicial;
    private String juizo;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private Professores professores; // ??? pegar nomes
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private AudienciaMarcada audienciaMarcada;  // campo para data no MARCADA
    private boolean clienteCienteDaAudiencia;
    //campo para descrição
    private boolean outraParteIntimada;
    private String Encaminhamento;
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
    private boolean arquivado;
    //CLASSE PASTA - 2 caixas para seleção, "criar" e "criada" com campo para descrição da localização da pasta
}
