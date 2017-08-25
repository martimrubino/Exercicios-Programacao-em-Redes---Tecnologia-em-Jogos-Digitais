
package exercicio5;

import java.io.Serializable;

public class Jogador implements Serializable{
    private String nome;
    private int pontos;
    private int fase;
    
    Jogador(String nome, int pontos, int fase){
        this.nome = nome;
        this.pontos = pontos;
        this.fase = fase;
    }
    
    String getNome(){
        return this.nome;
    }
    
    int getPontos(){
        return this.pontos;
    }
    
    int getFase(){
        return this.fase;
    }
    
}























