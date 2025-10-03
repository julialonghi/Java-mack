public class TesteViagem {
    public static void main(String[] args) {
        Viagem viagem = new Viagem("Rio",400);
        System.out.printf("Tempo calculado: %.2f\n", viagem.calculaTempo(45));
    }
}