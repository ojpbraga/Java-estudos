public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Conta conta1 = new Conta(20);
        System.out.println(conta1.obterSaldo());
        System.out.println(conta1.depositar(50));
        System.out.println(conta1.sacar(70));

        System.out.println("");

        ContaPoupanca contaPoupanca = new ContaPoupanca(1000);
        System.out.println(contaPoupanca.depositar(500));
        System.out.println(contaPoupanca.sacar(100));

        System.out.println("");

        ContaCorrente contaCorrente = new ContaCorrente(1000);
    //   // Foi adicionado o calculo de atributos logo na criação da conta, pois acredito que os descontos devem acontecer logo na criação da conta! A não ser que houvesse a possibilidade de crédito ao cliente.
        System.out.println(contaCorrente.obterSaldo());
        
    }
}
