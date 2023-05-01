// Nome: Pedro Henrique Cunha Moda

public abstract class ItemDeBiblioteca {
    private String titulo;
    private String codigo;
    private String dataPubli;
    private String seção;
    private String prateleira;

    public ItemDeBiblioteca(String titulo, String codigo, String dataPubli, String prateleira, String seção){
        this.titulo = titulo;
        this.codigo = codigo;
        this.dataPubli = dataPubli;
        this.prateleira=prateleira;
        this.seção=seção;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDataPubli() {
        return dataPubli;
    }
    public void setDataPubli(String dataPubli) {
        this.dataPubli = dataPubli;
    }
    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }
    public String getPrateleira() {
        return prateleira;
    }
    public void setSeção(String seção) {
        this.seção = seção;
    }
    public String getSeção() {
        return seção;
    }
    public abstract void mostrarDetalhes();
}
