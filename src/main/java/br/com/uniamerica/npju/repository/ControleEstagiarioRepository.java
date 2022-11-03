package br.com.uniamerica.npju.repository;

import br.com.uniamerica.npju.Entity.ControleEstagiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControleEstagiarioRepository extends JpaRepository<ControleEstagiario, Long> {
}
