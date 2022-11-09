package br.com.uniamerica.npju.controller;

import br.com.uniamerica.npju.Entity.ControleEstagiario;
import br.com.uniamerica.npju.repository.ControleEstagiarioRepository;
import br.com.uniamerica.npju.service.ControleEstagiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/controleEstagiario")
public class ControleEstagiarioController {

    @Autowired
    public ControleEstagiarioRepository controleEstagiarioRepository;

    @Autowired
    public ControleEstagiarioService controleEstagiarioService;

    @GetMapping
    public ResponseEntity<List<ControleEstagiario>> findByAtivoTrue(){
        return ResponseEntity.ok().body(this.controleEstagiarioRepository.findByAtivoTrue());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok().body(this.controleEstagiarioRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody final ControleEstagiario controleEstagiario) {   //quando não sabe o que vai retornar
        this.controleEstagiarioRepository.save(controleEstagiario);
        return ResponseEntity.ok().body("Registro cadastrado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(
            @PathVariable final Long id,
            @RequestBody final ControleEstagiario controleEstagiario
    ) {
        try{
            this.controleEstagiarioService.atualizar(id, controleEstagiario);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Registrado atualizado com sucesso");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluir(
            @PathVariable final Long id,
            @RequestBody final ControleEstagiario controleEstagiario
    ) {
        try {
            this.controleEstagiarioService.excluir(id, controleEstagiario);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Registro excluido com sucesso");
    }

}
