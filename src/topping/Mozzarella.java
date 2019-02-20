package topping;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Topping topping) {
        super(topping);
    }

    @Override
    public String addTopping() {
        return super.addTopping() + " Mozzarella";
    }
}
