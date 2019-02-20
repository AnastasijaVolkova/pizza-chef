package pizza;

import topping.Topping;

public abstract class PizzaBase {

    private Dough dough;
    private Souce souce;
    private Topping topping;

    public PizzaBase(Dough dough, Souce souce, Topping topping) {
        this.dough = dough;
        this.souce = souce;
        this.topping = topping;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Souce getSouce() {
        return souce;
    }

    public void setSouce(Souce souce) {
        this.souce = souce;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }
}
