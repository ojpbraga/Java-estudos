public class Animal {
    private String nome;

    // Estamos fazer o construtor para não precisamos digitar aquela quantidade de código, inicializa o objeto. Alocar espaço de memória
    public Animal(String nome) {
        // .this referencia a instancia do metodo 
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void comer() {
        System.out.println(getNome() + " comeu!");
    }
    public void beber() {
        System.out.println(getNome() + " bebeu!");
    }
}
