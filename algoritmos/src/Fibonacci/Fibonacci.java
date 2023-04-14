package Fibonacci;

/* Dado a sequência de Fibonacci, onde se inicia por 0 e 1
 e o próximo valor sempre será a soma dos 2 valores anteriores
 (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 escreva um programa na linguagem que desejar onde, informado um número,
 ele calcule a sequência de Fibonacci e retorne uma mensagem
 avisando se o número informado pertence ou não a sequência.
IMPORTANTE:
 Esse número pode ser informado através de qualquer entrada
 de sua preferência ou pode ser previamente definido no código;*/

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero=0;
        boolean contem =false;

        System.out.println("Informe um número");
        numero = leitor.nextInt();

        int[] sequencia = new int[numero+2]; //aumentando duas posições para evitar erros com números menores;
        sequencia[0] = 0;
        sequencia[1] = 1;

        for(int i=2; i< sequencia.length; i++){
            sequencia[i] = sequencia[i-1]+sequencia[i-2];
        }

        for(int i=0; i<sequencia.length; i++){
            if(sequencia[i]== numero){
                contem = true;
                break;
            }
        }

        if(contem == true){
            System.out.println("O número " +numero+ " está na sequência.");
        }else {
            System.out.println("O número " +numero+ " não está na sequência." );
        }

        for(int i=0; i< sequencia.length; i++){
            System.out.print(sequencia[i] + " ");
        }

    }
}
