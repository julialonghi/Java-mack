public class Viagem {
    private String destino;
    private double distancia;

    public Viagem(String destino, double distancia) {
        this.destino = destino;
        this.distancia = distancia;
    }
    
    public double calculaTempo(double velocidadeMedia) {
        return distancia/velocidadeMedia;
    }
}