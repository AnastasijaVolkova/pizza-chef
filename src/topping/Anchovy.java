package topping;

public class Anchovy extends ToppingDecorator {

    public Anchovy(Topping topping) {
        super(topping);
    }

    @Override
    public String addTopping() {
        return super.addTopping() + " Anchovy";
    }
}
