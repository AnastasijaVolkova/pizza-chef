package topping;

public class Mushroom extends ToppingDecorator {

    public Mushroom(Topping topping) {
        super(topping);
    }

    @Override
    public String addTopping() {
        return super.addTopping() + " Mushroom";
    }
}
