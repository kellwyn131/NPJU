package br.com.uniamerica.npju.repository;

import br.com.uniamerica.npju.Entity.Assistido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssistidoRepository extends JpaRepository<Assistido, Long> {

}
