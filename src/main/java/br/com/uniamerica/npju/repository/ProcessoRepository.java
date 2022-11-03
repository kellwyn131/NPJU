package br.com.uniamerica.npju.repository;

import br.com.uniamerica.npju.Entity.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long> {

}
