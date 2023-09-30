public class Dragao extends Ave {

    public Dragao(String nome) {
        // Fazer chamada do construtor da classe superior
        super(nome);
    }

    public void soltarFogo(){
        System.out.println(getNome() + " soltou fogo!");
    }
    
}
