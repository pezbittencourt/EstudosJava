package exercicios.Vetores;

public class ExVetores03 {
    //Vetor dentro de outro vetor
    public static void main(String[] args) {
        int vetor[] = {2,0,3,9};
                vetor[vetor[2]] = vetor[vetor[1]];
for (int i: vetor){
    System.out.println(i);
}

    }
}
