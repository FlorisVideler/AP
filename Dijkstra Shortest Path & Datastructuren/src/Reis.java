import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Reis {
//    Map<Node, Integer> unsettled = new HashMap<Node, Integer>();
    ArrayList<Node> unsettled = new ArrayList<>();
    ArrayList<Node> settled = new ArrayList<>();
    Node endNode;

    void dijkstra(){
        Node start = unsettled.get(0);
        start.distance = 0;
        while (unsettled.size() > 0){
            Node cur = unsettled.get(0);
            if(cur.edges.size() == 0){
                // De end node is de node zonder edges (in dit geval e)
                endNode = cur;
            }
            for (Stap s : cur.edges){
                Node desNode = s.destination;
                if(desNode.distance > cur.distance + s.getDistance()){
                    desNode.distance = cur.distance + s.getDistance();
                    desNode.source = cur;
                }
                if(!settled.contains(desNode) && !unsettled.contains(desNode)){
                    unsettled.add(desNode);
                }
            }
            settled.add(unsettled.get(0));
            unsettled.remove(0);
        }

        // Print korste / snelste / goedkoopste route
        System.out.println(String.format("Minimaal: %s", endNode.distance));
        Node sourceNode = endNode;
        do{
            Node currentNode = sourceNode;
            System.out.println(String.format("%s, %s", currentNode.name, currentNode.distance));
            System.out.println("^");
            sourceNode = currentNode.source;
        }while (sourceNode != null);
        System.out.println("START");
    }

}
