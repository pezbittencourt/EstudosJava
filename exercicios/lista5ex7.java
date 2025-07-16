package exercicios;
import java.util.Scanner;
public class lista5ex7 {
    public static void main(String[] args) {
Scanner scanf = new Scanner (System.in);
        /*
        Crie um programa que desafia o usuário digitar um número maior que 40, que seja múltiplo de 5 e 7.
        Se ele conseguir, deve receber uma mensagem de parabéns.
         */

        System.out.println("desafio você a digitar um numero inteiro maior que 40 e múltiplo de 5 e de 7");
        int num = scanf.nextInt();
if (num > 40 && (num%5 == 0) && (num%7 == 0)){
    System.out.println("Parabéns, você conseguiu!");
} else {
    System.out.println("tente novamente");
}
    }
}
