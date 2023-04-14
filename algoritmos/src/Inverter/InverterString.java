package Inverter;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String palavra;

        System.out.println("Digite uma palavra");
        palavra = leitor.next();

        char[] letras = new char[palavra.length()];
        int posicao = palavra.length()-1;

        for(int i= 0; i< letras.length; i++){
            letras[i] = palavra.charAt(posicao -i);
            System.out.print(letras[i]);
        }
    }
}
