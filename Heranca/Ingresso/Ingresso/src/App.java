public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Vip vip1 = new Vip(20);
        vip1.imprimeValor();

        Normal normal1 = new Normal(20);
        normal1.imprimeValor();

        CamaroteInferior CI1 = new CamaroteInferior(30, "Cadeira C3");
        CI1.imprimeValor();

        CamaroteSuperior CS1 = new CamaroteSuperior(30);
        System.out.println(CS1.valorCamaroteSuperior());
        
    }
}
