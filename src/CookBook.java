import java.util.Scanner;

public class CookBook {

    public CookBook() {
        writeIntro();
        writeDishes();
    }

    public void writeIntro() {
        Database database = new Database();
        System.out.println("Välkommen till Simons kokbok!");
        System.out.println("Vilken typ av mat är du sugen på att laga?");
        System.out.println("Skriv den siffra som kategorin står under");
        System.out.println("1. " + database.getRecipeList().get(0).get(0).getCategory());
        System.out.println("2. " + database.getRecipeList().get(1).get(0).getCategory());
        System.out.println("3. " + database.getRecipeList().get(2).get(0).getCategory());
        System.out.println("4. " + database.getRecipeList().get(3).get(0).getCategory());
    }

    // Method with switch case that prints out all the dishes in selected category
    public void writeDishes() {

        Database database = new Database();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Välj en rätt, skriv siffran som den står på");
                for (int i = 1; i < 5; i++)
                    System.out.println(i + ". " + database.getRecipeList().get(0).get(i-1).getName());
                writeInfoAboutDishes(0);
            }
            case 2 -> {
                System.out.println("Välj en rätt, skriv siffran som den står på");
                for (int i = 1; i < 4; i++)
                    System.out.println(i + ". " + database.getRecipeList().get(1).get(i-1).getName());
                writeInfoAboutDishes(1);
            }
            case 3 -> {
                System.out.println("Välj en rätt, skriv siffran som den står på");
                for (int i = 1; i < 4; i++)
                    System.out.println(i + ". " + database.getRecipeList().get(2).get(i-1).getName());
                writeInfoAboutDishes(2);
            }
            case 4 -> {
                System.out.println("Välj en rätt, skriv siffran som den står på");
                for (int i = 1; i < 2; i++)
                    System.out.println(i + ". " + database.getRecipeList().get(3).get(i-1).getName());
                writeInfoAboutDishes(3);
            }
        }
    }

    // Takes the chosen category and prints out the chosen recipe
    public void writeInfoAboutDishes(int category) {

        Database database = new Database();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        String goBack;

        switch (choice) {
                case 1 -> {
                    clearConsole();
                    System.out.println("Du valde " +
                           database.getRecipeList().get(category).get(0).getName()+ ".");
                    System.out.println("Det tar ungefär " +
                           database.getRecipeList().get(category).get(0).getCookingTime() + " att laga.");
                    System.out.println("Rätten kostar cirka " +
                           database.getRecipeList().get(category).get(0).getPrice() + " kronor.");
                    System.out.println("\n------INGREDIENSER------");
                    System.out.println(database.getBodyList().get(category).get(0).getIngredients());
                    System.out.println("\n------INSTRUKTIONER------");
                    System.out.println(database.getBodyList().get(category).get(0).getIntructions());

                    System.out.println("\n\nVill du gå tillbaks? Skriv isåfall ja");
                    goBack = scanner.next();
                    if (goBack.equalsIgnoreCase("JA")) {
                        clearConsole();
                        writeIntro();
                        writeDishes();
                    }
                }
                case 2 -> {
                    clearConsole();
                    System.out.println("Du valde " +
                            database.getRecipeList().get(category).get(1).getName()+ ".");
                    System.out.println("Det tar ungefär " +
                            database.getRecipeList().get(category).get(1).getCookingTime() + " att laga.");
                    System.out.println("Rätten kostar cirka " +
                            database.getRecipeList().get(category).get(1).getPrice() + " kronor.");
                    System.out.println("\n------INGREDIENSER------");
                    System.out.println(database.getBodyList().get(category).get(1).getIngredients());
                    System.out.println("\n------INSTRUKTIONER------");
                    System.out.println(database.getBodyList().get(category).get(1).getIntructions());

                    System.out.println("\n\nVill du gå tillbaks? Skriv isåfall ja");
                    goBack = scanner.next();
                    if (goBack.equalsIgnoreCase("JA")) {
                        clearConsole();
                        writeIntro();
                        writeDishes();
                    }
                }
                case 3 -> {
                    clearConsole();
                    System.out.println("Du valde " +
                            database.getRecipeList().get(category).get(2).getName()+ ".");
                    System.out.println("Det tar ungefär " +
                            database.getRecipeList().get(category).get(2).getCookingTime() + " att laga.");
                    System.out.println("Rätten kostar cirka " +
                            database.getRecipeList().get(category).get(2).getPrice() + " kronor.");
                    System.out.println("\n------INGREDIENSER------");
                    System.out.println(database.getBodyList().get(category).get(2).getIngredients());
                    System.out.println("\n------INSTRUKTIONER------");
                    System.out.println(database.getBodyList().get(category).get(2).getIntructions());

                    System.out.println("\n\nVill du gå tillbaks? Skriv isåfall ja");
                    goBack = scanner.next();
                    if (goBack.equalsIgnoreCase("JA")) {
                        clearConsole();
                        writeIntro();
                        writeDishes();
                    }
                }
                case 4 -> {
                    clearConsole();
                    System.out.println("Du valde " +
                           database.getRecipeList().get(category).get(3).getName()+ ".");
                    System.out.println("Det tar ungefär " +
                          database.getRecipeList().get(category).get(3).getCookingTime() + " att laga.");
                    System.out.println("Rätten kostar cirka " +
                           database.getRecipeList().get(category).get(3).getPrice() + " kronor.");
                    System.out.println("\n------INGREDIENSER------");
                    System.out.println(database.getBodyList().get(category).get(3).getIngredients());
                    System.out.println("\n------INSTRUKTIONER------");
                    System.out.println(database.getBodyList().get(category).get(3).getIntructions());

                    System.out.println("\n\nVill du gå tillbaks? Skriv isåfall ja");
                    goBack = scanner.next();
                    if (goBack.equalsIgnoreCase("JA")) {
                        clearConsole();
                        writeIntro();
                        writeDishes();
                    }
                }
        }
    }

    // "Clear" console method
    public static void clearConsole() {
        for (int i = 0; i < 30; ++i) System.out.println();
    }

    public static void main(String[] args) {
        CookBook cookBook = new CookBook();
    }
}