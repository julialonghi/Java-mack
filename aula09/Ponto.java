public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Ponto p) {
        double soma = Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2);
        return Math.sqrt(soma);
    }

    @Override
    public String toString() {
        return String.format("(%.0f, %.0f)", x, y);
    }
}