import java.util.HashMap;
import java.util.Map;

public class Node {
    Map<String, Node> transitions = new HashMap<String, Node>();
    String name;

    public Node(String name){
        this.name = name;
    }

    public void addTransition(String input, Node destination){
        transitions.put(input, destination);
    }

    public Node doTransition(String input){
        return transitions.getOrDefault(input, null);
    }
}
