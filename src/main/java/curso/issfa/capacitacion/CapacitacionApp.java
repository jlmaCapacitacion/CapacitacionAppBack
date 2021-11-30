package curso.issfa.capacitacion;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import curso.issfa.capacitacion.models.Factura;
//import curso.issfa.capacitacion.models.Practica01;

@SpringBootApplication
public class CapacitacionApp {

	public static void main(String[] args) {
		Factura factura = new Factura();
		factura.setTotal(20);
		factura.setFecha(new Date());
		SpringApplication.run(CapacitacionApp.class, args);
		System.out.println("Ejecutando...");
/*
		System.out.println(factura);
		System.out.println(factura.calcularImpuesto());

//	Condicional
		String condicion;
		if(factura.getTotal()>20){
			condicion = "impuesto calculado";
		}
		else{
			condicion = "no calculado";
		}
		System.out.println(condicion);

// Estructura de repetición		
		for(int i=0; i<10;i++){
			System.out.println(i);
		}


// Practica01
		Practica01 ejemplo = new Practica01();
		ejemplo.imprimirNumeros();
		System.out.println("----------");
*/
	}
}