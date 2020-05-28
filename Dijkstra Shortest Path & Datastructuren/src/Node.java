import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Node implements Comparable<Node> {
    String name;
    Integer distance = Integer.MAX_VALUE;
    Node source;
    PriorityQueue<Stap> edges = new PriorityQueue();

    public Node(String name){
        this.name = name;
    }

    void addEdge(Stap stap){
        edges.add(stap);
    }

    @Override
    public int compareTo(Node o) {
        if (o.equals(this)){
            return 0;
        } else if(o.distance < this.distance){
            return 1;
        }else{
            return -1;
        }
    }

}
