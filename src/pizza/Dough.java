package pizza;

public class Dough {

    private boolean thin;
    private boolean classic = true;
    private boolean newYorkStyle;

    public boolean isThin() {
        return thin;
    }

    public void setThin(boolean thin) {
        if (thin) {
            classic = false;
            newYorkStyle = false;
        }
        this.thin = thin;
    }

    public boolean isClassic() {
        return classic;
    }

    public void setClassic(boolean classic) {
        if (classic) {
            thin = false;
            newYorkStyle = false;
        }
        if (!thin && !newYorkStyle) {
            classic = true;
        }
        this.classic = classic;
    }

    public boolean isNewYorkStyle() {
        return newYorkStyle;
    }

    public void setNewYorkStyle(boolean newYorkStyle) {
        if (newYorkStyle) {
            classic = false;
            thin = false;
        }
        this.newYorkStyle = newYorkStyle;
    }

    @Override
    public String toString() {
        return classic ? "classic dough" : thin ? "thin dough" : newYorkStyle ? "New York style dough" : "";
    }
}
