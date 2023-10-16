public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Personagem heroi = new Personagem();
        heroi.setNome("Eduart");
        heroi.setNivel(7);
        heroi.setForca(8);

        System.out.println(heroi.getNome());
        System.out.println(heroi.getNivel());
        System.out.println(heroi.getForca());

        heroi.mostrarStatus();
        heroi.atacar("Hydra", "dando um chute no pé");

        System.out.print(heroi.calcularDano());
    }

}
