import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        VideoCall videoCall = (VideoCall) o;
        return Objects.equals(videoCall, videoCall.gebruikers);
    }

    public String toString() {
        String gebruikersString = "";
        for (Gebruiker g : gebruikers) {
            gebruikersString += "\n" + g.gebruikersnaam;
        }
        return "";
    }
}
