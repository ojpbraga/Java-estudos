public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Empregado E1 = new Empregado("Geraldo", "Santos", 1500.0);
        Empregado M2 = new Empregado("Eloísa", "Oliveira", 2500.00);

        E1.salarioAumento();
        M2.salarioAumento();
    }
}