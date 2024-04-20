package com.example;

public class Jogo {

    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {

        monte.embaralhar();

    }

    public Carta distribuiCartaParaJogador(Jogador jogador){

        if (jogador.parou()){
            return null;
        } else {
            jogador.receberCarta(monte.virar());
        }
        return monte.virar();

    }

    public boolean acabou(){
        
        if (jogador.parou() && computador.parou()){
            return true;
        } else if (jogador.getPontos() > 21 || computador.getPontos() > 21){
            return true;
        }
        return false;

    }

    public String resultado(){
        
        if (jogador.getPontos() <= 21 || jogador.getPontos() > computador.getPontos()){
            return "Você ganhou";
        } else if (computador.getPontos() > jogador.getPontos()) {
            return "Você perdeu";
        }
        return "empate";

    }

    public Jogador getJogador() {

        return jogador;

    }

    public Computador getComputador() {

        return computador;

    }
    
}