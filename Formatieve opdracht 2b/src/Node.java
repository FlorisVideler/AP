import java.util.HashMap;
import java.util.Map;

public class Node {
    String name;
    Map<Integer, Node> transitions = new HashMap<Integer, Node>();
    Map<Integer, Float> chances = new HashMap<Integer, Float>();
    boolean endNode;

    public Node(String name, boolean endNode){
        this.name = name;
        this.endNode = endNode;
    }

    public void addTransition(Float chance, Node node){
        // Zorg dat (als de input van chances goed zijn) dat de chane tussen 0 en 1 zit
        if (chances.size() == 0){
            chances.put(chances.size(), chance);
        }else{
            chances.put(chances.size(), chances.get(chances.size()-1) + chance);
        }
        transitions.put(chances.size()-1, node);
    }

    public Node doTransition(Float result){
        // Return the first node by default
        Node transitionNode = transitions.get(0);
        if (result >= 0) {
            for (int i = 1; i < chances.size(); i++) {
                if (result > chances.get(i-1) && result < chances.get(i)){
                    transitionNode = transitions.get(i);
                }
            }
        }
        return transitionNode;
    }
}
