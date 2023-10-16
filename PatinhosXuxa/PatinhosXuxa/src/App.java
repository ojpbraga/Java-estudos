import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        
        // Ler o número de patinhos:
        Scanner patinhos = new Scanner(System.in);
        System.out.println("Quantos patinhos foram passear? ");
        int n = patinhos.nextInt();
        int qtdPatinhos = n;
        System.out.println("");

        // Verificar se o número é inteiro:
        if (n > 0){
            
        }
       

        for (n = qtdPatinhos; n >= 1; n--) {
            if (n > 1){
                System.out.println(n + " patinhos foram passear");
            } else {
                System.out.println("Um patinho foi passear");
            }
            System.out.println(
                    "Além das montanhas para brincar\n" +
                    "A mamãe gritou: \"Quá, quá, quá, quá"
                    );


                if (n > 1){
                    System.out.println("Mas só " + (n-1) + " patinhos voltaram de lá");

                } else {
                    System.out.println("Mas nenhum patinho voltou de lá\n" + "A mamãe patinha foi procurar\n" +
                    "Além das montanhas, na beira do mar\n" +
                    "A mamãe gritou: \"Quá, quá, quá, quá\"\n" +
                    "E os " + qtdPatinhos + " patinhos voltaram de lá");
                }
                System.out.println("");
        }

    }

}
