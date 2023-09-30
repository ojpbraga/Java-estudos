public class Retangulo extends Quadrilatero {

    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
    }
    
    public double calculoAreaForma() {
        return getLado1() * getLado2();
    }

    public double calculoPerimetro() {
        return 2 * (getLado1() + getLado2());
    }

}
