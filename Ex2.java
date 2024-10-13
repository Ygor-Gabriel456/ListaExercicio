package ListaExercicio;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double sal,pen;
        
        System.out.println("Digite o seu salario");
        sal = leia.nextDouble();
        
        System.out.println("Digite o numero de pendencias");
        pen = leia.nextDouble();
        
        if(sal > 2500.00 && pen <= 2){
            System.out.println("Emprestimo aprovado");
        }else{
            System.out.println("Emprestimo não aprovado");
        }
    }
}
