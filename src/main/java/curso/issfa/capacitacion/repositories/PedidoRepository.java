package curso.issfa.capacitacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import curso.issfa.capacitacion.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}
