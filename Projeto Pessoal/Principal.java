import java.util.ArrayList;

public class Principal{
    public static void main(String[] args) {
        ArrayList<ItemDeBiblioteca> itens = new ArrayList<ItemDeBiblioteca>();
        Leitura l = new Leitura();
        int opc = 0;
        final int zero=0;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Adicionar DVD");
            System.out.println("3 - Adicionar CD");
            System.out.println("4 - Adicionar manuscrito");
            System.out.println("5 - Adicionar cartografia");
            System.out.println("6 - Pesquisar por título");
            System.out.println("7 - Pesquisar manuscrito (Por origem) ");
            System.out.println("4 - Sair");
            opc=Integer.parseInt(l.entDados("Digite a opção desejada: "));

            switch (opc) {
                case 1:
                    Livro livro = new Livro(null, null, null, null, zero, null, null, null);
                    livro.setTitulo(l.entDados("Digite o título: "));
                    livro.setCodigo(l.entDados("Digite o Codigo: "));
                    livro.setAutor(l.entDados("Digite o título: "));
                    livro.setEditora(l.entDados("Digite o título: "));
                    livro.setNumPaginas(Integer.parseInt(l.entDados("Digite o numero de paginas: ")));
                    livro.setDataPubli(l.entDados("Digite a data de publicação: "));
                    livro.setSeção(l.entDados("Digite a seção que contem o item: "));
                    livro.setPrateleira(l.entDados("Digite a prateleira que contem o item: "));
                    itens.add(livro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    DVD dvd = new DVD(null, null, null, null, zero, null, null, null);
                    dvd.setCodigo(l.entDados("Digite o codigo: "));
                    dvd.setTitulo(l.entDados("Digite o titulo: "));
                    dvd.setDiretor(l.entDados("Digite o diretor: "));
                    dvd.setDuracao(Integer.parseInt(l.entDados("Digite a duração (minutos): ")));
                    dvd.setElenco(l.entDados("Digite o Elenco: "));
                    dvd.setDataPubli(l.entDados("Digite a data de publicação: "));
                    dvd.setSeção(l.entDados("Digite a seção que contem o item: "));
                    dvd.setPrateleira(l.entDados("Digite a prateleira que contem o item: "));
                    itens.add(dvd);
                    System.out.println("DVD adicionado com sucesso!");
                    break;
                case 3:
                    CD cd = new CD(null, null, null, zero, null, null, null);
                    cd.setTitulo(l.entDados("Digite o título: "));
                    cd.setCodigo(l.entDados("Digite o codigo: "));
                    cd.setArtista(l.entDados("Digite o/ a(s) artista(s): "));
                    cd.setNumFaixas(Integer.parseInt(l.entDados("Digite o numero de faixas: ")));
                    cd.setDataPubli(l.entDados("Digite a data de publicação: "));
                    cd.setSeção(l.entDados("Digite a seção que contem o item: "));
                    cd.setPrateleira(l.entDados("Digite a prateleira que contem o item: "));
                case 4:
                    Manuscrito mnc = new Manuscrito(null, null, null, null, null, null, null);
                case 5:
                    Cartografia cart = new Cartografia(null, null, null, null, null, null, null, null);
                case 6:
                    String tituloPesquisa = l.entDados("Digite o título a ser pesquisado: ");
                    boolean encontrado = false;
                    for (ItemDeBiblioteca item : itens) {
                        if (item.getTitulo().equalsIgnoreCase(tituloPesquisa)) {
                            item.mostrarDetalhes();
                            System.out.println("------");
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Nenhum item encontrado com o título informado.");
                    }
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opc != 4);
    };
}

