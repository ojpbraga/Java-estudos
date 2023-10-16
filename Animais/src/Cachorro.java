public class Cachorro extends Animal {
    private int ossosComidos;

    public Cachorro(String nome) {
        // Agora é necessário chamar o construtor da classe super. Tudo o que está entre parênteses, faz referência ao que está no construtor nos parâmetros da classe super (Animal)
        super(nome);

        // Suponhamos que o cachorro já veio de fábrica tendo comido 10 ossos. A super precisa ficar obrigatoriamente em cima.
        this.ossosComidos = 10;
    }

    public void latir() {
        System.out.println(getNome() + " latiu!");
    }
    public void lamber() {
        System.out.println(getNome() + " lambeu!");
    }
}
