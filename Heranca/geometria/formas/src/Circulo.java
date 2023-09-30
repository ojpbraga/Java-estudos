public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calculoAreaForma() {
        return 3.14 * (raio * raio);
    }

    public double calculoPerimetro() {
        return 2*(3.14*raio);
    }

}
