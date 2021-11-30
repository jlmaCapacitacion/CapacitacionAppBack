package curso.issfa.capacitacion.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.issfa.capacitacion.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
//    List<Producto> findByDescripcion(String descripcion);
    List<Producto> findByDescripcionContains(String descripcion);
}
