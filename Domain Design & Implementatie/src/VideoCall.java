import java.util.ArrayList;

public class VideoCall implements Call{
    ArrayList<Gebruiker> gebruikers = new ArrayList<Gebruiker>();

    public VideoCall(Gebruiker starter, Gebruiker ontvanger) {
        connect(starter);
        connect(ontvanger);
    }

    @Override
    public void connect(Gebruiker gebruiker) {
        gebruikers.add(gebruiker);
    }

    @Override
    public void disconnect(Gebruiker gebruiker) {
        gebruikers.remove(gebruiker);
    }

    public String toString() {
        String gebruikersString = "";
        for (Gebruiker g : gebruikers) {
            gebruikersString += "\n" + g.gebruikersnaam;
        }
        return "";
    }
}
