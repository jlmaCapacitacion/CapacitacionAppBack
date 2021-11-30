package curso.issfa.capacitacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.issfa.capacitacion.models.Cliente;
import curso.issfa.capacitacion.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public List<Cliente> getAll(){
        return clienteRepository.findByEstado(1);
    }


    public Optional<Cliente> getById(long idCliente){
        return clienteRepository.findById(idCliente);
    }


    public Cliente guardar(Cliente cliente){
        cliente.setEstado(1);
        return clienteRepository.save(cliente);
    }

    public Cliente actualizar(long idCliente, Cliente clienteActualizado){
        Cliente clienteExistente = clienteRepository.getById(idCliente);
        clienteExistente.setNombre(clienteActualizado.getNombre());
        clienteExistente.setTelefono(clienteActualizado.getTelefono());
        clienteExistente.setCedula(clienteActualizado.getCedula());
        return clienteRepository.save(clienteExistente);
    }

    public void eliminar (Cliente cliente){
        cliente.setEstado(2);
        clienteRepository.save(cliente);
    }
}