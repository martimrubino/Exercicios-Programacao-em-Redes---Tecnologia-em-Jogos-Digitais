
package exercicio6;

import java.io.*;

public class ImprimeInstancias {
    public static void main(String[] args) {
        
        try{
            InputStream in = new FileInputStream("SavedGame");
            ObjectInputStream i = new ObjectInputStream(in);
            int totalPlayers = i.readInt();
            
            for(int num = 0; num < totalPlayers; num++){
                Jogador playerIn = null;
                playerIn = (Jogador) i.readObject();
                System.out.println("Nome: "+playerIn.getNome() + ", Pontos: "+playerIn.getPontos() + ", Fase: " + playerIn.getFase());
            }
            i.close();
        }   
        catch(Exception e){
            System.err.println(e);
        }
    }
}
