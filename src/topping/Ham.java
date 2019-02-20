package topping;

public class Ham extends ToppingDecorator {
    public Ham(Topping topping) {
        super(topping);
    }

    @Override
    public String addTopping() {
        return super.addTopping() + " Ham";
    }
}
