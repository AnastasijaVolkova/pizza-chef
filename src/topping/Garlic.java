package topping;

public class Garlic extends ToppingDecorator {

    public Garlic(Topping topping) {
        super(topping);
    }

    @Override
    public String addTopping() {
        return super.addTopping() + " Garlic";
    }
}
