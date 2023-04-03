// Nome: Pedro Henrique Cunha Moda RA: 2476576

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class G1pedroModa {
    public static void main(String[] args) {
        G1pedroModa g1=new G1pedroModa();
        float a = Float.parseFloat(g1.entDados("Digite o Valor de A")); 
        float b = Float.parseFloat(g1.entDados("Digite o Valor de B"));
        int opc = Integer.parseInt(g1.entDados("Digite a opção desejada: \n1 - Somar (a+b)\n2 - multiplicar (a*b)\n3 - subtrair (a-b)\n5 - dividir (a/b) "));
        switch(opc){
            case 1:
                System.out.println("A + B = " + (a+b));
                break;
            case 2:
                System.out.println("A * B = " + (a*b));
                break;
            case 3:
                System.out.println("A - B = " + (a-b));
                break;
            case 5:
                System.out.println("A / B = " + (a/b));
                break;
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
