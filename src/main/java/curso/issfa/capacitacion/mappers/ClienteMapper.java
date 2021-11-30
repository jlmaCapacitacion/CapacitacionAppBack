package curso.issfa.capacitacion.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import curso.issfa.capacitacion.models.Cliente;

public class ClienteMapper implements RowMapper<Cliente>{
    @Override
    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException{
        Cliente cliente = new Cliente();
        cliente.setId(rs.getLong("id"));
        cliente.setNombre(rs.getString("nombre"));
//        cliente.setCedula(rs.getString("cedula"));
//        cliente.setDireccion(rs.getString("direccion"));
//        cliente.setTelefono(rs.getString("telefono"));

        return cliente;
    }
}
