import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Game {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    String naam;
    int releaseJaar;
    double nieuwPrijs;
    double huidigePrijs;
    double kortingPerJaar = 30.0;
    public Game (String gameNaam, int gameReleaseJaar, double gameNieuwPrijs) {
        df2.setRoundingMode(RoundingMode.UP);
        naam = gameNaam;
        releaseJaar = gameReleaseJaar;
        nieuwPrijs = gameNieuwPrijs;
        int yearsSinceRelease = LocalDate.now().getYear() - releaseJaar;
        double kortingsDouble = (100.0 - (kortingPerJaar * yearsSinceRelease)) / 100.0;
        huidigePrijs = Double.parseDouble(df2.format(nieuwPrijs * kortingsDouble).replace(",", "."));
    }
}
