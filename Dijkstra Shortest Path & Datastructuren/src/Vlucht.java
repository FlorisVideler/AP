public class Vlucht extends Stap implements Comparable<Vlucht>{
    int prijsInEuro;
    int kansDatBagageKwijtRaakt;

    public Vlucht(int prijsInEuro, int kansDatBagageKwijtRaakt, Node node){
        this.prijsInEuro = prijsInEuro;
        this.kansDatBagageKwijtRaakt = kansDatBagageKwijtRaakt;
        this.destination = node;
    }

    int getDistance(){
        return this.kansDatBagageKwijtRaakt + this.prijsInEuro;
    }

    @Override
    public int compareTo(Vlucht o) {
        if (o.equals(this)){
            return 0;
        } else if(o.kansDatBagageKwijtRaakt + o.prijsInEuro < this.kansDatBagageKwijtRaakt + this.prijsInEuro){
            return 1;
        }else{
            return -1;
        }
    }
}
