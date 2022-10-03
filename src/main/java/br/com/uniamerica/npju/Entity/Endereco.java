package br.com.uniamerica.npju.Entity;

import lombok.Getter;
import lombok.Setter;

public class Endereco extends AbstractEntity{
    public Endereco(String rua, String bairro, String numero){
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }
    @Getter @Setter
    private String rua;
    @Getter @Setter
    private String bairro;
    @Getter @Setter
    private String numero;
    @Getter @Setter
    private String cep;
}
