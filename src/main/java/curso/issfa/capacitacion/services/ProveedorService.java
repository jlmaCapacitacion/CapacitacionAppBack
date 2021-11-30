package curso.issfa.capacitacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.issfa.capacitacion.models.Proveedor;
import curso.issfa.capacitacion.repositories.ProveedorRepository;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository proveedorRepository;

    public List<Proveedor> getAll(){
        return proveedorRepository.findAll();
    }

    public Optional<Proveedor> getById(long idProveedor){
        return proveedorRepository.findById(idProveedor);
    }


    public Proveedor guardar(Proveedor proveedor){
        return proveedorRepository.save(proveedor);
    }

    public Proveedor actualizar(Proveedor proveedor, Proveedor proveedorNuevo){
        proveedor.setNombre(proveedorNuevo.getNombre());
        proveedor.setRuc(proveedorNuevo.getRuc());
        proveedor.setDireccion(proveedorNuevo.getDireccion());
        proveedor.setTelefono(proveedorNuevo.getTelefono());
        return proveedorRepository.save(proveedor);
    }

    public void eliminar(Proveedor proveedor){
        proveedorRepository.delete(proveedor);
    }

}
