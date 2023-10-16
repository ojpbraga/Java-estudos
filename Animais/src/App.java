public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Cachorro A1 = new Cachorro("Geraldo");
        A1.beber();
        A1.lamber();

        Dragao B2 = new Dragao("Girleide");
        B2.soltarFogo();

        Gato C3 = new Gato("Gildson");
        C3.miar();

        Pombo D4 = new Pombo("Gilberto");
        D4.enviarCarta();
        D4.enviarCarta();

        // Extend da classe Ave
        B2.voar();
        D4.voar();
        
    }
}
