package topping;

public class Tomato extends ToppingDecorator {

    public Tomato(Topping topping) {
        super(topping);
    }

    @Override
    public String addTopping() {
        return super.addTopping() + " Tomato";
    }
}
