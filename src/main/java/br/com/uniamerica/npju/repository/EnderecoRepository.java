package br.com.uniamerica.npju.repository;

import br.com.uniamerica.npju.Entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    public List<Endereco> findByAtivoTrue();

    @Query("select p from Endereco p where p.rua like %?1%")
    public List<Endereco> findByNome(final String nome);
}
