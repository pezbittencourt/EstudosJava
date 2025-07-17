package academy.devdojo.maratonaJava.introducao.EstCond;
import java.util.Scanner;
public class AulaEstCondicionais02 {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.println("Me diga sua idade e lhe direi se é maior ou menor de idade");
        int idade = scanf.nextInt();
        String MaiorMenor = idade >= 18 ? "maior de idade": "menor de idade";
        System.out.println(MaiorMenor);
    }

}
