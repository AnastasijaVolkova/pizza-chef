package topping;

public class Beef extends ToppingDecorator {
    public Beef(Topping topping) {
        super(topping);
    }

    @Override
    public String addTopping() {
        return super.addTopping() + " Beef";
    }
}
