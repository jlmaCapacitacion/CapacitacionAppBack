package curso.issfa.capacitacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.issfa.capacitacion.dtos.PedidoDto;
import curso.issfa.capacitacion.models.Pedido;
import curso.issfa.capacitacion.services.PedidoService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
@CrossOrigin(origins = "http://localhost:8081")
public class PedidoController {
    
    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/v1/pedidos")
    public ResponseEntity<?> post(@RequestBody PedidoDto pedidoDto){
        log.info("Almacenando pedido "+pedidoDto);
        
        /*Pedido pedido = new Pedido();
        pedido.setFechaPedido(new Date());
        pedido.setSubtotal(pedidoDto.getSubtotal());
        Cliente cliente = new Cliente();
        cliente.setId(pedidoDto.getCliente());
        pedido.setCliente(cliente);
        List<DetallePedido> detallesEntidades = new ArrayList<>();
        for(DetallePedidoDto tmp : pedidoDto.getDetalles()){
            DetallePedido detallePedido = new DetallePedido();
            detallePedido.setPrecio(tmp.getPrecio());
            detallePedido.setCantidad(tmp.getCantidad());
            Producto producto = new Producto();
            producto.setId(tmp.getProducto());
            detallePedido.setProducto(producto);
            detallesEntidades.add(detallePedido);
        }
        Pedido pedidoAlmacenado = pedidoService.guardar(pedido, detallesEntidades);*/

        Pedido pedidoAlmacenado = pedidoService.guardarDto(pedidoDto);
        return ResponseEntity.ok(pedidoAlmacenado);
    }


}