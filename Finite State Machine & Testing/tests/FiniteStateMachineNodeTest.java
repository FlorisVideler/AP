import org.junit.Test;

import static org.junit.Assert.*;

public class FiniteStateMachineNodeTest {

    @Test
    public void addTransition() {
        FiniteStateMachineNode s0 = new FiniteStateMachineNode("s0");
        FiniteStateMachineNode s1 = new FiniteStateMachineNode("s1");
        s0.addTransition("A", s1);
        assertEquals(1, s0.transitions.size());
    }

    @Test
    public void doTransition() {
        FiniteStateMachineNode s0 = new FiniteStateMachineNode("s0");
        FiniteStateMachineNode s1 = new FiniteStateMachineNode("s1");
        s0.addTransition("A", s1);
        assertEquals(s1, s0.doTransition("A"));
    }

    @Test
    public void doTransitionNotExistingNode() {
        FiniteStateMachineNode s0 = new FiniteStateMachineNode("s0");
        FiniteStateMachineNode s1 = new FiniteStateMachineNode("s1");
        s0.addTransition("A", s1);
        assertEquals(null, s0.doTransition("B"));
    }
}