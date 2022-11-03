package br.com.uniamerica.npju.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_endereco", schema = "npju")
public class Endereco extends AbstractEntity{

    @Getter @Setter
    @Column(name = "rua", nullable = false, length = 100)
    private String rua;
    @Getter @Setter
    @Column(name = "bairro", nullable = false, length = 100)
    private String bairro;
    @Getter @Setter
    @Column(name = "numero", nullable = false, length = 10)
    private String numero;
    @Getter @Setter
    @Column(name = "cep", nullable = false, length = 10)
    private String cep;

    public Endereco(){

    }
}
