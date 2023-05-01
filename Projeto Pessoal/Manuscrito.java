public class Manuscrito extends ItemDeBiblioteca {
    String material;
    String origem;
    public Manuscrito(String titulo, String codigo, String dataPubli, String material, String origem, String prateleira, String seção){
        super(titulo, codigo, dataPubli, prateleira, seção);
        this.material=material;
        this.origem=origem;
    };
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getMaterial() {
        return material;
    }
    public String getOrigem() {
        return origem;
    }
    @Override
    public void mostrarDetalhes() {
        System.out.println("!! Manuscrito !!");
        System.out.println("Título: " + getTitulo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Material: " + material);
        System.out.println("Origem: " + origem);
        System.out.println("Data de publicação: " + getDataPubli());
        System.out.println("Seção % / Prateleira % " + getSeção() + getPrateleira());
    }
}
