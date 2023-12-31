package school.sptech.projetotophair.domain.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.sptech.projetotophair.domain.empresa.Empresa;

import java.util.List;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
    List<Empresa> findByEnderecoEstado(String estado);
}
