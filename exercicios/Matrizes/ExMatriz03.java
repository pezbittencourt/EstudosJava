package exercicios.Matrizes;
import java.security.SecureRandom;

public class ExMatriz03 {
    public static void main(String[] args) {
        criaVetor();



    }
    public static void criaVetor(){

      int l = new SecureRandom().nextInt(8);
      int c = new SecureRandom().nextInt(8);
        int v[][] = new int[l][c];
        for (int j = 0; j<l;j++){
            for (int y = 0; y<c; y++) {
                v[j][y] = new SecureRandom().nextInt(100);
                System.out.printf(v[j][y]+ " ");
            }
            System.out.printf("%n");

        }

    }

}
