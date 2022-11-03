package br.com.uniamerica.npju.controller;

import br.com.uniamerica.npju.Entity.Administrador;
import br.com.uniamerica.npju.repository.AdministradorRepository;
import br.com.uniamerica.npju.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/administrador")
public class AdministradorController {

    @Autowired
    public AdministradorRepository administradorRepository;

    @Autowired
    public AdministradorService administradorService;

    @GetMapping
    public ResponseEntity<List<Administrador>> findAll() {
        return ResponseEntity.ok().body(this.administradorRepository.findByAtivoTrue());   //ok força que seja 200(tudo certo com a requesição), e colocou no formato json
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok().body(this.administradorRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody final Administrador administrador) {   //quando não sabe o que vai retornar
        this.administradorRepository.save(administrador);
        return ResponseEntity.ok().body("Registro cadastrado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(
            @PathVariable final Long id,
            @RequestBody final Administrador administrador
    ) {
        try{
            this.administradorService.atualizar(id, administrador);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Registrado atualizado com sucesso");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluir(
            @PathVariable final Long id,
            @RequestBody final Administrador administrador
    ) {
        try {
            this.administradorService.excluir(id, administrador);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Registro excluido com sucesso");
    }

}
