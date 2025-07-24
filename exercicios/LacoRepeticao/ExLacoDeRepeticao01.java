/*
 Escreva um programa que exibe qualquer tabuada completa. O programa deve perguntar ao usuário qual tabuada ele deseja visualizar, que irá responder digitando um número de 1 a 10.
 */

package exercicios.LacoRepeticao;
import java.util.Scanner;

public class ExLacoDeRepeticao01 {
    public static void main(String[] args) {

Scanner scanf = new Scanner (System.in);

        System.out.println("insira um numero e darei a tabuada deste numero");
        int  num = scanf.nextInt();

        for (int x=0;x<=10;x++){
           int y = num*x;
            System.out.println(num + " X " + x + " = "+ y );

        }


    }
}
