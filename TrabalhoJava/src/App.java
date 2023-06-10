
import controller.createArrayController;

public class App {
    /*
     * 8 - Elaborar um programa que leia uma matriz A de duas dimensões com dez
     * linhas e
     * sete colunas. Ao final, apresentar o total de elementos pares e ímpares
     * existentes na
     * matriz. Apresentar também o percentual de elementos pares e ímpares em
     * relação ao
     * total de elementos da matriz. Supondo a existência de 20 elementos pares e 50
     * elementos ímpares, haveria 28,6% de elementos pares e 71,4% de elementos
     * ímpares
     */
    public static void main(String[] args) {
        createArrayController arrayController = new createArrayController();
        arrayController.createArray();
    }
}
