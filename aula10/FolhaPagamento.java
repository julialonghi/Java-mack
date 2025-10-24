import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Funcionario> funcionarios;

    public FolhaPagamento() {
        funcionarios = new ArrayList<Funcionario>();
    }

    public void adicionaFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void listaFuncionarios() {
        System.out.println("*** Lista de Funcionários ***");
        for (Funcionario f : funcionarios) {
            double proventos = f.calculaProventos();
            System.out.printf("%-10s| R$ %5.2f\n", f.getNome(), proventos);
        }
    }
}