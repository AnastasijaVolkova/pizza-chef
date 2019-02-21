package topping;

import constant.PizzaType;

public class ToppingFactory {

    public Topping addToppings(String type) {
        switch (type) {
            case PizzaType.FUNGHI:
                return new Mushroom(new Mozzarella(new Garlic(new ToppingImpl())));
            case PizzaType.HAWAIIAN:
                return new ChickenBreast(new Pineapple(new Ham(new Mozzarella(new ToppingImpl()))));
            case PizzaType.MARGHERITA:
                return new Tomato(new Mozzarella(new ToppingImpl()));
            case PizzaType.NAPOLITANA:
                return new Tomato(new Mozzarella(new Oregano(new Garlic(new ToppingImpl()))));
            case PizzaType.PEPERONI:
                return new Peperoni(new BlackOlive(new Mozzarella(new ToppingImpl())));
            case PizzaType.ROMANA:
                return new Anchovy(new Oregano(new Mozzarella(new ToppingImpl())));
            case PizzaType.SICILIAN:
                return new BlackOlive(new Anchovy(new Tomato(new Oregano(new Mozzarella(new ToppingImpl())))));
            default:
                return new ToppingImpl();
        }
    }
}
