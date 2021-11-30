package curso.issfa.capacitacion.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.issfa.capacitacion.dtos.DetallePedidoDto;
import curso.issfa.capacitacion.dtos.PedidoDto;
import curso.issfa.capacitacion.models.Cliente;
import curso.issfa.capacitacion.models.DetallePedido;
import curso.issfa.capacitacion.models.Pedido;
import curso.issfa.capacitacion.models.Producto;
import curso.issfa.capacitacion.repositories.DetallePedidoRepository;
import curso.issfa.capacitacion.repositories.PedidoRepository;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    @Transactional
    public Pedido guardar(Pedido pedido, List<DetallePedido> detalles) {
         Pedido pedidoAlmacenado = pedidoRepository.save(pedido); 
         
         for(DetallePedido tmp : detalles){
             tmp.setPedido(pedidoAlmacenado);
             detallePedidoRepository.save(tmp);
         }  
         return pedidoAlmacenado;
    }

    @Transactional
    public Pedido guardarDto(PedidoDto pedidoDto) {
        
        Pedido pedido = new Pedido();
        pedido.setFecha(new Date());
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
        return guardar(pedido, detallesEntidades);
    }
}
