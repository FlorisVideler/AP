import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MonteCarloMachineTest {

    @org.junit.jupiter.api.Test
    void run() {
        ArrayList<MonteCarloMachineNode> mcmNodes = new ArrayList<MonteCarloMachineNode>();

        MonteCarloMachineNode node00 = new MonteCarloMachineNode("Node00", false);

        MonteCarloMachineNode node10 = new MonteCarloMachineNode("Node10", false);
        MonteCarloMachineNode node11 = new MonteCarloMachineNode("Node11", false);

        node00.addTransition(0.5f, node10);
        node00.addTransition(0.5f, node11);

        mcmNodes.add(node00);
        mcmNodes.add(node10);
        mcmNodes.add(node11);

        MonteCarloMachine mcm = new MonteCarloMachine(mcmNodes);
        mcm.run();
        assertEquals(mcm.nodes.size(), mcmNodes.size());
    }

    @org.junit.jupiter.api.Test
    void runEmptyNodes() {
        ArrayList<MonteCarloMachineNode> mcmNodes = new ArrayList<MonteCarloMachineNode>();

        MonteCarloMachine mcm = new MonteCarloMachine(mcmNodes);
        assertThrows(IndexOutOfBoundsException.class, mcm::run);
    }

}