package br.com.uniamerica.npju.service;

import br.com.uniamerica.npju.Entity.Administrador;
import br.com.uniamerica.npju.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService {

    @Autowired
    public AdministradorRepository administradorRepository;

    public void atualizar(final Long id, final Administrador administrador){
        if (id.equals(administrador.getId()) && !this.administradorRepository.findById(id).isEmpty()) {
            this.administradorRepository.save(administrador);
        } else {
            throw new RuntimeException("id não encontrado");
            //return ResponseEntity.badRequest().body("Id não encontrado"); gerado a excessão de execução acima
        }
    }

    public void excluir(final Long id, final Administrador administrador){
        if (id.equals(administrador.getId()) && !this.administradorRepository.findById(id).isEmpty()) {
            this.administradorRepository.delete(administrador);
        } else {
            throw new RuntimeException("Id não encontrado");
            //return ResponseEntity.badRequest().body("Id nãoe encontrado");
        }
    }


}
