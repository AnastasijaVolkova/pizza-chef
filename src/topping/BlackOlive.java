package topping;

public class BlackOlive extends ToppingDecorator {

    public BlackOlive(Topping topping) {
        super(topping);
    }

    @Override
    public String addTopping() {
        return super.addTopping() + " Black olive";
    }
}
