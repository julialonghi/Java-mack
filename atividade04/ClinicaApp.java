public class ClinicaApp {
    public static void main(String[] args) {
        Procedimento p1 = new Procedimento("Drenagem Linfática", 40, 170.50);
        Procedimento p2 = new Procedimento("Laser Depilatório", 15, 120.50);
        Procedimento p3 = new Procedimento("Massagem Modeladora", 30, 180.00);

        Atendimento a1 = new Atendimento(p1, 2);
        Atendimento a2 = new Atendimento(p2, 10);
        Atendimento a3 = new Atendimento(p3, 5);

        PlanoTratamento plano = new PlanoTratamento();

        plano.adicionaAtendimento(a1);
        plano.adicionaAtendimento(a2);
        plano.adicionaAtendimento(a3);

        System.out.println("----- Sobre o Plano -----");
        System.out.println("Tempo total: " + plano.calculaTempoTotal() + " minutos");
        System.out.println("Custo total: R$" + plano.calculaCustoTotal());
        System.out.println("-------------------------");
    }
}