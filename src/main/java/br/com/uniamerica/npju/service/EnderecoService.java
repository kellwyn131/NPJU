package br.com.uniamerica.npju.service;

import br.com.uniamerica.npju.Entity.Assistido;
import br.com.uniamerica.npju.Entity.Endereco;
import br.com.uniamerica.npju.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    public EnderecoRepository enderecoRepository;

    public void atualizar(final Long id, final Endereco endereco){
        if (id.equals(endereco.getId()) && !this.enderecoRepository.findById(id).isEmpty()) {
            this.enderecoRepository.save(endereco);
        } else {
            throw new RuntimeException("id não encontrado");
        }
    }

    public void excluir(final Long id, final Endereco endereco){
        if (id.equals(endereco.getId()) && !this.enderecoRepository.findById(id).isEmpty()) {
            this.enderecoRepository.delete(endereco);
        } else {
            throw new RuntimeException("Id não encontrado");
            //return ResponseEntity.badRequest().body("Id nãoe encontrado");
        }
    }

}
