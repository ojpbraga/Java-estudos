import java.util.Random;

public class Personagem {
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    private int nivel;
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    private int forca;
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }



    // Criando métodos:

    // Void -> significa que não está retornando
    public void mostrarStatus() {
        System.out.format("O personagem: %s com %d de força\n", nome, forca);
    }

    // Metodos que possuem retornos: colocar o tipo que vai retornar
    public int calcularDano() {
        Random gerador = new Random();
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        
        return dano;
    }

    //                 isso é um parâmetro
    public void atacar(String alvo, String habilidade) {
        if (habilidade.length() == 0) {
            System.out.format("%s atacou e causou %d de dano na %s.\n", nome, forca, alvo);
        } else {
            System.out.format("%s atacou e causou %d de dano na %s, usando a habilidade %s.\n", nome, forca, alvo, habilidade);
        }   
    }

   

}
