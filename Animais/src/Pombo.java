public class Pombo extends Ave {
    private int cartasEnviadas;

    public Pombo(String nome){
        super(nome);
        this.cartasEnviadas = 10;
    }

    public void fazerPruh() {
        System.out.println(getNome() + " fez pruh!");
    }
    public void enviarCarta() {
        System.out.println(getNome() + " enviarCarta!");
        cartasEnviadas++;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }

}
