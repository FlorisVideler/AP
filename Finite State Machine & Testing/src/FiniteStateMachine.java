import java.util.ArrayList;

public class FiniteStateMachine {
    ArrayList<FiniteStateMachineNode> nodes = new ArrayList<FiniteStateMachineNode>();
    String input;
    FiniteStateMachineNode startNode;

    public FiniteStateMachine(ArrayList<FiniteStateMachineNode> nodes, FiniteStateMachineNode startNode){
        this.nodes = nodes;
        this.startNode = startNode;
    }


    public ArrayList<FiniteStateMachineNode> run(String input){
        ArrayList<FiniteStateMachineNode> path = new ArrayList<FiniteStateMachineNode>();
        FiniteStateMachineNode lastNode = startNode;
        path.add(startNode);
        System.out.println(String.format("Starting on node: %s", lastNode.name));
        for (char ch : input.toCharArray()) {
            String inputChar = String.valueOf(ch);
            FiniteStateMachineNode newNode = lastNode.doTransition(inputChar);
            if (newNode == null){
                System.out.println(String.format("Er is geen transition %s gevonden vanaf %s!", inputChar, lastNode.name));
                break;
            }else {
                System.out.println(String.format("%s --%s--> %s",lastNode.name, inputChar, newNode.name));
                path.add(newNode);
            }
            lastNode = newNode;
        }
        // Met het path wordt niets gedaan. Dit is meer voor uitbreiding. Als de prints buiten deze functie moeten gebeuren.
        return path;
    }

    public String toString(){
        String str = "Nodes in fsm:";
        for (FiniteStateMachineNode n : nodes) {
            str += "\n" + n.name;
        }
        return str;
    }
}
