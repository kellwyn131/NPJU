package br.com.uniamerica.npju.controller;

import br.com.uniamerica.npju.Entity.Assistido;
import br.com.uniamerica.npju.repository.AssistidoRepository;
import br.com.uniamerica.npju.service.AssistidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/assistido")
public class AssistidoController {

    @Autowired
    public AssistidoRepository assistidoRepository;

    @Autowired
    public AssistidoService assistidoService;

    @GetMapping
    public ResponseEntity<List<Assistido>> findByAtivoTrue(){
        return ResponseEntity.ok().body(this.assistidoRepository.findByAtivoTrue());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok().body(this.assistidoRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody final Assistido assistido) {   //quando não sabe o que vai retornar
        this.assistidoRepository.save(assistido);
        return ResponseEntity.ok().body("Registro cadastrado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(
            @PathVariable final Long id,
            @RequestBody final Assistido assistido
    ) {
        try{
            this.assistidoService.atualizar(id, assistido);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Registrado atualizado com sucesso");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluir(
            @PathVariable final Long id,
            @RequestBody final Assistido assistido
    ) {
        try {
            this.assistidoService.excluir(id, assistido);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Registro excluido com sucesso");
    }

}
