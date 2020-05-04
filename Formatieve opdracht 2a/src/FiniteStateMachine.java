import java.util.ArrayList;

public class FiniteStateMachine {
    ArrayList<Node> nodes = new ArrayList<Node>();
    String input;
    Node startNode;

    public FiniteStateMachine(ArrayList<Node> nodes, Node startNode){
        this.nodes = nodes;
        this.startNode = startNode;
    }


    public ArrayList<Node> run(String input){
        ArrayList<Node> path = new ArrayList<Node>();
        Node lastNode = startNode;
        path.add(startNode);
        System.out.println(String.format("Starting on node: %s", lastNode.name));
        for (char ch : input.toCharArray()) {
            String inputChar = String.valueOf(ch);
            Node newNode = lastNode.doTransition(inputChar);
            if (newNode == null){
                System.out.println(String.format("Er is geen transition %s gevonden vanaf %s!", inputChar, lastNode.name));
                break;
            }else {
                System.out.println(String.format("%s --%s--> %s",lastNode.name, inputChar, newNode.name));
                path.add(newNode);
            }
            lastNode = newNode;
        }
        return path;
    }

    public String toString(){
        String str = "Nodes in fsm:";
        for (Node n : nodes) {
            str += "\n" + n.name;
        }
        return str;
    }
}
