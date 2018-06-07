package relacionEntreClasses;

public class Main {
    public static void main(String args[]) {

        Pessoa leitor = new Pessoa();
        Livro livro = new Livro();
        leitor.setNome("Jonas Ferreira");
        leitor.setIdade(18);
        leitor.setSexo('M');
        leitor.fazerAniversario();

        livro.setLeitor(leitor);
        livro.setAutor("George R. R. Martin");
        livro.setTitulo("The Winds of Winter");
        livro.setTotPaginas(500);
        livro.setAberto(true);
        livro.setPagAtual(9);
        livro.avancarPag();
        livro.folhear();
        livro.detalhes();

    }
}
