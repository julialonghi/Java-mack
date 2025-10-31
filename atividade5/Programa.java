public class Programa {
    public static void main(String[] args) {
        PessoaFisica p1 = new PessoaFisica("joao", 2500);
        PessoaFisica p2 = new PessoaFisica("maria", 1450);
        PessoaJuridica p3 = new PessoaJuridica("ana", 3230);
        PessoaJuridica p4 = new PessoaJuridica("pedro", 1250);

        Contribuintes lista = new Contribuintes();

        lista.adicionaContribuinte(p1);
        lista.adicionaContribuinte(p2);
        lista.adicionaContribuinte(p3);
        lista.adicionaContribuinte(p4);

        lista.apresentaContribuintes();
    }
}