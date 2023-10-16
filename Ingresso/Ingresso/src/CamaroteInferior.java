public class CamaroteInferior extends Vip{
    private String localizacao;

    public CamaroteInferior(double valor, String localizacao){
        super(valor);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public void imprimeValor(){
        System.out.println("O valor do Camarote Inferior é: " + ingressoVIP() + " Localização: " + getLocalizacao());
    }

}
