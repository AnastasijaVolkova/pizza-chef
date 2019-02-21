package sauce;

public class Sauce {

   private String garlic = "Garlic";
   private String pasteTomato = "Boring tomatoes";
   private String love = "Without love";

    public Sauce(String garlic, String pasteTomato, String love) {
        this.garlic = garlic;
        this.pasteTomato = pasteTomato;
        this.love = love;
    }

    public String getGarlic() {
        return garlic;
    }

    public void setGarlic(String garlic) {
        this.garlic = garlic;
    }

    public String getPasteTomato() {
        return pasteTomato;
    }

    public void setPasteTomato(String pasteTomato) {
        this.pasteTomato = pasteTomato;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }
}
