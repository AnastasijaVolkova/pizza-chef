package sauce;

public class SauceFacade {

    private final Garlic garlic;
    private final PasteTomato pasteTomato;
    private final Love love;

    public SauceFacade() {
        this.garlic = new Garlic();
        this.pasteTomato = new PasteTomato();
        this.love = new Love();
    }

    public Sauce makePizzaSauce() {
        String garlic = this.garlic.chop();
        String tomatoes = this.pasteTomato.squeeze();
        String pinchOfLove = this.love.putPinchOfLove();
        return new Sauce(garlic, tomatoes, pinchOfLove);
    }
}
