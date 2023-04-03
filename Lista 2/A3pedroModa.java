// Nome: Pedro Henrique Cunha Moda RA: 2476576

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class A3pedroModa{
    public static void main(String[] args){
        A3pedroModa a3 = new A3pedroModa();
        String nome = a3.entDados("Meu nome é:");
        System.out.println("Meu nome é " + nome);
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