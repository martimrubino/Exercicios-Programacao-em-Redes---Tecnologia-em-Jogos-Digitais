
package exercicio5;

import java.io.*;

public class CriaInstancia {
    public static void main(String[] args) {
        Jogador playerOut = new Jogador("Martim", 1268, 3);
        
        try{
            OutputStream out = new FileOutputStream("SavedGame");
            ObjectOutputStream o = new ObjectOutputStream(out);
            o.writeObject(playerOut);
            o.close();
            System.out.println("Instancia Jogador criada com sucesso!");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}




























