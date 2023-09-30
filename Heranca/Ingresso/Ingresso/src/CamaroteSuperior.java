public class CamaroteSuperior extends Vip {
    private double valorExtra;

    public CamaroteSuperior(double valor) {
        super(valor);
        this.valorExtra = 50.0;
    }

    public double getValorExtra() {
        return valorExtra;
    }

    public void setValorExtra(double valorExtra) {
        this.valorExtra = valorExtra;
    }

    public String valorCamaroteSuperior(){
        return "Valor camarote Superior: " + (ingressoVIP() + getValorExtra());
    }

}
