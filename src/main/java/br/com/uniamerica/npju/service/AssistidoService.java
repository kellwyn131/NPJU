package br.com.uniamerica.npju.service;

import br.com.uniamerica.npju.Entity.Assistido;
import br.com.uniamerica.npju.repository.AssistidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssistidoService {

    @Autowired
    public AssistidoRepository assistidoRepository;

    public void atualizar(final Long id, final Assistido assistido){
        if (id.equals(assistido.getId()) && !this.assistidoRepository.findById(id).isEmpty()) {
            this.assistidoRepository.save(assistido);
        } else {
            throw new RuntimeException("id não encontrado");
        }
    }

    public void excluir(final Long id, final Assistido assistido){
        if (id.equals(assistido.getId()) && !this.assistidoRepository.findById(id).isEmpty()) {
            this.assistidoRepository.delete(assistido);
        } else {
            throw new RuntimeException("Id não encontrado");
            //return ResponseEntity.badRequest().body("Id nãoe encontrado");
        }
    }

}
