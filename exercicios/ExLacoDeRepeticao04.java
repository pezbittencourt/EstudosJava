package exercicios;
import java.util.Scanner;
public class ExLacoDeRepeticao04 {
    public static void main(String[] args){
    /*
   Solicite que o usuário digite um número entre 10 e 20. Se for digitado um numero inválido, peça novamente, até que ele digite um número correto.
*/
        Scanner scanner = new Scanner (System.in);
        int i;

        do {
            System.out.println("Digite um numero entre 10 e 20");
            i = scanner.nextInt();

            if (i < 10 || i > 20) {
                System.out.println("Numero invalido, tente novamente:");
            }
        } while (i < 10 || i > 20);
        System.out.println("O número "+i+" é válido!");
    scanner.close();
    }
    }

