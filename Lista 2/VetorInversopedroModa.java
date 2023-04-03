// Nome: Pedro Henrique Cunha Moda RA: 2476576

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

    public class VetorInversopedroModa{
    public static void main(String[] arg){
        VetorInversopedroModa vi = new VetorInversopedroModa();
        int tamanho=6;
        int[] vetor = new int[tamanho];
        for(int i=0;i<tamanho;i++){
            vetor[i]=Integer.parseInt(vi.entDados("Digite o valor da posição ["+i+"] do vetor."));
        }
        for (int i = tamanho-1;i>=0;i--){
            System.out.println("Valor da posição ["+i+"] é igual a "+vetor[i]);
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
