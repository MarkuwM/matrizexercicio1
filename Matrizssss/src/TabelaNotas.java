import java.util.Scanner;

public class TabelaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] notas = new String[5][5];
        notas[0][0] = "Aluno";
        notas[0][1] = "";
        notas[0][2] = "";
        notas[0][3] = "";
        notas[0][4] = "";
    }
    public static void percorrerMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
