package academy.devdojo.maratonaJava.introducao.EstCond;
import java.util.Scanner; // Importa a classe Scanner

public class aula05EstCondicionais01 {
    public static void main(String[] args) {

       Scanner entrada = new Scanner(System.in); // Cria o scanner

        System.out.println("qual sua idade?");
        int idade = entrada.nextInt();
    boolean isMaiorDeIdade = idade >=18;
        if (isMaiorDeIdade){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }


    }

}
