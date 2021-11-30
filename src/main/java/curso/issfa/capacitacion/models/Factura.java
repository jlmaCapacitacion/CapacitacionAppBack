package curso.issfa.capacitacion.models;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Factura {
    private Date   fecha;
    private double total;
    final String valorConstante = "VALOR_CONSTANTE";
    
    public double calcularImpuesto(){
        return this.total+1.15;
    }
}
