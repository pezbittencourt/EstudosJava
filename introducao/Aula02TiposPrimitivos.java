package academy.devdojo.maratonaJava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long e boolean
        int ageFather = 49;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.00D;
        float salarioFloat = 2500F;
        byte idadeByte = 125;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';


        String nome = "Um puta texto grande aqui dentro";
        System.out.println("a idade do pai, dividida por 2, é "+ageFather/2 +" anos");
        System.out.println(falso);
        System.out.println(nome);
    }
}
