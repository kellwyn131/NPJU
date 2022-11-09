package br.com.uniamerica.npju.repository;

import br.com.uniamerica.npju.Entity.Adm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministradorRepository extends JpaRepository<Adm, Long> {

    public List<Adm> findByAtivoTrue();
}
