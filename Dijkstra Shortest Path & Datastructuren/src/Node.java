import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Node {
    String name;
    Integer distance = Integer.MAX_VALUE;
    Node source;
    Node fastestDestination;
    PriorityQueue<Stap> edges = new PriorityQueue();

    public Node(String name){
        this.name = name;
    }

    void addEdge(Stap stap){
        edges.add(stap);
    }



}
