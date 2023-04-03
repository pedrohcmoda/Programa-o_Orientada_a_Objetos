// Nome: Pedro Henrique Cunha Moda RA:2476576

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class MatrizInversaPedroModa{

    public static void main(String[] arg){
        MatrizInversaPedroModa mi= new MatrizInversaPedroModa();
        int matriz[][]=new int [3][3];
        for(int i= 0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j]=Integer.parseInt(mi.entDados("Digite o valor da posição ["+i+"]["+j+"]: "));
            }
        }
        
        for(int i=2;i>=0;i--){
            for(int j=2;j>=0;j--){
                System.out.println("valor da posição ["+i+"]["+j+"]: "+matriz[i][j]);
            }
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