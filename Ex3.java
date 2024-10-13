package ListaExercicio;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double vo,descon,vfc;
        
        System.out.println("Digite o valor da compra");
        vo = leia.nextDouble();
        
        descon = vo * 0.10;
        
        vfc = vo - descon;
        
        System.out.println("O total de desconto foi de RS: " + descon);
        System.out.println("O valor da compra com o desconto é: " + vfc);
        
    }
}
