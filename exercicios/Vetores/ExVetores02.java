package exercicios.Vetores;
import java.util.Scanner;
public class ExVetores02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas posições você deseja que o vetor tenha?");
        int tamanhoVetor = scanner.nextInt();
        int[] numeros = new int[tamanhoVetor];

        System.out.println("Por favor, agora insira os valores que o vetor deverá ter:");
        for (int indice = 0; indice < tamanhoVetor; indice++) {
            System.out.print("vetor[" + indice + "] = ");
            numeros[indice] = scanner.nextInt();
        }

        System.out.println("Qual valor você deseja encontrar no vetor?");
        int valorBuscado = scanner.nextInt();

        boolean encontrado = false;
        for (int indice = 0; indice < numeros.length; indice++) {
            if (numeros[indice] == valorBuscado) {
                System.out.println("O valor " + valorBuscado + " está na posição " + indice);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("O valor " + valorBuscado + " não foi encontrado no vetor.");
        }

        scanner.close();
    }
}
