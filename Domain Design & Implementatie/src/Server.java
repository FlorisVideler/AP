import java.util.ArrayList;
import java.util.Objects;

public class Server {
    ArrayList<Gebruiker> gebruikers = new ArrayList<Gebruiker>();
    ArrayList<Kanaal> kanalen = new ArrayList<Kanaal>();
    String naam;

    public Server(String naam){
        this.naam = naam;
    }

    public Kanaal maakKanaal(String naam, String type, int limit) {
        Kanaal nieuwKanaal = new Kanaal(naam, type, limit);
        kanalen.add(nieuwKanaal);
        return nieuwKanaal;
    }

    public void verwijderKanaal(Kanaal kanaal) {
        kanalen.remove(kanaal);
    }

    public void joinServer(Gebruiker gebruiker) {
        gebruikers.add(gebruiker);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        return false;
    }

    @Override
    public String toString() {
        String gebruikersString = "";
        for (Gebruiker g : gebruikers) {
            gebruikersString += "\n" + g.gebruikersnaam;
        }
        return String.format("De server: '%s', heeft %s gebruikers en %s kanalen. De leden zijn: %s", naam, gebruikers.size(), kanalen.size(), gebruikersString);
    }
}
