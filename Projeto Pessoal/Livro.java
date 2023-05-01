// Nome: Pedro Henrique Cunha Moda

public class Livro extends ItemDeBiblioteca {
    private String autor;
    private String editora;
    private int numPaginas;

    public Livro(String titulo, String codigo, String autor, String editora, int numPaginas) {
        super(titulo, codigo);
        this.autor = autor;
        this.editora = editora;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Número de Páginas: " + numPaginas);
    }
}
