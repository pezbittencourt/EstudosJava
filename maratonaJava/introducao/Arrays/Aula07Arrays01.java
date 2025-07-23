package academy.devdojo.maratonaJava.introducao.Arrays;

public class Aula07Arrays01 {
    public static void main(String[] args) {

        String nomes[] = new String[3];
        nomes[0] ="fuleco";
        nomes[1] ="fulequinha";
        nomes[2] ="casal de fulecos";

        for (int i = 0; i< nomes.length; i++){
            System.out.println(nomes[i]);

        }

    }
}
