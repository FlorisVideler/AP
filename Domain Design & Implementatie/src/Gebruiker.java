import java.util.ArrayList;
import java.util.Objects;

public class Gebruiker {
    ArrayList<Server> servers = new ArrayList<Server>();
    String gebruikersnaam;

    public Gebruiker(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public Server maakServer(String naam) {
        Server nieuweServer = new Server(naam);
        joinServer(nieuweServer);
        return nieuweServer;
    }

    public void joinServer(Server server){
        server.gebruikers.add(this);
        servers.add(server);
    }

    public void leaveServer(Server server){
        servers.remove(server);
        server.gebruikers.remove(this);
    }

    public VoiceCall startVoice(Gebruiker gebruiker){
        return new VoiceCall(this, gebruiker);
    }

    public void addToVoice(VoiceCall voiceCall, Gebruiker gebruiker){
        voiceCall.connect(gebruiker);
    }

    public VideoCall startVideo(Gebruiker gebruiker){
        return new VideoCall(this, gebruiker);
    }

    public void addToVideo(VideoCall videoCall, Gebruiker gebruiker){
        videoCall.connect(gebruiker);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Gebruiker gebruiker = (Gebruiker) o;
        return Objects.equals(gebruikersnaam, gebruiker.gebruikersnaam);
    }

    public String toString() {
        String serversString = "";
        for (Server s : servers) {
            serversString += "\n" + s.naam;
        }
        return String.format("De gebruiker '%s' zit in %s servers. Dat zijn: %s", gebruikersnaam, servers.size(), serversString);
    }
}
