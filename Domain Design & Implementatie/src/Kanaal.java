import java.util.Objects;

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

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
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
        return "Het kanaal '" + naam + "' is een " + type + " kanaal en er kunnen " + limit + " mensen in.";
    }
}
