import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Reis {
    PriorityQueue<Node> route = new PriorityQueue<>();
//    Map<Node, Integer> unsettled = new HashMap<Node, Integer>();


    public Reis(PriorityQueue<Node> route){
        this.route = route;
    }

    @Override
    public String toString() {
        String out = "";
        for (Node n : route){
            out += String.format("%s, %s\n", n.name, n.distance);
        }
        return out;
    }
}
