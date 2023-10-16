public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String salarioAumento(){
        double salarioAumento = ((this.salarioMensal * 0.1) + this.salarioMensal) * 12;
        System.out.println("O reajuste anual é: " + salarioAumento + "\n Salário antigo: " + this.salarioMensal * 12);

        return "O reajuste anual é: " + salarioAumento + "\n Salário antigo: " + this.salarioMensal * 12;;
    }
}