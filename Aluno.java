public class Aluno {
    private String nome;
    private float nota1;
    private float nota2;
    private float media;

    public Aluno() { }

    public Aluno(String n, float n1, float n2) {
        this.nome = n;
        this.nota1 = n1;
        this.nota2 = n2;
    }

    public String getNome() { return this.nome; }

    public float getNota1() { return this.nota1; }

    public float getNota2() { return this.nota2; }

    public void setNome(String nome) { this.nome = nome; }

    public void serNota1(float n1) { this.nota1 = n1; }

    public void setNome(float n2) { this.nota2 = n2; }

    public void calculaMedia() {
        this.media = (nota1 + nota2) / 2;
    }

    public String achaMaiorNota1(Aluno a2, Aluno a3) {
        if (this.nota1 > a2.nota1 && this.nota1 > a3.nota1) {
            String mensagem = String.format("a nota do aluno %s é maior", this.nome);
            return mensagem;
        } else if (a2.nota1 > this.nota1 && a2.nota1 > a3.nota1) {
            String mensagem = String.format("a nota do aluno %s é maior", a2.nome);
            return mensagem;
        } else {
            String mensagem = String.format("a nota do aluno %s é maior", a3.nome);
            return mensagem;
        }
    }

    public float mediaTurma(Aluno a2, Aluno a3) {
        return (this.media + a2.media + a3.media)/3;
    }

    public boolean statusAprovReprov() {
        if (this.media >= 6) {
            return true;
        } else {
            return false;
        }
    }
}
