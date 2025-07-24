package exercicios.Matrizes;

public class ExMatriz02 {
    public static void main(String[] args) {
        String[][] meses = criarMatrizMeses();
        imprimirMatrizMeses(meses);
    }

    // Função que cria a matriz 3x4 com os meses do ano
    public static String[][] criarMatrizMeses() {
        String[][] matriz = new String[3][4];

        String[] nomesDosMeses = {
                "Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        int indice = 0;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                matriz[linha][coluna] = nomesDosMeses[indice];
                indice++;
            }
        }
return matriz;
    }

    // Função que imprime a matriz
    public static void imprimirMatrizMeses(String[][] matriz) {
        System.out.println("Matriz dos meses do ano (3x4):");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println(); // quebra de linha
        }
    }
}
