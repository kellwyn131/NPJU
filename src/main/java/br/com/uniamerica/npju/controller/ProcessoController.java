package br.com.uniamerica.npju.controller;

import br.com.uniamerica.npju.Entity.Endereco;
import br.com.uniamerica.npju.Entity.Processo;
import br.com.uniamerica.npju.repository.ProcessoRepository;
import br.com.uniamerica.npju.service.ProcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/processo")
public class ProcessoController {

    @Autowired
    public ProcessoRepository processoRepository;

    @Autowired
    public ProcessoService processoService;

    @GetMapping
    public ResponseEntity<List<Processo>> findByAtivoTrue(){
        return ResponseEntity.ok().body(this.processoRepository.findByAtivoTrue());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok().body(this.processoRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody final Processo processo) {   //quando não sabe o que vai retornar
        this.processoRepository.save(processo);
        return ResponseEntity.ok().body("Registro cadastrado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(
            @PathVariable final Long id,
            @RequestBody final Processo processo
    ) {
        try{
            this.processoService.atualizar(id, processo);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Registrado atualizado com sucesso");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluir(
            @PathVariable final Long id,
            @RequestBody final Processo processo
    ) {
        try {
            this.processoService.excluir(id, processo);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Registro excluido com sucesso");
    }

}
