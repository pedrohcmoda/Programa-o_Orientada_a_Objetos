import java.util.ArrayList;


public class Banco{
        static Banco bd;
        private Banco(){}
        
        public static Banco getBanco(){
            if(bd==null){
                bd=new Banco();
            }
            return bd;
        }
        private int escolha=0;
        final int zero =0;
        Leitura l = Leitura.getLeitura();
        ArrayList<ItemDeBiblioteca> itens = new ArrayList<ItemDeBiblioteca>();


    public void addLivro(){
        Livro livro = new Livro(null, null, null, null, zero, null, null, null);
        livro.setTitulo(l.entDados("Digite o título: "));
        try{
            livro.setCodigo(l.entDados("Digite o Codigo: "), itens);
        }
        catch(codIgualException eci){
            livro=(Livro)eci.codigoIgual(itens, livro);
        }
        livro.setAutor(l.entDados("Digite o autor: "));
        livro.setEditora(l.entDados("Digite a editora: "));
        try{
            livro.setNumPaginas(Integer.parseInt(l.entDados("Digite o numero de paginas: ")));
        }catch(NumberFormatException nf){
            livro.setNumPaginas(Integer.parseInt(l.entDados("Valor invalido, digite novamente o numero de paginas: ")));
        }
            livro.setDataPubli(l.entDados("Digite a data de publicação (DD/MM/AAAA): "));
        livro.setSeção(l.entDados("Digite a seção que contem o item: "));
        livro.setPrateleira(l.entDados("Digite a prateleira que contem o item: "));
        itens.add(livro);
        try{
            escolha= Integer.parseInt(l.entDados("Digite 1 para cadastrar mais um item ou 0 para terminar o cadastro: "));
        }catch(NumberFormatException nfe){
            escolha= Integer.parseInt(l.entDados("Valor invalido, digite 1 para cadastrar mais um item ou 0 para terminar o cadastro: "));
        }
        if(escolha==1){
            addLivro();
        }
    };
    public void addDVD(){
        DVD dvd = new DVD(null, null, null, null, zero, null, null, null);
        dvd.setTitulo(l.entDados("Digite o titulo: "));
        try{
            dvd.setCodigo(l.entDados("Digite o codigo: "), itens);
        }
        catch(codIgualException eci){
            dvd=(DVD)(eci.codigoIgual(itens,dvd));
        };
        dvd.setDiretor(l.entDados("Digite o diretor: "));
        try{
            dvd.setDuracao(Integer.parseInt(l.entDados("Digite a duração (minutos): ")));
        }catch(NumberFormatException nf){
            dvd.setDuracao(Integer.parseInt(l.entDados("Valor invalido, digite novamente a duração (minutos): ")));
        }
        dvd.setElenco(l.entDados("Digite o Elenco: "));
        dvd.setDataPubli(l.entDados("Digite a data de publicação (DD/MM/AAAA): "));
        dvd.setSeção(l.entDados("Digite a seção que contem o item: "));
        dvd.setPrateleira(l.entDados("Digite a prateleira que contem o item: "));
        itens.add(dvd);
        try{
            escolha= Integer.parseInt(l.entDados("Digite 1 para cadastrar mais um item ou 0 para terminar o cadastro: "));
        }catch(NumberFormatException nfe){
            escolha= Integer.parseInt(l.entDados("Valor invalido, digite 1 para cadastrar mais um item ou 0 para terminar o cadastro: "));
        }
        if(escolha==1){
            addDVD();
        }
    };
    public void addCD(){
        CD cd = new CD(null, null, null, zero, null, null, null);
        cd.setTitulo(l.entDados("Digite o título: "));
        try{
            cd.setCodigo(l.entDados("Digite o codigo: "), itens);
        }
        catch(codIgualException eci){
            cd=(CD)(eci.codigoIgual(itens,cd));
        };
        cd.setArtista(l.entDados("Digite o/ a(s) artista(s): "));
        try{
            cd.setNumFaixas(Integer.parseInt(l.entDados("Digite o numero de faixas: ")));
        }catch(NumberFormatException nf){
            cd.setNumFaixas(Integer.parseInt(l.entDados("Valor invalido, digite novamente o numero de faixas: ")));
        }
        cd.setDataPubli(l.entDados("Digite a data de publicação (DD/MM/AAAA): "));
        cd.setSeção(l.entDados("Digite a seção que contem o item: "));
        cd.setPrateleira(l.entDados("Digite a prateleira que contem o item: "));
        itens.add(cd);
        try{
            escolha= Integer.parseInt(l.entDados("Digite 1 para cadastrar mais um item ou 0 para terminar o cadastro: "));
        }catch(NumberFormatException nfe){
            escolha= Integer.parseInt(l.entDados("Valor invalido, digite 1 para cadastrar mais um item ou 0 para terminar o cadastro: "));
        }
        if(escolha==1){
            addCD();
        }
    };
    public void addManuscrito(){
        Manuscrito mnc = new Manuscrito(null, null, null, null, null, null, null);
        mnc.setTitulo(l.entDados("Digite o titulo: "));
        try{
            mnc.setCodigo(l.entDados("Digite o codigo: "), itens);
        }
        catch(codIgualException eci){
            mnc=(Manuscrito)(eci.codigoIgual(itens,mnc));
        };
        mnc.setMaterial(l.entDados("Digite o material: "));
        mnc.setOrigem(l.entDados("Digite a origem: "));
        mnc.setDataPubli(l.entDados("Digite a data de publicação (DD/MM/AAAA): "));
        mnc.setSeção(l.entDados("Digite o código: "));
        mnc.setPrateleira(l.entDados("Digite o código: "));
        itens.add(mnc);
        try{
            escolha= Integer.parseInt(l.entDados("Digite 1 para cadastrar mais um item ou 0 para terminar o cadastro: "));
        }catch(NumberFormatException nfe){
            escolha= Integer.parseInt(l.entDados("Valor invalido, digite 1 para cadastrar mais um item ou 0 para terminar o cadastro: "));
        }
        if(escolha==1){
            addManuscrito();
        }
    };
    public void addCartografia(){
        Cartografia cart = new Cartografia(null, null, null, null, null, null, null, null);
        cart.setTitulo(l.entDados("Digite o titulo: "));
        try{
            cart.setCodigo(l.entDados("Digite o codigo: "), itens);
        }
        catch(codIgualException eci){
            cart=(Cartografia)(eci.codigoIgual(itens,cart));
        };
        cart.setEscala(l.entDados("Digite a escala: "));
        cart.setProjecao(l.entDados("Digite a projeção: "));;
        cart.setFonte(l.entDados("Digite a fonte: "));
        cart.setDataPubli(l.entDados("Digite a data de publicação (DD/MM/AAAA): "));
        cart.setSeção(l.entDados("Digite a seção: "));
        cart.setPrateleira(l.entDados("Digite a prateleira: "));
        itens.add(cart);
        try{
            escolha= Integer.parseInt(l.entDados("Digite 1 para cadastrar mais um item ou 0 para terminar o cadastro: "));
        }catch(NumberFormatException nfe){
            escolha= Integer.parseInt(l.entDados("Valor invalido, digite 1 para cadastrar mais um item ou 0 para terminar o cadastro: "));
        }
        if(escolha==1){
            addCartografia();
        }
    };
    public void pesquisarTitulo(){
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
    };

    public void pesquisarID(){
        String codigo = l.entDados("Digite o título a ser pesquisado: ");
        boolean encontrado = false;
        for (ItemDeBiblioteca item : itens) {
            if (item.getCodigo().equals(codigo)) {
                item.mostrarDetalhes();
                System.out.println("------");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum item encontrado com o título informado.");
        }
    };
}