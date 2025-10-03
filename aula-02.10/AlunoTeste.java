public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("julia");
        Aluno aluno2 = new Aluno("ana", 10, 8);

        System.out.printf("Nome do aluno1: %s\n", aluno.getNome());
        System.out.printf("Média do aluno %s: %.2f\n", aluno2.getNome(), aluno2.calculaMedia());
    }
}