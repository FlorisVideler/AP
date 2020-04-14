import java.time.LocalDate;

public class Game {
    String naam;
    int releaseJaar;
    double nieuwPrijs;
    double huidigePrijs;
    double kortingPerJaar = 30.0;
    public Game (String gameNaam, int gameReleaseJaar, double gameNieuwPrijs) {
        naam = gameNaam;
        releaseJaar = gameReleaseJaar;
        nieuwPrijs = gameNieuwPrijs;
        int yearsSinceRelease = LocalDate.now().getYear() - releaseJaar;
        double kortingsDouble = (100.0 - (kortingPerJaar * yearsSinceRelease)) / 100.0;
        huidigePrijs = nieuwPrijs * kortingsDouble;

    }
}
