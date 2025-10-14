public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private int quantidadeEstoque;

    public Produto(String nome, double precoCusto, double precoVenda, int quantidadeEstoque) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        if (precoVenda > precoCusto) {
            this.precoVenda = precoVenda;
        } else {
            System.out.println("O preço da venda não pode ser menor que o preço de custo");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    
}
