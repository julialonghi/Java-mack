public class PessoaFisica extends Contribuinte {
    public PessoaFisica(String nome, double renda) {
        super(nome, renda);
    }

    @Override
    public double calculaImposto() {
        if (getRenda() <= 1500) {
            return 0.0;
        } else if (getRenda() >= 1500.01 && getRenda() <= 3000) {
            return (0.075 * getRenda()) - 100;
        } else {
            return (0.15 * getRenda()) - 225;
        }
    }
}