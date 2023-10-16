public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(double saldo) {
        super(saldo);
        
        // Foi adicionado o calculo de atributos logo na criação da conta, pois acredito que os descontos devem acontecer logo na criação da conta! A não ser que houvesse a possibilidade de crédito ao cliente.
        calculaTributos();
    }
    public double calculaTributos() {
        
        // FEATURE: criação da verificação do saldo implemnetado. Calculo que traria 1 por cento e verificar caso o valor total fosse igual ou superior a 42 para criação de conta corrente.
        setSaldo((getSaldo() - ((getSaldo()/100)*1)) - SeguroDeVida());
        return getSaldo();
    }
    public double SeguroDeVida() {
        return 42;
    }
}
