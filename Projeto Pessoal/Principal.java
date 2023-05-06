// Nome: Pedro Henrique Cunha Moda RA:2476576
public class Principal{
    public static void main(String[] args) {
        Leitura l = Leitura.getLeitura();
        Banco banco = Banco.getBanco();
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
                    banco.addLivro();
                    break;
                case 2:
                    banco.addDVD();
                    break;
                case 3:
                    banco.addCD();
                    break;
                case 4:
                    banco.addManuscrito();
                    break;
                case 5:
                    banco.addCartografia();
                    break;
                case 6:
                    banco.pesquisarTitulo();
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



