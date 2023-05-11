// Nome: Pedro Henrique Cunha Moda RA: 2476576
 
//Entrada de dados via teclado
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Leitura{

	private static Leitura leitura;
	private Leitura(){}
	public static Leitura getLeitura(){
	   if(leitura == null){
		leitura = new Leitura();
	   }
	 return leitura;
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