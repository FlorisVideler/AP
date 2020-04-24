import java.util.ArrayList;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        VoiceCall voiceCall = (VoiceCall) o;
        return Objects.equals(voiceCall, voiceCall.gebruikers);
    }

    @Override
    public String toString() {
        String gebruikersString = "";
        for (Gebruiker g : gebruikers) {
            gebruikersString += "\n" + g.gebruikersnaam;
        }
        return String.format("Deze voice call heeft %s gebruikers erin zitten, dat zijn: %s", gebruikers.size(), gebruikersString);
    }
}
