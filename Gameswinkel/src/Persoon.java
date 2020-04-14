import java.util.ArrayList;

public class Persoon {
    String naam;
    double budget;
    ArrayList<Game> games = new ArrayList<Game>();
    public Persoon (String persoonNaam, double persoonBudget) {
        naam = persoonNaam;
        budget = persoonBudget;
    }

    public boolean koop(Game game) {
        if (games.contains(game)) {
            return false;
        }else {
            if (game.huidigePrijs > budget) {
                return false;
            }else {
                games.add(game);
                budget = budget - game.huidigePrijs;
                return true;
            }
        }
    }
}
