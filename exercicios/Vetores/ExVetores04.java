package exercicios.Vetores;

public class ExVetores04 {
    public static void main(String[] args) {

        imprimirMeses();
    }

    static void imprimirMeses() {
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        for (int i = 0; i < meses.length; i++) {
            System.out.println((i + 1) + " - " + meses[i]);
        }
    }
}





