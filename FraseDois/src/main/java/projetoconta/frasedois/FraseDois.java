/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package projetoconta.frasedois;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class FraseDois {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        System.out.println("Qual a frase?");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        
        System.out.println("Qual palavra deseja substituir?");
        String substituirPalavra = teclado.nextLine();
        
        System.out.println("Para qual palavra?");
        String alteraPalavra = teclado.nextLine();
        
        String novaFrase = frase.replace(substituirPalavra, alteraPalavra);
        
        System.out.println("Frase alterada: " + novaFrase);
    }
}
