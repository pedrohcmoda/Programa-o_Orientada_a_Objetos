//Nome: Pedro Henrique Cunha Moda

public class Principal implements Intfc{
    public static void main(String[] args) {
        Leitura l = Leitura.getLeitura();
        Banco banco = Banco.getBanco();
        Principal pcp = new Principal();
        int esc=0;
        int opc = 0;
        do {
            pcp.interFc();
            opc=Integer.parseInt(l.entDados("Digite a opcao desejada: "));
            //Menu de opcoes switch/case na Principal
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
                    esc=Integer.parseInt(l.entDados("Digite 1 para realizar uma pesquisa por nome\nDigite 2 para realizar a pesquisa dos itens baixaveis"));
                    banco.ferramentaPesquisa(esc);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao inválida.");
                    break;
            }
        } while (opc != 7);
    };

    
    @Override
    public void interFc(){
        System.out.println("Selecione uma opcao:");
        System.out.println("1 - Adicionar livro");
        System.out.println("2 - Adicionar DVD");
        System.out.println("3 - Adicionar CD");
        System.out.println("4 - Adicionar manuscrito");
        System.out.println("5 - Adicionar cartografia");
        System.out.println("6 - Pesquisar");
        System.out.println("7 - Sair");
    }
}



