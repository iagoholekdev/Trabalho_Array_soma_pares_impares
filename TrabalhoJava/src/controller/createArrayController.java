package controller;

import java.util.Scanner;
import consts.utils;

public class createArrayController {
    public void createArray() {
        int[][] matrizParesImpares = new int[10][7];

        createArrayController.preencherMatriz(matrizParesImpares);
        createArrayController.exibirMatriz(matrizParesImpares);

        int pares          = createArrayController.contarPares(matrizParesImpares);
        int impares        = createArrayController.contarImpares(matrizParesImpares);
        int totalElementos = matrizParesImpares.length * matrizParesImpares[utils.zero].length;

        double percentualPares   = (double) pares   / totalElementos * utils.cem;
        double percentualImpares = (double) impares / totalElementos * utils.cem;

        System.out.println(utils.totalPares       + pares);
        System.out.println(utils.totalImpares     + impares);
        System.out.printf(utils.percentualPares   , percentualPares);
        System.out.printf(utils.percentualImpares , percentualImpares);
    }

    public static void preencherMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);

        for (int i = utils.zero; i < matriz.length; i++) {
            for (int j = utils.zero; j < matriz[utils.zero].length; j++) {
                System.out.println(utils.mensagemPadraoMatriz);
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void exibirMatriz(int[][] matriz) {
        System.out.println(utils.matriz);

        for (int[] ints : matriz) {
            for (int j = utils.zero; j < matriz[utils.zero].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static int contarPares(int[][] matriz) {
        int pares = utils.zero;

        for (int[] ints : matriz) {
            for (int j = utils.zero; j < matriz[0].length; j++) {
                if (ints[j] % utils.dois == utils.zero) {
                    pares++;
                }
            }
        }

        return pares;
    }

    public static int contarImpares(int[][] matriz) {
        int impares = utils.zero;

        for (int[] ints : matriz) {
            for (int j = utils.zero; j < matriz[utils.zero].length; j++) {
                if (ints[j] % utils.dois != utils.zero) {
                    impares++;
                }
            }
        }

        return impares;
    }
}