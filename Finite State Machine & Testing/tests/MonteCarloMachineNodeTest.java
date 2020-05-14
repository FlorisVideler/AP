import org.junit.Test;

import static org.junit.Assert.*;

public class MonteCarloMachineNodeTest {

    @Test
    public void addTransition() {
        MonteCarloMachineNode node00 = new MonteCarloMachineNode("Node00");

        MonteCarloMachineNode node10 = new MonteCarloMachineNode("Node10");
        MonteCarloMachineNode node11 = new MonteCarloMachineNode("Node11");

        node00.addTransition(0.5f, node10);
        node00.addTransition(0.5f, node11);

        assertEquals(node00.transitions.size(), 2);
        assertEquals(node00.chances.size(), 2);
    }

    @Test
    public void doTransition() {
        MonteCarloMachineNode node00 = new MonteCarloMachineNode("Node00");

        MonteCarloMachineNode node10 = new MonteCarloMachineNode("Node10");
        MonteCarloMachineNode node11 = new MonteCarloMachineNode("Node11");

        node00.addTransition(0.5f, node10);
        node00.addTransition(0.5f, node11);
        //Als de input lager is dan 0.5f dan wordt er gekozen voor node10
        assertEquals(node00.doTransition(0.3f), node10);
    }
}