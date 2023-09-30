public class Quadrado extends Quadrilatero {

    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
    }

    public double calculoAreaForma() {
        return getLado1() * getLado1();
    }

    public double calculoPerimetro() {
        return 4 * getLado1();
    }

}
