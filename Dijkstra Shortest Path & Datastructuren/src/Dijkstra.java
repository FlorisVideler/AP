import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

    Reis bestPath(ArrayList<Node> nodes){
        ArrayList<Node> unsettled = new ArrayList<>();
        ArrayList<Node> settled = new ArrayList<>();
        Node endNode = null;
        PriorityQueue<Node> route = new PriorityQueue<>();

        // Start met de eerste node (start node), a in dti geval.
        unsettled.add(nodes.get(0));

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
        Node sourceNode = endNode;
        do{
            Node currentNode = sourceNode;
            route.add(currentNode);
            sourceNode = currentNode.source;
        }while (sourceNode != null);
        System.out.println("START");

        return new Reis(route);
    }
}
