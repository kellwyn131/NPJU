package br.com.uniamerica.npju.controller;

import br.com.uniamerica.npju.Entity.Endereco;
import br.com.uniamerica.npju.repository.EnderecoRepository;
import br.com.uniamerica.npju.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/endereco")
public class EnderecoController {

    @Autowired
    public EnderecoRepository enderecoRepository;

    @Autowired
    public EnderecoService enderecoService;


    @GetMapping
    public ResponseEntity<List<Endereco>> findByAtivoTrue(){
        return ResponseEntity.ok().body(this.enderecoRepository.findByAtivoTrue());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok().body(this.enderecoRepository.findById(id));
    }
    //filtro para nome
    /*@GetMapping("/nome")
    //faz uma requesição com filtro, no repositorio foi criado uma LIST para estado e aqui está sendo feita a porta para requesição
    public ResponseEntity<List<Endereco>> findAll(
            @RequestParam("nome") final String nome) {
        return ResponseEntity.ok().body(this.enderecoRepository.findByNome(nome));
    }*/

    /*@GetMapping("/filtro")
    public List<Endereco> findEnderecoByNome(@RequestParam("nome")String nome){
        return ResponseEntity.ok().body(this.enderecoRepository.findByNome(nome)).getBody();
    }*/

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody final Endereco endereco) {   //quando não sabe o que vai retornar
        this.enderecoRepository.save(endereco);
        return ResponseEntity.ok().body("Registro cadastrado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(
            @PathVariable final Long id,
            @RequestBody final Endereco endereco
    ) {
        try{
            this.enderecoService.atualizar(id, endereco);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Registrado atualizado com sucesso");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluir(
            @PathVariable final Long id,
            @RequestBody final Endereco endereco
    ) {
        try {
            this.enderecoService.excluir(id, endereco);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Registro excluido com sucesso");
    }

}
