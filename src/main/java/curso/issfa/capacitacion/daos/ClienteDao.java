package curso.issfa.capacitacion.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import curso.issfa.capacitacion.mappers.ClienteMapper;
import curso.issfa.capacitacion.models.Cliente;
@Component
public class ClienteDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Cliente getById(long id){
        String query = "SELECT ID, NOMBRE FROM CLIENTE WHERE ID = " + id;
        Cliente cliente = jdbcTemplate.queryForObject(query, new ClienteMapper());
        return cliente;
    }
}
