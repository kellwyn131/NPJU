package br.com.uniamerica.npju.repository;

import br.com.uniamerica.npju.Entity.Assistido;
import br.com.uniamerica.npju.Entity.ControleEstagiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssistidoRepository extends JpaRepository<Assistido, Long> {
    public List<Assistido> findByAtivoTrue();
}
