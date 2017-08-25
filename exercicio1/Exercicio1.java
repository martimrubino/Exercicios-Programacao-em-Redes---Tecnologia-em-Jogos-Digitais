
package exercicio1;

import java.io.*;

public class Exercicio1 {

    
    public static void main(String[] args) {
        String msgOut = "Novo Recodre: Jogador 1";
        byte[] msgIn = new byte[100];
        
        try{
            OutputStream out = new FileOutputStream("teste.txt");
            out.write(msgOut.getBytes());
            out.close();
            
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


















