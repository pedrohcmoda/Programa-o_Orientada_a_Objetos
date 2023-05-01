import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaSystem {
    public static void main(String[] args) {
        ArrayList<ItemDeBiblioteca> itens = new ArrayList<ItemDeBiblioteca>();

        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Adicionar DVD");
            System.out.println("3 - Pesquisar por título");
            System.out.println("4 - Sair");
            opc=scanner.nextInt();

            switch (opc) {
                case 1:
                    scanner.nextLine(); 
                    System.out.println("Digite o título:");
                    String tituloLivro = scanner.nextLine(); // correção
                    System.out.println("Digite o código:");
                    String codigoLivro = scanner.nextLine();
                    System.out.println("Digite o autor:");
                    String autorLivro = scanner.nextLine();
                    System.out.println("Digite a editora:");
                    String editoraLivro = scanner.nextLine();
                    System.out.println("Digite o número de páginas:");
                    int numPagLivro = 0;
                    while (!scanner.hasNextInt()) { // verifica se a entrada é um número inteiro
                        System.out.println("Entrada inválida, digite um número inteiro:");
                        scanner.nextLine(); // limpa o buffer do scanner
                    }
                    numPagLivro = scanner.nextInt();
                    scanner.nextLine(); // limpa o buffer do scanner
                    Livro livro = new Livro(tituloLivro, codigoLivro, autorLivro, editoraLivro, numPagLivro);
                    itens.add(livro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    scanner.nextLine(); 
                    System.out.println("Digite o título:");
                    String tituloDvd = scanner.nextLine();
                    System.out.println("Digite o código:");
                    String codigoDvd = scanner.nextLine();
                    System.out.println("Digite o diretor:");
                    String diretorDvd = scanner.nextLine();
                    System.out.println("Digite o elenco:");
                    String elencoDvd = scanner.nextLine();
                    System.out.println("Digite a duração (em minutos):");
                    int duracaoDvd = 0;
                    while (!scanner.hasNextInt()) {
                        System.out.println("Entrada inválida, digite um número inteiro:");
                        scanner.nextLine();
                    }
                    duracaoDvd = scanner.nextInt();
                    scanner.nextLine();
                    DVD dvd = new DVD(tituloDvd, codigoDvd, diretorDvd, elencoDvd, duracaoDvd);
                    itens.add(dvd);
                    System.out.println("DVD adicionado com sucesso!");
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Digite o título a ser pesquisado:");
                    String tituloPesquisa = scanner.nextLine();
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
                
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opc != 4);
    scanner.close();
    };
}