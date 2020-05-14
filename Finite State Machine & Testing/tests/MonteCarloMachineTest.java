import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MonteCarloMachineTest {

    @Test
    public void run() {
        ArrayList<MonteCarloMachineNode> mcmNodes = new ArrayList<MonteCarloMachineNode>();

        MonteCarloMachineNode node00 = new MonteCarloMachineNode("Node00");

        MonteCarloMachineNode node10 = new MonteCarloMachineNode("Node10");
        MonteCarloMachineNode node11 = new MonteCarloMachineNode("Node11");

        node00.addTransition(0.5f, node10);
        node00.addTransition(0.5f, node11);

        mcmNodes.add(node00);
        mcmNodes.add(node10);
        mcmNodes.add(node11);

        MonteCarloMachine mcm = new MonteCarloMachine(mcmNodes);
        mcm.run();
        assertEquals(mcm.nodes.size(), mcmNodes.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void runEmptyNodes() {
        ArrayList<MonteCarloMachineNode> mcmNodes = new ArrayList<MonteCarloMachineNode>();

        MonteCarloMachine mcm = new MonteCarloMachine(mcmNodes);
    }
}