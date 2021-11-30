package curso.issfa.capacitacion.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.issfa.capacitacion.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    Cliente findByCedula(String cedula);
    List<Cliente> findByNombre(String nombre);
    List<Cliente> findByEstado(int estado);
}
