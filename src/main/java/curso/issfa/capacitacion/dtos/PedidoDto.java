package curso.issfa.capacitacion.dtos;

import java.util.List;

import lombok.Data;

@Data
public class PedidoDto {
    private long cliente;
    private List<DetallePedidoDto> detalles;

    public double getSubtotal(){
        double subtotal = 0;
        for (DetallePedidoDto tmp : detalles){
            subtotal = subtotal + (tmp.getPrecio()*tmp.getCantidad());
        }
        return subtotal;
    }
}
