public class Main {
    public static void main(String[] args) {
        Gebruiker zipperlemon = new Gebruiker("zipperlemon");
        System.out.println(zipperlemon.toString());
        Server zippersServer = zipperlemon.maakServer("Zippers server");
        System.out.println(zippersServer.toString());
        System.out.println(zipperlemon.toString());
        // Limit 0 = 999999
        Kanaal general = zippersServer.maakKanaal("General", "voice", 0);
        System.out.println(zippersServer.toString());
        System.out.println(general.toString());

        Gebruiker david = new Gebruiker("david");
        VoiceCall voice1 = zipperlemon.startVoice(david);
        System.out.println(voice1.toString());
    }
}
