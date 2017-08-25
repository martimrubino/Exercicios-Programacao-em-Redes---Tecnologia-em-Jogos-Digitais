
package exercicio4;

import java.io.*;

public class Exercicio4 {
    public static void main(String[] args) {
        int intNum = 255;
        double doubleNum = 3.467;
        
        try{
            OutputStream out = new FileOutputStream("configuracao.txt");
            DataOutputStream o = new DataOutputStream(out);
            o.writeInt(intNum);
            o.writeDouble(doubleNum);
            o.close();
            System.out.println("Arquivo criado com sucesso!");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
    
}



















