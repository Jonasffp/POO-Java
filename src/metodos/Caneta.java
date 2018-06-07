package metodos;

public class Caneta {
    private String modelo;
    private String cor;
    private double ponta;
    private boolean tampada;

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public double getPonta(){
        return ponta;
    }
    public void setPonta(double p){
        this.ponta = p;
    }
    public boolean isTampada() {        //getTampada
        return tampada;
    }

    public void setTampada(boolean t) {
        this.tampada = t;       /****muito importante o this.  pois não estou alterando a variavel da classe e sim o atributo do objeto que chamei o método****/
                                //Esperando resposta doi professor sobre essa dúvida
    }
}
