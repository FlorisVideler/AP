public class Zwembad {
    double zwembadBreedte;
    double zwembadLengte;
    double zwembadDiepte;
    public Zwembad(double breedte, double lengte, double diepte) {
        zwembadBreedte = breedte;
        zwembadLengte = lengte;
        zwembadDiepte = diepte;
    }

    public Zwembad() {
        //Als er geen parameters worden doorgegeven
    }


    public double getBreedte() {
        return zwembadBreedte;
    }

    public void setBreedte(double newBreedte) {
        zwembadBreedte = newBreedte;
    }

    public double getLengte() {
        return zwembadLengte;
    }

    public void setLengte(double newLengte) {
        zwembadLengte = newLengte;
    }

    public double getDiepte() {
        return zwembadDiepte;
    }

    public void setDiepte(double newDiepte) {
        zwembadDiepte = newDiepte;
    }

    public double inhoud() {
        return zwembadDiepte * zwembadLengte * zwembadBreedte;
    }

    public String toString() {
        return "Dit zwembad is " + zwembadBreedte + " meter breed, " +  zwembadLengte + " meter lang, en " + zwembadDiepte + " meter diep";
    }


}
