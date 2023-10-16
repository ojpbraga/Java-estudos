public class InteiroSet {
    private int valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9, valor10;
    private boolean[] conjunto = new boolean[10];

    public int getValor1() {
        return valor1;
    }
    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }
    public int getValor2() {
        return valor2;
    }
    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    public int getValor3() {
        return valor3;
    }
    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }
    public int getValor4() {
        return valor4;
    }
    public void setValor4(int valor4) {
        this.valor4 = valor4;
    }
    public int getValor5() {
        return valor5;
    }
    public void setValor5(int valor5) {
        this.valor5 = valor5;
    }
    public int getValor6() {
        return valor6;
    }
    public void setValor6(int valor6) {
        this.valor6 = valor6;
    }
    public int getValor7() {
        return valor7;
    }
    public void setValor7(int valor7) {
        this.valor7 = valor7;
    }
    public int getValor8() {
        return valor8;
    }
    public void setValor8(int valor8) {
        this.valor8 = valor8;
    }
    public int getValor9() {
        return valor9;
    }
    public void setValor9(int valor9) {
        this.valor9 = valor9;
    }
    public int getValor10() {
        return valor10;
    }
    public void setValor10(int valor10) {
        this.valor10 = valor10;
    }
 

    public InteiroSet(int valor1, int valor2, int valor3, int valor4, int valor5, int valor6, int valor7, int valor8,
            int valor9, int valor10) {
        
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
        this.valor4 = valor4;
        this.valor5 = valor5;
        this.valor6 = valor6;
        this.valor7 = valor7;
        this.valor8 = valor8;
        this.valor9 = valor9;
        this.valor10 = valor10;

        int[] vetor = {valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9, valor10};
        for (int i = 0; i < 10; i++){
            if(vetor[i] >= 0 || vetor[i] <= 100){
                conjunto[i] = true;
            } else {
                conjunto[i] = false;
            }
        }

    }

    public void mostrarConjunto() {
        for (int i = 0; i < 10; i++){
            System.out.println(conjunto[i]);
        }
    }

    
    public InteiroSet() {
            int[] vetor = {valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9, valor10};
                for (int i = 0; i < 10; i++){
                    conjunto[i] = false;
                    System.out.println(conjunto[i]);
                }
    }
        


    

    

    
    

    // Precisa fazer uma classe inteiro set, essa classe vai guadra dez valores inteiros, depois precisa de um arrey de boolenas, com o array de booleans vou firicar se os valores estao entre 0 e 100.

}