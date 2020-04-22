public class Kanaal {
    String naam;
    String type;
    int limit = 99999;

    public Kanaal(String naam, String type, int limit){
        this.naam = naam;
        this.type = type;
        if (limit != 0){
            this.limit = limit;
        }
    }


    @Override
    public String toString() {
        return "Het kanaal '" + naam + "' is een " + type + " kanaal en er kunnen " + limit + " mensen in.";
    }
}
