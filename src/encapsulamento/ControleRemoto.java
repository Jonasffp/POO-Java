package encapsulamento;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){        //Construtor
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    //Métodos Especiais
    private int getVolume (){
        return volume;
    }

    private void setVolume(int v){
        this.volume = v;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean l){
        this.ligado = l;
    }

    private boolean isTocando(){
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    //Métodos Abstratos
    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void abrirMenu() {
        System.out.println("Está ligado? " + isLigado());
        System.out.println("Está tocando? " + isTocando());
        System.out.print("O volume é de: "+getVolume()+"%    ");
        for (int i=0; i<= getVolume();i += 10)
            System.out.print("|");
    }

    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    public void maisVolume() {
        if (this.isLigado())
            setVolume(this.getVolume()+5);
    }

    public void  menosVolume() {
        if (this.isLigado())
            setVolume(this.getVolume()-5);
    }

    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() != 0)
            this.setVolume(0);
    }

    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0)
            this.setVolume(50);
    }

    public void play() {
        if(this.isLigado())
            this.setTocando(true);
    }

    public void pause() {
        if(this.isLigado())
            this.setTocando(false);
    }



}
