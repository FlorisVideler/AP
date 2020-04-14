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
        double kortingsDouble = (100.0 - (kortingPerJaar * releaseJaar)) / 100.0;
        huidigePrijs = nieuwPrijs * kortingsDouble;
    }
}
