package curso.issfa.capacitacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.issfa.capacitacion.models.Producto;
import curso.issfa.capacitacion.repositories.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAll(){
        return productoRepository.findAll();
    }

    public Optional<Producto> getById(long idProducto){
        return productoRepository.findById(idProducto);
    }

    public Producto guardar(Producto producto){
        return productoRepository.save(producto);
    }

    public Producto actualizar(Producto producto, Producto productoNuevo){
        producto.setProveedor(productoNuevo.getProveedor());
        producto.setDescripcion(productoNuevo.getDescripcion());
        producto.setPrecio(productoNuevo.getPrecio());
        return productoRepository.save(producto);
    }

    public void eliminar(Producto producto){
        productoRepository.delete(producto);
    }

}
