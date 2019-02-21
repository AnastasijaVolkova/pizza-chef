package pizza;

import sauce.Sauce;
import topping.Topping;

public abstract class PizzaBase {

    private Dough dough;
    private Sauce sauce;
    private Topping topping;

    public PizzaBase(Dough dough, Sauce sauce, Topping topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }
}
