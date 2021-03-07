import java.util.ArrayList;
import java.util.List;

public class Database {

    private final List<List<Recipe>> recipeList = new ArrayList<>();
    private final List<List<Body>> bodyList = new ArrayList<>();

    public List<List<Recipe>> getRecipeList() {
        return recipeList;
    }

    public List<List<Body>> getBodyList() {
        return bodyList;
    }

    public Database(){

        List<Recipe> swedishList = new ArrayList<>();

        Recipe swedish1 = new Recipe("Köttbullar med potatis", "1h", "110kr", "Svensk");
        swedishList.add(swedish1);

        Recipe swedish2 = new Recipe("Pannbiff med lök", "1h 10min", "100kr", "Svensk");
        swedishList.add(swedish2);

        Recipe swedish3 = new Recipe("Lax med sallad", "30min", "120kr", "Svensk");
        swedishList.add(swedish3);

        Recipe swedish4 = new Recipe("Korv stroganoff", "40", "80kr", "Svensk");
        swedishList.add(swedish4);

        List<Body> swedishBodyList = new ArrayList<>();

        Body swedishBody1 = new Body("Mjölk, Ströbröd, Blandfärs, Ägg, Grädde, Smör, Lök, Potatis, Lingon, Socker, Gurka, Ättika, Persilja, Soja",
                """
                        1. Blanda ägg, mjölk och ströbröd, låt det svälla i 10 minuter.
                        2. Tillsätt blandfärsen, krydda med salt, peppar och stekt lök.
                        3. Sätt på ugnen på 50 grader.
                        4. Koka potatis och stek Köttbullarna i rikligt med smör, lägg sedan in dom i ugnen tills allt annat är klart.
                        5. Häll grädde i pannan där köttbullarna stektes i. Tillsätt vatten, soja och peppar.\s
                        6. Blanda lingonen med socker, skiva gurka och lägg det i en 1-2-3 lag.
                        7. Servera köttbullarna med kokt potatis, råröda lingon, prästgurka och färsk persilja.""");
        swedishBodyList.add(swedishBody1);

        Body swedishBody2 = new Body("Potatis, Lök, Blandfärs, Persilja, Saltgurka, Soja, Ströbröd, Mjölk, Ägg"
                , """
                1. Blanda ägg, mjölk och ströbröd, låt det svälla i 10 minuter.
                2. Tillsätt blandfärsen, krydda med salt och peppar.
                3. Sätt på ugnen på 75 grader.
                4. Koka potatis och stek panbiffarna i rikligt med smör, lägg sedan in dom i ugnen tills allt annat är klart.
                5. Stek lök i samma panna som pannbiffarna stektes i. Tillsätt vatten, soja och peppar.\s
                6. Servera panbiffarna med kokt potatis, löksky, saltgurka och färsk persilja.""");
        swedishBodyList.add(swedishBody2);

        Body swedishBody3 = new Body("Sallad, Tomat, Gurka, Vitlök, Selleri, Lök, Oliver, Feta ost, Senap, Oliv Olja, Vinäger, Citron, Oregano, Timjan, Lax",
                """
                        1. Tina laxen.\s
                        2. Hacka alla grönsaker.\s
                        3. Blanda senap, olja, vinäger, vitlök, salt, peppar och oregano till en vinegrette.
                        4. Stek laxen med salt, peppar och timjan. Pressa på citron när den är klar.
                        5. Blanda salladen med vinegretten och servera den med laxen.""");
        swedishBodyList.add(swedishBody3);

        Body swedishBody4 = new Body("Falukorv, Ris, Tomatpure, Gul lök, Vitlök, Mjölk, Senap, Soja, Persilja",
                """

                        1. Strimla lök och falukorv.
                        2. Fräs på det och tillsätt tomatpure och pressad vitlök.
                        3. Häll i mjölken, senap, salt och peppar. Låt det puttra.
                        4. Koka ris och servera med korv stroganoffen""");
        swedishBodyList.add(swedishBody4);

        List<Recipe> americanList = new ArrayList<>();

        Recipe american1 = new Recipe("Hamburgare", "25min", "110kr", "Amerikansk");
        americanList.add(american1);

        Recipe american2 = new Recipe("Ribs", "8h", "90kr", "Amerikansk");
        americanList.add(american2);

        Recipe american3 = new Recipe("Chili", "1h 30min", "100kr", "Amerikansk");
        americanList.add(american3);

        List<Body> americanBodyList = new ArrayList<>();

        Body americanBody1 = new Body("Nötkött, Bröd, Tomat, Saltgurka, Majonnäs, Ketchup, Senap, Ost"
                , """
                1. Förbered alla tillbehör.
                2. Platta ut burgarna och krydda med salt och peppar.
                3. Rosta bröden och konstruera burgaren.""");
        americanBodyList.add(americanBody1);

        List<Recipe> italianList = new ArrayList<>();

        Recipe italian1 = new Recipe("Pizza", "30min", "100kr", "Italiensk");
        italianList.add(italian1);

        Recipe italian2 = new Recipe("Bolognese", "2h", "125kr", "Italiensk");
        italianList.add(italian2);

        Recipe italian3 = new Recipe("Carbonara", "25min", "90kr", "Italiensk");
        italianList.add(italian3);

        List<Body> italianBodyList = new ArrayList<>();

        Body italianBody1 = new Body("Pizza Kit, Ost, Skinka, Lök, Champinjoner, Vitlök, Oregano"
                , """
                1. Sätt på ungen på 200 grader.
                2. Strimla alla toppings.
                3. Lägg ut degen på en oljad ugnsplåt.
                4. Lägg på tomatsås och alla toppings.
                5. Lägg in pizzan i ugnen i cirka 15 minuter.""");
        italianBodyList.add(italianBody1);

        List<Recipe> asianList = new ArrayList<>();

        Recipe asian1 = new Recipe("Kyckling med currysås", "1h", "150kr", "Asiatiskt");
        asianList.add(asian1);

        List<Body> asianBodyList = new ArrayList<>();

        Body asianBody1 = new Body("Kycklinglårfile, ris, curry, paprikapulver, lökpulver, " +
                "vitlökspulver, oregano, grädde, gul lök, hönsbuljong, olja, smör",
                """
                        1. Marinera kycklingen med salt, peppar, curry, paprikapulver, lökpulver, vitlökspulver, oregano och olja.
                        2. Stek lök och curry i smör. Tillsätt hönsbuljongen och låt det koka upp, häll sedan i grädden och sänk till låg värme.
                        3. Lägg in kycklingen i ugnen i cirka 25 minuter och koka ris.
                        4. Servera kycklingen med ris och currysås.""");
        asianBodyList.add(asianBody1);

        recipeList.add(swedishList);
        recipeList.add(americanList);
        recipeList.add(italianList);
        recipeList.add(asianList);

        bodyList.add(swedishBodyList);
        bodyList.add(americanBodyList);
        bodyList.add(italianBodyList);
        bodyList.add(asianBodyList);
    }
}