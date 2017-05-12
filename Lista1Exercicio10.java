package lista1exercicio10;

import java.util.Scanner;

public class Lista1Exercicio10 {

    public static void main(String[] args) {
     
        System.out.println("Programa para trocar os valores das variaveir A e B ");
        
       int  A,B,C;
        
        System.out.println("Digite um valor que ira para a variavel A");
        Scanner teclado = new Scanner(System.in);
        A = teclado.nextInt();
        System.out.println("Digite um valor que ira para a variavel B");
        B = teclado.nextInt();
        
        C = A;
        A = B;
        B = C;
        
        System.out.println("O valor de A se torna: "+A);
        System.out.println("O valor de B se torna: "+B);
        
        
    }
    
}
