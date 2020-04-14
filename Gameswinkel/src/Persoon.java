import java.text.DecimalFormat;
import java.util.ArrayList;

public class Persoon {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    String naam;
    double budget;
    ArrayList<Game> games = new ArrayList<Game>();
    public Persoon (String persoonNaam, double persoonBudget) {
        naam = persoonNaam;
        budget = persoonBudget;
    }

    public Boolean koop(Game game) {
        if (games.contains(game)) {
            return false;
        }else {
            if (game.huidigePrijs > budget) {
                return false;
            }else {
                games.add(game);
                budget = Double.parseDouble(df2.format(budget - game.huidigePrijs).replace(",", "."));;
                return true;
            }
        }
    }

    public String toString() {
        String txt = naam + " heeft een budget van €" + budget + " en bezit de volgende games:\n";
        if (games.size() > 0) {
            for (Game i : games) {
                txt += i.naam + ", uitgegeven in " + i.releaseJaar + "; nieuwprijs: €" + i.nieuwPrijs + " nu voor: €" + i.huidigePrijs + "\n";
            }
        }else {
            txt += "Geen";
        }
        return txt;
    }
}
