import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println("*********************************");
        System.out.println("*                               *");
        System.out.println("*        Formas Geometricas     *");
        System.out.println("*                               *");
        System.out.println("*********************************");
        System.out.println("");

        System.out.print(" Quantas formas deseja criar? ");
        int qtdFormas = teclado.nextInt();
        Formas[] formas = new Formas[qtdFormas];
        System.out.println("");

        System.out.println(" Você pode criar: quadrado, retângulo e círculo! \n Qual você deseja criar? ");
        String forma = teclado.next();
        String forma1 = forma.toUpperCase();

        if (forma1 == "quadrado") {
            System.out.print("Qual é o valor do lado?");
            double lado = teclado.nextDouble();
            Quadrado quadrado = new Quadrado(lado);

            quadrado.calculoAreaForma();
        }

        

    }
            
}