package topping;

public class Peperoni extends ToppingDecorator {

    public Peperoni(Topping topping) {
        super(topping);
    }

    @Override
    public String addTopping() {
        return super.addTopping() + " Peperoni";
    }
}
