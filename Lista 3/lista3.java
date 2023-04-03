//Pedro Henrique Cunha Moda - RA: 2476576

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class lista3{
    public static void main(String arg[]){
        int escolha=0;
        System.out.println("|Opção 1 : Integer para Long");
        System.out.println("|Opção 2 : Boolean para Float");
        System.out.println("|Opção 3 : Char para Short");
        System.out.println("|Opção 4 : Double para Byte");
        System.out.println("|Opção 5 : Byte para Double");
        System.out.println("|Opção 6 : Short para Char");
        System.out.println("|Opção 7 : Float para Boolean");
        System.out.println("|Opção 8 : Long para Integer");
        try {
            escolha = Integer.parseInt(entrada("Digite a opção desejada: "));
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida, o valor digitado não é um número inteiro.");
        }
        switch(escolha){
            case 1: convertInt_Long(); break;
            case 2: convertBoolean_Float(); break;
            case 3: convertChar_Short(); break;
            case 4: convertDouble_Byte(); break;
            case 5: convertByte_Double(); break;
            case 6: convertShort_Char(); break;
            case 7: convertFloat_Boolean(); break;
            case 8: convertLong_Int(); break;
        }
    }

    public static String entrada(String strr){
        System.out.println(strr);
        String escolha = "";
        InputStreamReader tec= new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(tec);
        try{
            escolha = buff.readLine();
        }
        catch(IOException ioe){
            System.out.println("Erro na leitura");
        }
        return escolha;
    }
// i) Classe Long: métodos parseInt() e parseLong().
// ii) O metodo convertInt_Long() (a seguir) ira converter uma String para int e depois a conversão de int para Long.
// iii) Referência: https://www.javatpoint.com/java-long-to-int
    public static void convertInt_Long() {
        String RespUs = entrada("Digite um valor inteiro: ");
        int i = Integer.parseInt(RespUs);
        System.out.println("Valor atual: " + i);
        long l = Long.parseLong(String.valueOf(i));
        System.out.println("Valor convertido em Long: " + l);
    }
// i) Classe Float: métodos parseBoolean().
// ii) O método convertBoolean_float() (a seguir) converte um valor boolean para floata
// iii) Referência: https://www.convertdatatypes.com/Convert-boolean-to-float-in-Java.html
    public static void convertBoolean_Float() {
        String RespUs = entrada("Digite um valor booleano (true ou false): ");
        boolean b = Boolean.parseBoolean(RespUs);
        System.out.println("Valor atual: " + b);
        float f = b ? 1.0f : 0.0f;
        System.out.println("Valor convertido em Float: " + f);
    }
// i) Classe Short: métodos parseShort(), charAt() e valueOf().
// ii) O método convertChar_Short() (a seguir) converte um valor char para short
// iii) Referência: https://www.convertdatatypes.com/Convert-char-to-short-in-Java.html 
    public static void convertChar_Short() {
        String RespUs = entrada("Digite um caractere: ");
        char c = RespUs.charAt(0);
        System.out.println("Valor atual: " + c);
        short s = Short.parseShort(String.valueOf(c));
        System.out.println("Valor convertido Short: " + s);
    }
// i) Classe Byte: métodos parseInt() e ToString()
// ii) O método convertDouble_Byte() (a seguir) converte um valor double para byte. 
// iii) Referência: https://www.tutorialspoint.com/can-we-cast-a-double-value-to-a-byte-in-java
    public static void convertDouble_Byte() {
        String RespUs = entrada("Digite um valor double: ");
        double d = Double.parseDouble(RespUs);
        System.out.println("Valor atual: " + d);
        byte b = (byte) d;
        System.out.println("Valor convertido em Byte: " + b);
    }
// i) Classe Double: métodos parseByte().
// ii) O método convertByte_Double() (a seguir) converte um valor Byte para Double. 
// iii) Referência: https://www.tutorialspoint.com/can-you-cast-a-byte-object-to-a-double-value-in-java
    public static void convertByte_Double() {
        String RespUs = entrada("Digite um valor byte: ");
        byte b = Byte.parseByte(RespUs);
        System.out.println("Valor atual: " + b);
        double d = (double) b;
        System.out.println("Valor convertido em Double: " + d);
    }
// i) Classe Character: métodos parseShort().
// ii) O método convertShort_Char() (a seguir) converte um valor Short para Character. 
// iii) Referência: https://www.convertdatatypes.com/Convert-short-to-char-in-Java.html
    public static void convertShort_Char() {
        String RespUs = entrada("Digite um valor short: ");
        short s = Short.parseShort(RespUs);
        System.out.println("Valor atual: " + s);
        char c = (char) s;
        System.out.println("Valor convertido em Char: " + c);
    }
// i) Classe Boolean: métodos parseFloat(). 
// ii) O método convertFloat_Boolean() (a seguir) converte um valor Float para Boolean. 
// iii) Referência: http://www.java2s.com/example/java-utility-method/float-to-boolean/floattoboolean-float-values-9e9f6.html
    public static void convertFloat_Boolean() {
        String RespUs = entrada("Digite um valor float: ");
        float f = Float.parseFloat(RespUs);
        System.out.println("Valor atual: " + f);
        boolean b = f != 0.0f;
        System.out.println("Valor convertido em Boolean: " + b);
    }
// i) Classe Integer: métodos parseLong().
// ii) O método convertLong_Int() (a seguir) converte um valor Long para Integer. 
// iii) Referência: https://www.javatpoint.com/java-long-to-int
    public static void convertLong_Int() {
        String RespUs = entrada("Digite um valor long: ");
        long l = Long.parseLong(RespUs);
        System.out.println("Valor atual: " + l);
        int i = (int) l;
        System.out.println("Valor convertido em Int: " + i);
    }
    
}
    

