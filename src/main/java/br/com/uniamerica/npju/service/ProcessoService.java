package br.com.uniamerica.npju.service;

import br.com.uniamerica.npju.Entity.Endereco;
import br.com.uniamerica.npju.Entity.Processo;
import br.com.uniamerica.npju.repository.ProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessoService {

    @Autowired
    public ProcessoRepository processoRepository;

    public void atualizar(final Long id, final Processo processo){
        if (id.equals(processo.getId()) && !this.processoRepository.findById(id).isEmpty()) {
            this.processoRepository.save(processo);
        } else {
            throw new RuntimeException("id não encontrado");
        }
    }

    public void excluir(final Long id, final Processo processo){
        if (id.equals(processo.getId()) && !this.processoRepository.findById(id).isEmpty()) {
            this.processoRepository.delete(processo);
        } else {
            throw new RuntimeException("Id não encontrado");
            //return ResponseEntity.badRequest().body("Id nãoe encontrado");
        }
    }

}
