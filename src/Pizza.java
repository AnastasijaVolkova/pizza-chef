
public abstract class Pizza {

    private Dough dough;
    private boolean cheese;
    private Souce souce;
    private boolean extraCheese;

    public Dough getDough() {
        if (dough == null) {
            dough = new Dough();
        }
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public Souce getSouce() {
        return souce;
    }

    public void setSouce(Souce souce) {
        this.souce = souce;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    @Override
    public String toString() {
        return String.join(", ", dough.toString(), cheese ? "cheese" : "",
                souce != null ? souce.toString() : "", extraCheese ? "extra cheese" : "");
    }
}
