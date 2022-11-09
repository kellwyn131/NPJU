package br.com.uniamerica.npju.controller;

import br.com.uniamerica.npju.Entity.Adm;
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
    public ResponseEntity<List<Adm>> findByAtivoTrue(){
        return ResponseEntity.ok().body(this.administradorRepository.findByAtivoTrue());
    }

   /* @GetMapping
    public ResponseEntity<List<Administrador>> findByAtivoTrue() {
        return ResponseEntity.ok().body(this.administradorRepository.findByAtivoTrue());   //ok força que seja 200(tudo certo com a requesição), e colocou no formato json
    }*/

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok().body(this.administradorRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody final Adm adm) {   //quando não sabe o que vai retornar
        this.administradorRepository.save(adm);
        return ResponseEntity.ok().body("Registro cadastrado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(
            @PathVariable final Long id,
            @RequestBody final Adm adm
    ) {
        try{
            this.administradorService.atualizar(id, adm);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Registrado atualizado com sucesso");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluir(
            @PathVariable final Long id,
            @RequestBody final Adm adm
    ) {
        try {
            this.administradorService.excluir(id, adm);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Registro excluido com sucesso");
    }

}
