// Nome: Pedro Henrique Cunha Moda


public class BibliotecaSystem {
    public static void main(String[] args) {
        final int maximo_item = 100;
        ItemDeBiblioteca[] itens = new ItemDeBiblioteca[maximo_item];
        Leitura leitura = new Leitura();
        int opc = 0;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Adicionar DVD");
            System.out.println("3 - Pesquisar por título");
            System.out.println("4 - Sair");
            try{
                opc = Integer.parseInt(leitura.entDados(""));
            }catch(NumberFormatException n){
                System.out.println("Erro, digite um valor inteiro de 1 a 4");
            }
            switch (opc) {
                case 1:
                    livro 
                    String tituloLivro = leitura.entDados("Digite o título:");
                    String codigoLivro = leitura.entDados("Digite o código:");
                    String autorLivro = leitura.entDados("Digite o autor:");
                    String editoraLivro = leitura.entDados("Digite a editora:");
                    int numPagLivro = Integer.parseInt(leitura.entDados("Digite o número de páginas:"));
                    Livro livro = new Livro(tituloLivro, codigoLivro, autorLivro, editoraLivro, numPagLivro);
                    int i = 0;
                    while (i < maximo_item && itens[i] != null) {
                        i++;
                    }
                    if (i < maximo_item) {
                        itens[i] = livro;
                        System.out.println("Livro adicionado com sucesso!");
                    } else {
                        System.out.println("Não foi possível adicionar o livro, o limite de itens foi alcançado.");
                    }
                    break;
                case 2:
                    String tituloDvd = leitura.entDados("Digite o título:");
                    String codigoDvd = leitura.entDados("Digite o código:");
                    String diretorDvd = leitura.entDados("Digite o diretor:");
                    String elencoDvd = leitura.entDados("Digite o elenco:");
                    int duracaoDvd = Integer.parseInt(leitura.entDados("Digite a duração (em minutos):"));
                    DVD dvd = new DVD(tituloDvd, codigoDvd, diretorDvd, elencoDvd, duracaoDvd);
                    i = 0;
                    while (i < maximo_item && itens[i] != null) {
                        i++;
                    }
                    if (i < maximo_item) {
                        itens[i] = dvd;
                        System.out.println("DVD adicionado com sucesso!");
                    } else {
                        System.out.println("Não foi possível adicionar o DVD, o limite de itens foi alcançado.");
                    }
                    break;
                case 3:
                    String tituloPesquisa = leitura.entDados("Digite o título a ser pesquisado:");
                    boolean encontrado = false;
                    for (ItemDeBiblioteca item : itens) {
                        if (item != null && item.getTitulo().equalsIgnoreCase(tituloPesquisa)) {
                            item.mostrarDetalhes();
                            System.out.println("------");
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Nenhum item encontrado com o título informado.");
                    }
                    break;
                
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opc != 4);
    };
}