package constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToppingType {

    public static final List<String> toppings = new ArrayList<>();
    public static final String ANCHOVY = "anchovy";
    public static final String BEEF = "beef";
    public static final String BLACK_OLIVES = "black olives";
    public static final String CHICKEN = "chicken";
    public static final String CHICKEN_BREAST = "chicken breast";
    public static final String HAM = "ham";
    public static final String MOZZARELLA = "mozzarella";
    public static final String MUSHROOM = "mushrooms";
    public static final String OREGANO = "oregano";
    public static final String PEPERONI = "peperoni";
    public static final String PINEAPPLE = "pineapples";
    public static final String TOMATO = "tomatoes";
    public static final String GARLIC = "garlic";

    static {
        toppings.addAll(Arrays.asList(ANCHOVY, BEEF, BLACK_OLIVES, CHICKEN, CHICKEN_BREAST,
                HAM, MOZZARELLA, MUSHROOM, OREGANO, PEPERONI, PINEAPPLE, TOMATO, GARLIC));
    }
}
