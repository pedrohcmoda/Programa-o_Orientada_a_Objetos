// Nome: Pedro Henrique Cunha Moda

public class DVD extends ItemDeBiblioteca {
    private String diretor;
    private String elenco;
    private int duracao;

    public DVD(String titulo, String codigo, String diretor, String elenco, int duracao, String dataPubli, String prateleira, String seção) {
        super(titulo, codigo, dataPubli, prateleira, seção);
        this.diretor = diretor;
        this.elenco = elenco;
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("!! DVD !!");
        System.out.println("Título: " + getTitulo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Diretor: " + diretor);
        System.out.println("Elenco: " + elenco);
        System.out.println("Duração: " + duracao);
        System.out.println("Data de publicação: " + getDataPubli());
        System.out.println("Seção " + getSeção() +"/ Prateleira " + getPrateleira());
    }
}
