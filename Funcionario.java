public class Funcionario {
    private int cracha;
    private double salario;
    private String cargo;

    public Funcionario() {
        this.cargo = "assistente";
    }

    public Funcionario(int c, double s, String car) {
        this.cracha = c;
        this.salario = s;
        this.cargo = car;
    }

    public int getCracha() { return this.cracha; }

    public double getSalario() { return this.salario; }

    public String getCargo() { return this.cargo; }

    public void setCracha(int c) { this.cracha = c; }

    public void setSalario(double sal) { this.salario = sal; }

    public void setCargo(String car) { this.cargo = car; }

    public double calculaAumento(double porcentagem) {
        return (this.salario * (porcentagem/100)) + salario;
    }

    public double calculaAumento(int tempo) {
        return salario + (150 * tempo);
    }
}