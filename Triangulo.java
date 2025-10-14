public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {

    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() { return this.base; }

    public double getAltura() { return this.altura; }

    public void setBase(double base) { this.base = base; }

    public void setAltura(double altura) { this.altura = altura; }

    public double calculaArea() {
        return ((base * altura)/2);
    }

    public void imprimeDados() {
        System.out.printf("Base do triângulo: %.2f", this.base);
        System.out.printf("\nAltura do triângulo: %.2f\n", this.altura);
    }
}
