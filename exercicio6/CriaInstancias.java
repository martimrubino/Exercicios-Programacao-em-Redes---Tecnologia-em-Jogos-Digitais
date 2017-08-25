
package exercicio6;

import java.io.*;
import java.util.Scanner;

public class CriaInstancias {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        try{
            OutputStream out = new FileOutputStream("SavedGame");
            ObjectOutputStream o = new ObjectOutputStream(out);
            
            System.out.print("Digite o numero de jogadores:");
            int totalPlayers = ler.nextInt();
            
            o.writeInt(totalPlayers);
            
            for(int i = 0; i < totalPlayers; i++){
                System.out.println("Digite o nome do jogador:");
                String nome = ler.nextLine();
                System.out.println("Digite a pontuacao atual do jogador:");
                int pontos = ler.nextInt();
                System.out.println("Digite a fase atual do jogador:");
                int fase = ler.nextInt();
                Jogador playerOut = new Jogador(nome, pontos, fase);
                o.writeObject(playerOut);
            }
            
            o.close();
            System.out.println("Instancia Jogador criada com sucesso!");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
