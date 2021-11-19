package WitchHunt.Players;

import WitchHunt.Cards.IdentityCards.Identity;
import WitchHunt.Cards.RumorCards.AbstractRumorCard;

import java.util.ArrayList;

public class Player {
    private Identity identity;
    private int numCards;
    private boolean statusIdentity;
    private int point;
    private ArrayList<AbstractRumorCard> cardsList;
    private String nom;


    public void accuse(Player player) {

    }

    public void revealIdentity() {

    }

    public void takeEffect(AbstractRumorCard card) {

    }

    public Player nextPlayer() {

        return Player;
    }

    //getter and setter functions

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public int getNumCards() {
        return numCards;
    }

    public void setNumCards(int numCards) {
        this.numCards = numCards;
    }

    public boolean isStatusIdentity() {
        return statusIdentity;
    }

    public void setStatusIdentity(boolean statusIdentity) {
        this.statusIdentity = statusIdentity;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public ArrayList<AbstractRumorCard> getCardsList() {
        return cardsList;
    }

    public void setCardsList(ArrayList<AbstractRumorCard> cardsList) {
        this.cardsList = cardsList;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
