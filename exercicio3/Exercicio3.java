
package exercicio3;

import java.io.*;

public class Exercicio3 {

    
    public static void main(String[] args) {
        
       try{
            InputStream in = new FileInputStream("teste.txt");
            int b = in.read();
            while(b != -1){
                System.out.print((char)b);
                b = in.read();
            }
            in.close();
        }
        catch(Exception e){
            System.err.println(e);
        }
       
    }
    
}
