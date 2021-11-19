package WitchHunt.Cards.RumorCards;

public class AbstractRumorCard {
    //whether it's usable
    private boolean status;
    private boolean discard;
    private String effectHunt;
    private String effectWitch;

    public AbstractRumorCard() {

    }

    public void takeEffectHunt() {

    }

    public void takeEffectWitch() {

    }

    //getter and setter funcitons
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isDiscard() {
        return discard;
    }

    public void setDiscard(boolean discard) {
        this.discard = discard;
    }


}
