package curso.issfa.capacitacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.issfa.capacitacion.models.DetallePedido;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long>{
    
}
