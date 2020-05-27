public class Treinrit extends Stap implements Comparable<Treinrit>{
    int tijdInMinuten;

    public Treinrit(int tijdInMinuten, Node node){
        this.tijdInMinuten = tijdInMinuten;
        this.destination = node;
    }

    int getDistance(){
        return this.tijdInMinuten;
    }

    @Override
    public int compareTo(Treinrit o) {
        if (o.equals(this)){
            return 0;
        } else if(o.tijdInMinuten < this.tijdInMinuten){
            return 1;
        }else{
            return -1;
        }
    }
}
