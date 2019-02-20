package topping;

public class Oregano extends ToppingDecorator {

    public Oregano(Topping topping) {
        super(topping);
    }

    @Override
    public String addTopping() {
        return super.addTopping() + " Oregano";
    }
}
