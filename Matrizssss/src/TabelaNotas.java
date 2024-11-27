import java.awt.*;
import java.util.Scanner;

public class TabelaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] notas = new String[5][5];
        notas[0][0] = "Aluno";
        notas[0][1] = "Etapa 1";
        notas[0][2] = "Etapa 2";
        notas[0][3] = "Etapa 3";
        notas[0][4] = "Média";

        percorrerMatriz(notas);

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas.length; j++) {
                if (j == 0) {
                    System.out.println("Digite o nome do Aluno");
                    notas[i][j] = input.nextLine();
                }
                if (j == 1) {
                    System.out.println("Digite a nota da Etapa 1");
                    notas[i][j] = input.nextLine();
                }
                if (j == 2) {
                    System.out.println("Digite a nota da Etapa 2");
                    notas[i][j] = input.nextLine();
                }
                if (j == 3) {
                    System.out.println("Digite a nota da Etapa 3");
                    notas[i][j] = input.nextLine();
                }
            }
        }
    }
    public static void percorrerMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void calcularMedias(String[][] matriz) {
        for (int i = 1; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 1; j < matriz.length; j++) {
                int valor = Integer.valueOf(matriz[i][j]);
                soma += valor;

            }
            matriz[i][4] = String.valueOf(soma/3);
        }
    }
    public static void printMaiorNota(String[][] matriz) {
        int maiorNota = 1;
        String Aluno = "";
        String Etapa = "";


    }
}
