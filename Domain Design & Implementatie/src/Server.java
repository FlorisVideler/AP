import java.util.ArrayList;

public class Server {
    private String locatie;
    private String naam;
    private ArrayList<Gebruiker> gebruikers = new ArrayList<Gebruiker>();
    public Server (String locatie, String naam, Gebruiker maker) {
        this.locatie = locatie;
        this.naam = naam;
        this.gebruikers.add(maker);
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
