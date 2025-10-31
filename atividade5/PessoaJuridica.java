public class PessoaJuridica extends Contribuinte {
    public PessoaJuridica (String nome, double renda) {
        super(nome, renda);
    }

    @Override
    public double calculaImposto() {
        return 0.10 * getRenda();
    }
}