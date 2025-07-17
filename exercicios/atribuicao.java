package exercicios;
import java.util.Scanner;
public class atribuicao {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int area;
        System.out.println("insira a base do quadrado");
        int base = scanf.nextInt();

        System.out.println("insira a altura do quadrado");
        int altura = scanf.nextInt();


        area = (base * altura) / 2;
        System.out.println("a área do quadrado é de "+area + " metros quadrados");
    }

}
