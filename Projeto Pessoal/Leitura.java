// Nome: Pedro Henrique Cunha Moda

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Leitura{

	private static Leitura l_Unic;
	private Leitura(){}
	public static Leitura getLeitura(){
	   if(l_Unic == null){
		l_Unic = new Leitura();
	   }
	 return l_Unic;
	}

	public String entDados(String rotulo){

		System.out.println(rotulo);
		String resp = "";

		InputStreamReader tec = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(tec);	

		try{
			resp = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\n ERRO");
		}
		
		return resp;
	}

}