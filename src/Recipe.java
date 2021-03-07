public class Recipe {
    private final String name;
    private final String cookingTime;
    private final String price;
    private final String category;

    public Recipe(String name, String cookingTime, String price, String category) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public String getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}