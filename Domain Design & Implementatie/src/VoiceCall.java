import java.util.ArrayList;

public class VoiceCall implements Call {
    ArrayList<Gebruiker> gebruikers = new ArrayList<Gebruiker>();

    public VoiceCall(Gebruiker starter, Gebruiker ontvanger){
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

    @Override
    public String toString() {
        String gebruikersString = "";
        for (Gebruiker g : gebruikers) {
            gebruikersString += "\n" + g.gebruikersnaam;
        }
        return "Deze voice call heeft " + gebruikers.size() + " gebruikers erin zitten, dat zijn: " + gebruikersString;
    }
}
