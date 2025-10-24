public class Programa {
    public static void main(String[] args) {
        FolhaPagamento fp = new FolhaPagamento();
        fp.adicionaFuncionario(new Funcionario("Ale", 1000));
        fp.adicionaFuncionario(new FuncionarioComissionado("Mignon", 1000, 7.5, 15000));
        fp.adicionaFuncionario(new FuncionarioProdutividade("Alex", 1000, 1.50, 750));
        fp.listaFuncionarios();
    }
}