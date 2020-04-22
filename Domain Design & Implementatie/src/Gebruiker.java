import java.util.ArrayList;

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

    public String toString() {
        String serversString = "";
        for (Server s : servers) {
            serversString += "\n" + s.naam;
        }
        return "De gebruiker '" + gebruikersnaam + "' zit in " + servers.size() + " servers. Dat zijn:" + serversString;
    }
}
