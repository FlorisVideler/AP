public class AutoHuur {
    int aantalDagen;
    Klant huurder;
    Auto gehuurdeAuto;
    public AutoHuur() {

    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double getTotaalPrijs() {
        if (gehuurdeAuto == null) {
            return 0.0 * aantalDagen;
        } else {
            if (huurder == null){
                return gehuurdeAuto.getPrijsPerDag() * aantalDagen;
            }else {
                double koring = (100.0 - huurder.getKorting()) / 100;
                return gehuurdeAuto.getPrijsPerDag() * aantalDagen * koring;
            }

        }
    }

    public String toString() {
        String txt = "\n";
        if (gehuurdeAuto == null) {
            txt += "er is geen auto bekend\n";
        }else {
            txt += getGehuurdeAuto().toString() + "\n";
        }

        if (huurder == null) {
            txt += "er is geen huurder bekend\n";
        }else {
            txt += huurder.toString() + "\n";
        }
        txt += "aantal dagen: " + aantalDagen + " en dat kost " + getTotaalPrijs() + "\n";


        return txt;
    }
}
