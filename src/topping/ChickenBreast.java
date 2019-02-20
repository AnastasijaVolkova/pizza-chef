package topping;

public class ChickenBreast extends ToppingDecorator {

    public ChickenBreast(Topping topping) {
        super(topping);
    }

    @Override
    public String addTopping() {
        return super.addTopping() + " Chicken breast";
    }
}
