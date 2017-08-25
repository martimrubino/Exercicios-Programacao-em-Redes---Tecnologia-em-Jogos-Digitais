
package exercicio2;

import java.io.*;

public class Exercicio2 {

   
    public static void main(String[] args) {
        byte[] msgIn = new byte[100];
        
        try{
            InputStream in = new FileInputStream("teste.txt");
            in.read(msgIn);
            System.out.println(new String(msgIn));
            in.close();
        }
        catch(Exception e){
            System.err.println(e);
        }
        
        
    }
    
}
