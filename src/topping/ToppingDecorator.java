package topping;

/*
 * Class that is used to interpret Decorator pattern
 * */
public abstract class ToppingDecorator implements Topping {
    protected Topping topping;

    public ToppingDecorator(Topping topping) {
        this.topping = topping;
    }

    @Override
    public String addTopping() {
        return topping.addTopping();
    }
}
