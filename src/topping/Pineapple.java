package topping;

public class Pineapple extends ToppingDecorator {

    public Pineapple(Topping topping) {
        super(topping);
    }

    @Override
    public String addTopping() {
        return topping.addTopping() + " Pineapple";
    }
}
