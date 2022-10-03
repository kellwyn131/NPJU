package br.com.uniamerica.npju.Entity;

import lombok.Getter;
import lombok.Setter;

public class Assistido extends AbstractEntity {

    private String nome;

    public Assistido(String nome, String cpf, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
// @Getter @Setter
   private RegistroNacional registroNacional;
   @Getter @Setter
   private String cpf;
   @Getter @Setter
   private String telefone;
   //@Getter @Setter
   private Endereco endereco;
   //@Getter @Setter
    private EstadoCivil estadoCivil;
    private boolean uniaoEstavel;
}
