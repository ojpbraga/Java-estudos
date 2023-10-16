public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double sacar(double saque) {
        if (saldo < saque) {
            System.out.println("Não é possível sacar esse valor!");
        } else {
        saldo = saldo - saque;
        }
        return saldo;
        
    }

    public double depositar(double deposito) {
        saldo = deposito + saldo;
        return saldo;
    }

    public double obterSaldo() {
        return saldo;
    }

}
