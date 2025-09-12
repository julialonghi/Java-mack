import java.util.Scanner;

public class Atividade03 {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de estudantes: ");
        int numero = entrada.nextInt();
        int [] notas = criaVetor(numero);
        int media = calcularMediaTurma(notas);
        System.out.printf("Média das notas da turma: %d\n", media);
        imprimeResultados(notas);
    }
    public static int[] criaVetor(int numero) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[numero];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Nota %d: ", i + 1);
            vetor[i] = entrada.nextInt();
        }
        return vetor;
    }

    public static int calcularMediaTurma(int[] notas) {
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }
        return soma/notas.length;
    }

    public static void imprimeResultados(int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7) {
                System.out.printf("Aluno com nota %d: Aprovado\n", notas[i]);
            } else {
                System.out.printf("Aluno com nota %d: Reprovado\n", notas[i]);
            }
        }
        System.out.println();
    }
}