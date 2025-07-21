package exercicios;
import java.util.Scanner;

public class ExLacoDeRepeticao02 {
    public static void main(String[] args) {
     /*
Escreva um programa que solicita 5 números ao usuário, e para cada número digitado, informa se este é par ou ímpar.
     */
        Scanner scanf = new Scanner(System.in);
        System.out.println("me diga um numero e eu direi se ele é par ou impar");
        int num = scanf.nextInt();
        if (num%2==0){
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
        for (int i = 1;i<5;i++){
        System.out.println("me diga outro numero e eu direi se é par ou impar");
           num= scanf.nextInt();
            if (num%2==0){
                System.out.println("par");
            } else {
                System.out.println("impar");
            }
        }


    }
}
