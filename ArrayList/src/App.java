import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Array (vetor) com tamanho fixo de 5 posiçãoes
        String[] arrayEstatico = new String[5];
        arrayEstatico[0] = "JJ";
        arrayEstatico[1] = "Pedro";
        arrayEstatico[2] = "Pedro";
        arrayEstatico[3] = "Pedro";
        arrayEstatico[4] = "Pedro";

        // ArrayList<Tipo> nome = new ArrayList...
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Pedrin"); // indice 0
        arrayDinamico.add("Mariah"); // indice 1
        arrayDinamico.add("Joelson"); // indice 2

        // imprimindo os tamanhos:

        System.out.println("Array Estatico:");
        for (int i = 0; i < arrayEstatico.length; i++) {
            System.out.println(arrayEstatico[i]);
        }

        System.out.println("");

        System.out.println("Tamanho ArrayList: " + arrayDinamico.size());
        System.out.println("ArrayList:");
        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }

        System.out.println("Remover alguém:");
        arrayDinamico.remove(2);

        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }

        // Se quiser limpar:
        arrayDinamico.clear();
        System.out.println(arrayDinamico.size());

        // Wareper class (esqueci como digita)
        // Não pode adicionar tipo primitivos (int, float), apenas  OBJETOS.
        // Para adicionar, deverá ser criado uma class. Ex.: Integer, Float, Double, Character: ArrayLista<Integer>, ArrayClass<String>
        
    }
}
