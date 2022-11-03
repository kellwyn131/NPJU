package br.com.uniamerica.npju.repository;

import br.com.uniamerica.npju.Entity.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long> {

    public List<Administrador> findByAtivoTrue();
}
