import java.util.ArrayList;

public class Principal{
    public static void main(String[] args) {
        ArrayList<ItemDeBiblioteca> itens = new ArrayList<ItemDeBiblioteca>();
        Leitura l = new Leitura();
        ManipularDados mpd = new ManipularDados();
        int opc = 0;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Adicionar DVD");
            System.out.println("3 - Adicionar CD");
            System.out.println("4 - Adicionar manuscrito");
            System.out.println("5 - Adicionar cartografia");
            System.out.println("6 - Pesquisar por título");
            System.out.println("7 - Sair");
            opc=Integer.parseInt(l.entDados("Digite a opção desejada: "));

            switch (opc) {
                case 1:
                    itens.add(mpd.addLivro(itens));
                    break;
                case 2:
                    itens.add(mpd.addDVD(itens));
                    break;
                case 3:
                    itens.add(mpd.addCD(itens));
                    break;
                case 4:
                    itens.add(mpd.addManuscrito(itens));
                    break;
                case 5:
                    itens.add(mpd.addCartografia(itens));
                    break;
                case 6:
                    mpd.pesquisarTitulo(itens);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opc != 7);
    };
}



