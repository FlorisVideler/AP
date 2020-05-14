import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FiniteStateMachineTest {

    @Test
    public void run() {
        ArrayList<FiniteStateMachineNode> fsmNodes = new ArrayList<FiniteStateMachineNode>();
        FiniteStateMachineNode s0 = new FiniteStateMachineNode("s0");
        FiniteStateMachineNode s1 = new FiniteStateMachineNode("s1");
        FiniteStateMachineNode s2 = new FiniteStateMachineNode("s2");
        FiniteStateMachineNode s3 = new FiniteStateMachineNode("s3");

        fsmNodes.add(s0);
        fsmNodes.add(s1);
        fsmNodes.add(s2);
        fsmNodes.add(s3);

        s0.addTransition("A", s2);
        s0.addTransition("B", s1);
        s1.addTransition("A", s1);
        s1.addTransition("B", s2);
        s2.addTransition("B", s3);
        s3.addTransition("A", s3);
        s3.addTransition("B", s0);

        FiniteStateMachine fsm = new FiniteStateMachine(fsmNodes, s0);
        ArrayList<FiniteStateMachineNode> path1 = fsm.run("ABBAA");
        assertEquals(5, path1.size());
    }

    @Test
    public void runZeroNodes() {
        ArrayList<FiniteStateMachineNode> fsmNodes = new ArrayList<FiniteStateMachineNode>();
        FiniteStateMachineNode s0 = new FiniteStateMachineNode("s0");

        FiniteStateMachine fsm = new FiniteStateMachine(fsmNodes, s0);
        ArrayList<FiniteStateMachineNode> path1 = fsm.run("ABBAA");
        //De lijst is leeg dus alleen de startnode wordt gedaan.
        assertEquals(1, path1.size());
    }
}