import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int max;
        System.out.print("Digite o tamanho do vetor para ser ordenado: ");
        max = teclado.nextInt();
        int[] vetor = new int[max];
        System.out.println();
        System.out.println("Digite os numeros para o  vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextInt();
        }
        System.out.println("Vetor desordenado");
        for (int imprimir : vetor) {
            System.out.print("[" + imprimir + "]" + " ");
        }
        System.out.println();
        for (int i = 0; i < vetor.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int aux = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = aux;
            System.out.println();
            System.out.println("Vetor sendo ordenado a cada iteração " + (i + 1));
            for (int imprimir : vetor) {
                System.out.print("[" + imprimir + "]" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Vetor Ordenado");
        for (int imprimir : vetor) {
            System.out.print("[" + imprimir + "]" + " ");
        }
    }

}