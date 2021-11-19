package WitchHunt;

import WitchHunt.Players.Player;

import java.util.ArrayList;

public class Game {
    private int numPlayer;
    private Game instance;
    private ArrayList<Player> playerList;
    private Player nextPlayer;

    private Game(int nb_players) {
        if (nb_players >= 3 && nb_players <=6){
            this.numPlayer=nb_players;
            this.playerList=;
            this.nextPlayer=this.playerList.get((int)(1+Math.random()*(6-1+1)));
        }else{
            System.out.println("You need to start a game with 3 to 6 players");
        }
    }
    public Game getInstance() {

    }

    public int getNumPlayer() {

    }

    public void donnerCards() {

    }
    public void addPlayer(int nb=1) {

    }

    public  void addBot(int nb_bot=1) {

    }

}
