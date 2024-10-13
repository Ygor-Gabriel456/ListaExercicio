package ListaExercicio;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       
        int menu;
        
        System.out.println("Boa noite, esse e o nosso Menu");
        System.out.println("n1-Hamburguer\n2-Cachorro-quente\n3-BatataFrita");
        menu = leia.nextInt();
        
        switch(menu){
        
            case 1:
                System.out.println("Voce escolheu Hamburguer");
                System.out.println("O preço a ser pago e: RS15,00");
                break;
            case 2:
                System.out.println("Voce escolheu Cachorro-quente");
                System.out.println("O preço a ser  pago e: RS25,50");
                break;
            case 3:
                System.out.println("Voce escolheu batata frita");
                System.out.println("o preco a ser pago e: R$5,99");
                break;
            default:
                System.out.println("Produto nao encontrado no menu.");
        }
         
    }
}
