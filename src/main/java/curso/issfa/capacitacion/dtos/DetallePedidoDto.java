package curso.issfa.capacitacion.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetallePedidoDto {
    private long   producto;
    private int    cantidad;
    private double precio;
}
