
package exercicio4;

import java.io.*;

public class leitura {
    public static void main(String[] args) {
        int lerInt = 0;
        double lerDouble = 0;
        
        try{
            InputStream in = new FileInputStream("configuracao.txt");
            DataInputStream i = new DataInputStream(in);
            lerInt = i.readInt();
            lerDouble = i.readDouble();
            System.out.println("Int:" + lerInt);
            System.out.println("Double:" + lerDouble);
            i.close();
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
