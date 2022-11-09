package br.com.uniamerica.npju.repository;

import br.com.uniamerica.npju.Entity.Endereco;
import br.com.uniamerica.npju.Entity.Processo;
import org.apache.tomcat.jni.Proc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long> {
    public List<Processo> findByAtivoTrue();
}
