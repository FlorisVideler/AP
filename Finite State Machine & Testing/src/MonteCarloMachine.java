import java.util.ArrayList;
import java.util.Random;

public class MonteCarloMachine {
    ArrayList<MonteCarloMachineNode> nodes = new ArrayList<MonteCarloMachineNode>();
    MonteCarloMachineNode currentNode;
    Random rand = new Random();

    public MonteCarloMachine(ArrayList<MonteCarloMachineNode> nodes) {
        this.nodes = nodes;
        currentNode = nodes.get(0);
    }

    public void run(){
        System.out.println(String.format("Starting at %s", currentNode.name));
        while (currentNode.transitions.size() > 0) {
            currentNode = currentNode.doTransition(rand.nextFloat());
            System.out.println(currentNode.name);
        }
    }


}
