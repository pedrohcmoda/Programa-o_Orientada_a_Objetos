public class CD extends ItemDeBiblioteca {
    private String artista;
    private int numFaixas;

    public CD(String titulo, String codigo, String artista, int numFaixas) {
        super(titulo, codigo);
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
        System.out.println("Título: " + getTitulo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Artista: " + artista);
        System.out.println("Número de Faixas: " + numFaixas);
    }
}
