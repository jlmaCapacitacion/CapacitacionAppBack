package curso.issfa.capacitacion.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Practica01 {
    public void imprimirNumeros(){
        for (int i=1; i<=100; i++){
            System.out.println("");
            System.out.print(i+":");
            if((i%3)==0)
                System.out.print("Fizz");
            if((i%5)==0)
                System.out.print("Buzz");
            }
    }
}