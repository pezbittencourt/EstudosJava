package exercicios;
import java.util.Scanner;
public class ExLacoDeRepeticao03 {
    public static void main(String[] args) {
        /*
Escreva um programa que solicita 5 números ao usuário, e para cada número digitado, informa se este é par ou ímpar.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 números separados por espaço:");
        String linha = scanner.nextLine(); // lê a linha completa
        String[] numerosStr = linha.split(" "); // separa por espaço

        for(int i = 0; i < numerosStr.length; i++) {
            int numero = Integer.parseInt(numerosStr[i]);
            if (numero % 2 == 0) {
                System.out.println(numero + " é par");
            } else {
                System.out.println(numero + " é ímpar");
            }
        }
    }
}