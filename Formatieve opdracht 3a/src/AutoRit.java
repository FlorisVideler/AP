import java.util.Objects;

public class AutoRit implements Comparable<AutoRit> {
    int afstand;
    int benzineKosten;
    public AutoRit(int afstand, int benzineKosten){
        this.afstand = afstand;
        this.benzineKosten = benzineKosten;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass()){
            return false;
        }else if (this == o){
            return true;
        }else{
            AutoRit autoRit = (AutoRit) o;
            return afstand == autoRit.afstand && benzineKosten == autoRit.benzineKosten;
        }
    }

    @Override
    public int compareTo(AutoRit o) {
        if (o.equals(this)){
            return 0;
        } else if(o.afstand + o.benzineKosten < this.afstand + this.benzineKosten){
            return 1;
        }else{
            return -1;
        }
    }
}
