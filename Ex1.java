package ListaExercicio;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double dtpd,consumo;
        
        System.out.println("Informe a distancia percorrida");
        dtpd = leia.nextDouble();
        
        System.out.println("Diga o consumo");
        consumo = leia.nextDouble();
        
        double resultado = dtpd / consumo;
        
        System.out.println("O consumo em média: " + resultado);
        
        
    }
}
