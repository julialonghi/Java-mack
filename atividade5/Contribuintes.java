import java.util.ArrayList;
public class Contribuintes {
    ArrayList<Contribuinte> contribuintes;

    public Contribuintes() {
        contribuintes = new ArrayList<Contribuinte>();
    }
    
    public void adicionaContribuinte(Contribuinte c) {
        contribuintes.add(c);
    }

    public void apresentaContribuintes() {
        System.out.print("***** Lista de Contribuintes *****");
        for (Contribuinte c : contribuintes) {
            System.out.printf("\nNome: %s", c.getNome());
            System.out.printf("\nValor do imposto de renda: %.2f\n", c.calculaImposto());
            System.out.print("-----------------------------------");
        }
    }
}