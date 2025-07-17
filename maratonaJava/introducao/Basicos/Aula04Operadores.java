package academy.devdojo.maratonaJava.introducao.Basicos;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10, numero2 = 20;
        double resultado = numero1 / (double) numero2;
        System.out.println("valor final: "+ resultado);


        // %;
        int resto = 21 % 2;
        System.out.println(resto);

    // < > <= >= == != retornam valores booleanos;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte "+isDezIgualAVinte);
        System.out.println("isDezIgualDez " +isDezIgualDez);
        System.out.println("isDezDiferenteDez " +isDezDiferenteDez);


        // && (And)  || (or) !
        int idade = 31;
        float salario  = 8000F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >=3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


    }
}
