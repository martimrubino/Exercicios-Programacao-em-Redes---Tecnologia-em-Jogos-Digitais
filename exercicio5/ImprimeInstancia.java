
package exercicio5;

import java.io.*;

public class ImprimeInstancia {
    public static void main(String[] args) {
        Jogador playerIn = null;
        
        try{
            InputStream in = new FileInputStream("SavedGame");
            ObjectInputStream i = new ObjectInputStream(in);
            playerIn = (Jogador) i.readObject();
            System.out.println("Nome: "+playerIn.getNome() + ", Pontos: "+playerIn.getPontos() + ", Fase: " + playerIn.getFase());
            i.close();
        }   
        catch(Exception e){
            System.err.println(e);
        }
    }
}


















