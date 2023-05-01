public class Cartografia extends ItemDeBiblioteca{
    private String escala;
    private String projecao;
    private String fonte;
    public Cartografia (String titulo, String codigo, String escala, String projecao, String fonte, String dataPubli, String prateleira, String seção){
        super(titulo, codigo, dataPubli, prateleira, seção);
        this.escala=escala;
        this.projecao=projecao;
        this.fonte=fonte; 
    }
    public void setEscala(String escala) {
        this.escala = escala;
    }
    public String getEscala() {
        return escala;
    }
    public void setProjecao(String projecao) {
        this.projecao = projecao;
    }
    public String getProjecao() {
        return projecao;
    }
    public void setFonte(String fonte) {
        this.fonte = fonte;
    }
    public String getFonte() {
        return fonte;
    }
    @Override
    public void mostrarDetalhes() {
        System.out.println("!! Cartografia !!");
        System.out.println("Título: " + getTitulo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Escala: " + escala);
        System.out.println("Projeção: " + projecao);
        System.out.println("Fonte: " + fonte);
        System.out.println("Data de publicação: " + getDataPubli());
        System.out.println("Seção " + getSeção() +"/ Prateleira " + getPrateleira());
    }
}
