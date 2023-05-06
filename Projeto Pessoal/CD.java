// Nome: Pedro Henrique Cunha Moda

public class CD extends ItemDeBiblioteca implements Elementos{
    private String artista;
    private int numFaixas;

    public CD(String titulo, String codigo, String artista, int numFaixas, String dataPubli, String prateleira, String seção) {
        super(titulo, codigo, dataPubli, prateleira, seção);
        this.artista = artista;
        this.numFaixas = numFaixas;
    }

    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("\n !! CD !! \n");
        System.out.println("Título: " + getTitulo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Artista: " + artista);
        System.out.println("Número de Faixas: " + numFaixas);
        System.out.println("Data de publicação: " + getDataPubli());
        System.out.println("Seção " + getSeção() +"/ Prateleira " + getPrateleira());
    }
}
