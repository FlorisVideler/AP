import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Finite state machine
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
        ArrayList<FiniteStateMachineNode> path2 = fsm.run("BBBAAAABBBAAAAAAAAA");
        ArrayList<FiniteStateMachineNode> path3 = fsm.run("AAAAAAAAAAAAAAAAABAAAABBB");


        //Monte carlo
        ArrayList<MonteCarloMachineNode> mcmNodes = new ArrayList<MonteCarloMachineNode>();

        MonteCarloMachineNode node00 = new MonteCarloMachineNode("Node00", false);

        MonteCarloMachineNode node10 = new MonteCarloMachineNode("Node10", false);
        MonteCarloMachineNode node11 = new MonteCarloMachineNode("Node11", false);

        MonteCarloMachineNode node20 = new MonteCarloMachineNode("Node20", false);
        MonteCarloMachineNode node21 = new MonteCarloMachineNode("Node21", false);
        MonteCarloMachineNode node22 = new MonteCarloMachineNode("Node22", false);
        MonteCarloMachineNode node23 = new MonteCarloMachineNode("Node23", false);

        MonteCarloMachineNode node30 = new MonteCarloMachineNode("Node30", true);
        MonteCarloMachineNode node31 = new MonteCarloMachineNode("Node31", true);
        MonteCarloMachineNode node32 = new MonteCarloMachineNode("Node32", true);
        MonteCarloMachineNode node33 = new MonteCarloMachineNode("Node33", true);
        MonteCarloMachineNode node34 = new MonteCarloMachineNode("Node34", true);
        MonteCarloMachineNode node35 = new MonteCarloMachineNode("Node35", true);

        node00.addTransition(0.5f, node10);
        node00.addTransition(0.5f, node11);

        node10.addTransition(0.5f, node20);
        node10.addTransition(0.5f, node21);
        node11.addTransition(0.5f, node22);
        node11.addTransition(0.5f, node23);

        node20.addTransition(0.5f, node10);
        node20.addTransition(0.5f, node30);
        node21.addTransition(0.5f, node31);
        node21.addTransition(0.5f, node32);
        node22.addTransition(0.5f, node33);
        node22.addTransition(0.5f, node34);
        node23.addTransition(0.5f, node35);
        node23.addTransition(0.5f, node11);

        mcmNodes.add(node00);
        mcmNodes.add(node10);
        mcmNodes.add(node11);
        mcmNodes.add(node20);
        mcmNodes.add(node21);
        mcmNodes.add(node22);
        mcmNodes.add(node23);
        mcmNodes.add(node30);
        mcmNodes.add(node31);
        mcmNodes.add(node32);
        mcmNodes.add(node33);
        mcmNodes.add(node34);
        mcmNodes.add(node35);


        // Run meerdere keren om te testen of de randomheid goed werkt.
        for (int i = 0; i < 10; i ++) {
            MonteCarloMachine mcm = new MonteCarloMachine(mcmNodes);
            mcm.run();
        }
    }
}
