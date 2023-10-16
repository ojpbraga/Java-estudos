import java.util.Scanner;
import java.util.Random;

public class sortear {
    public static void main(String[] args){
        int palpiteJogador;
        Scanner teclado;
        int tentativa;

        System.out.println("******** Bem vindo ao SORTEAR ********");
        System.out.println(" ");
        System.out.println(" Regras do Jogo");
        System.out.println(" - Palpites de 1 a 10");
        System.out.println(" Por favor, Digite o palpite:");

        Random numero = new Random();
        int palpite = numero.nextInt(11);

        for (tentativa = 0; tentativa < 3; tentativa ++){
            System.out.println(palpite);

            teclado = new Scanner(System.in);
            palpiteJogador = teclado.nextInt();

            if (palpiteJogador == palpite){
                System.out.println(" Parabéns! Você acertou!");
            } if (tentativa == 4) {
                System.out.println("Sinto muito!");
            } else {
                System.out.println("Mais uma chance");
            }

    }
}
}
