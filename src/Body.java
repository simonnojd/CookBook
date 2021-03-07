public class Body {

    private final String ingredients;
    private final String intructions;

    public Body(String ingredients, String intructions) {
        this.ingredients = ingredients;
        this.intructions = intructions;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getIntructions() {
        return intructions;
    }
}