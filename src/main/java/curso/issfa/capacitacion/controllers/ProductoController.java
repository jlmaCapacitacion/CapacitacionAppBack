package curso.issfa.capacitacion.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.issfa.capacitacion.models.Producto;
import curso.issfa.capacitacion.services.ProductoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;

    @GetMapping("/v1/productos")
    public ResponseEntity<?> get(){
        return ResponseEntity.ok(productoService.getAll());
    }

    @PostMapping("/v1/productos")
    public ResponseEntity<?> post(@RequestBody Producto producto){
        Producto productoAlmacenado =  productoService.guardar(producto);
        return ResponseEntity.ok(productoAlmacenado);
    }

    @DeleteMapping("/v1/productos/{idProducto}")
    public ResponseEntity<?> delete(@PathVariable long idProducto){
       Optional<Producto> productoOptional =  productoService.getById(idProducto);
       if(productoOptional.isPresent()){
            productoService.eliminar(productoOptional.get());
            return ResponseEntity.ok("Registro eliminado");
       }else{
           return ResponseEntity.badRequest().body("No existe producto");
       }
    }
}