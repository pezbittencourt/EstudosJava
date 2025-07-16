package exercicios;

import java.util.Scanner; // Importa a classe Scanner

public class SALARIO {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria o scanner

        System.out.println("Insira seu salário mensal: ");
        double salario = entrada.nextDouble(); // Lê o salário
double impostobaixo = 9.70 / 100;
double impostomedio = 37.35 / 100;
double impostoalto = 49.50 / 100;
    if (salario >= 0 && salario<= 34712) {
        salario = salario * impostobaixo;
    } else if (salario >=34713 && salario <= 68507) {
        salario = salario * impostomedio;
    } else {
        salario = salario * impostoalto;

    }
        System.out.println("seu imposto será de: "+ salario);
}
    }
