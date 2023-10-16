/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class fatura {
    private String numero;
    private String descricao;
    private int qtdCompradaItem;
    private double precoItem;

    public fatura(String numero, String descricao, int qtdCompradaItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtdCompradaItem = qtdCompradaItem;
    }

    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQtdCompradaItem() {
        return qtdCompradaItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQtdCompradaItem(int qtdCompradaItem) {
        this.qtdCompradaItem = qtdCompradaItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    
    public double getTotalFatura(){
        double total = qtdCompradaItem * precoItem;
        System.out.println("Teste fatura:" + total);
        return total;
    }
    
}
