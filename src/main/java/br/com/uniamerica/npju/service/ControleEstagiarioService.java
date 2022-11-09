package br.com.uniamerica.npju.service;

import br.com.uniamerica.npju.Entity.ControleEstagiario;
import br.com.uniamerica.npju.Entity.Endereco;
import br.com.uniamerica.npju.repository.ControleEstagiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControleEstagiarioService {

    @Autowired
    public ControleEstagiarioRepository controleEstagiarioRepository;

    public void atualizar(final Long id, final ControleEstagiario controleEstagiario) {
        if (id.equals(controleEstagiario.getId()) && !this.controleEstagiarioRepository.findById(id).isEmpty()) {
            this.controleEstagiarioRepository.save(controleEstagiario);
        } else {
            throw new RuntimeException("id não encontrado");
        }
    }

    public void excluir(final Long id, final ControleEstagiario controleEstagiario){
        if (id.equals(controleEstagiario.getId()) && !this.controleEstagiarioRepository.findById(id).isEmpty()) {
            this.controleEstagiarioRepository.delete(controleEstagiario);
        } else {
            throw new RuntimeException("Id não encontrado");
            //return ResponseEntity.badRequest().body("Id nãoe encontrado");
        }
    }

}
