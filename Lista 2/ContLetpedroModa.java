
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

    public class ContLetpedroModa{
    

    public static void main(String arg[]){
        ContLetpedroModa cl = new ContLetpedroModa();
        String frase = cl.entDados("Escreva a frase: ");
        char letra = cl.entDados("Escreva a letra a ser buscada: ").charAt(0);
        int cont=0;
        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)==letra){
                cont++;
            }
        }
        if(cont>1){
            System.out.println("Numero de letras encontradas: " + cont);
        }
        else {
            System.out.println("Nenhuma letra correspondete foi encontrada");
        }
    }

    public String entDados(String rotulo){
        System.out.println(rotulo);
        String resp = "";
        InputStreamReader tec= new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(tec);
        try{
            resp = buff.readLine();
        }
        catch(IOException ioe){
            System.out.println("Erro");
        }
        return resp;
    }


}
