package br.com.uniamerica.npju.service;

import br.com.uniamerica.npju.Entity.Adm;
import br.com.uniamerica.npju.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService {

    @Autowired
    public AdministradorRepository administradorRepository;

    public void atualizar(final Long id, final Adm adm){
        if (id.equals(adm.getId()) && !this.administradorRepository.findById(id).isEmpty()) {
            this.administradorRepository.save(adm);
        } else {
            throw new RuntimeException("id não encontrado");
        }
    }

    public void excluir(final Long id, final Adm adm){
        if (id.equals(adm.getId()) && !this.administradorRepository.findById(id).isEmpty()) {
            this.administradorRepository.delete(adm);
        } else {
            throw new RuntimeException("Id não encontrado");
            //return ResponseEntity.badRequest().body("Id nãoe encontrado");
        }
    }


}
