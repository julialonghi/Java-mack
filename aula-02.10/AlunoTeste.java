public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("julia");
        Aluno aluno2 = new Aluno("ana", 10, 8);

        aluno2.calculaMedia();
        System.out.printf("\nMédia: %.2f\n", aluno2.media);

    }
}