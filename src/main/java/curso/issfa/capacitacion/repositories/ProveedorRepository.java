package curso.issfa.capacitacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import curso.issfa.capacitacion.models.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long>{
    
}
