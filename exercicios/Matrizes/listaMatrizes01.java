package exercicios.Matrizes;

public class listaMatrizes01 {
    // Crie uma matriz 3x3 de números inteiros,
    // associe o valor 9 ao elemento central desta matriz. Exiba a matriz na tela de forma adequada.

    public static void main(String[] args) {
final int linha = 3;
final int coluna = 3;
        int mtz[][] = new int[linha][coluna];

        for (int i=0;i<linha;i++){
            for(int j=0;j<coluna;j++){
                mtz[i][j] = 9;
            }
        }

        int linhacentral = mtz.length/2;
        int colunacentral = mtz[0].length/2;
mtz [linhacentral][colunacentral] = 0;

        for (int i=0;i< mtz.length;i++){
            for(int j=0;j< mtz[i].length;j++){
                System.out.printf(mtz[i][j] + " ");
            }
            System.out.printf("%n");
        }


    }
}
