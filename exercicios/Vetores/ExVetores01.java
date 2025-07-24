package exercicios.Vetores;

public class ExVetores01 {
    public static void main(String[] args) {
/*
Crie um vetor de inteiro de 10 posições. Insira o número 5 em todas as posições.
 */
        int vetor[] = new int[10];
for (int i=0; i<vetor.length;i++){
    vetor[i] =5;
}

for(int i =0; i< vetor.length; i++){
    System.out.println(vetor[i]);
}

    }
}
