public class Procedimento {
    private String nome;
    private int duracaoMinutos;
    private double precoPorSessao;

    public Procedimento(String nome, int duracao, double preco) {
        this.nome = nome;
        this.duracaoMinutos = duracao;
        this.precoPorSessao = preco;
    }

    public int getDuracaoMinutos() {
        return this.duracaoMinutos;
    }

    public double getPrecoPorSessao() {
        return this.precoPorSessao;
    }
}