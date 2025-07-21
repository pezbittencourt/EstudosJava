package exercicios;
import java.util.Scanner;
public class ExVetores02 {
    public static void main(String[] args) {
        /*
        Pedir para o usuário ditar quantas casa terão no vetor, pedir para que ele escolha um dos numeros selecionados e então encontrar a casa em que o valor se encontra;
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("quantas posições você deseja que o vetor tenha?");
        int i = scanner.nextInt();
        int vetor[] = new int[i];

        System.out.println("Por favor, agora insira os valores que o vetor deverá ter");
        for (int v = 0; v < i; v++) {
            System.out.println("vetor [" + v + "] = ");
            vetor[v] = scanner.nextInt();
        }
        System.out.println("qual valor voce deseja encontrar no vetor?");
        int valorDesejado = scanner.nextInt();

        boolean encontrado = false;
        for (int v = 0; v < vetor.length; v++) {
            if (vetor[v] == valorDesejado) {
                System.out.println("O valor " + valorDesejado + " está na posição " + v);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("O valor " + valorDesejado + " não foi encontrado no vetor.");
        }
    scanner.close();
    }
}