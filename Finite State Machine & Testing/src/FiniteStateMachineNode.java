import java.util.HashMap;
import java.util.Map;

public class FiniteStateMachineNode {
    Map<String, FiniteStateMachineNode> transitions = new HashMap<String, FiniteStateMachineNode>();
    String name;

    public FiniteStateMachineNode(String name){
        this.name = name;
    }

    public void addTransition(String input, FiniteStateMachineNode destination){
        transitions.put(input, destination);
    }

    public FiniteStateMachineNode doTransition(String input){
        return transitions.getOrDefault(input, null);
    }
}
