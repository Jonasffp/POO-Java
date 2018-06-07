package relacionEntreClasses;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private Boolean aberto;
    private Pessoa leitor;


    public void detalhes(){
        System.out.println("O título do livro é: "+ this.getTitulo());
        System.out.println("O autor do livro é: "+ this.getAutor());
        System.out.println("Este livro tem "+ this.getTotPaginas() +" páginas");
        System.out.println("Seu leitor atual é: "+ leitor.getNome() + " e tem " + leitor.getIdade() + " anos");
        System.out.println("O livro está aberto? "+ this.getAberto());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override //esse override serve para sobreescrever outro metodo de mesmo nome
    public void abrir() {
        this.setAberto(true);
    }

    public void fechar() {
        this.setAberto(false);
    }

    public void folhear() {
        System.out.println("Apenas folheando...");
    }

    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }
}
