public class Vip extends Ingresso{
    private double valorAdicional;

    public Vip(double valor){
        super(valor);
        this.valorAdicional = 10.0;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double ingressoVIP(){
        return getValor() + valorAdicional;
    }

    @Override
    public void imprimeValor(){
        System.out.println("O valor do ingresso VIP é: " + ingressoVIP());
    }
}
