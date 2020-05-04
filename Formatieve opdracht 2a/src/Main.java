import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        nodes.add(s0);
        nodes.add(s1);
        nodes.add(s2);
        nodes.add(s3);

        s0.addTransition("A", s2);
        s0.addTransition("B", s1);
        s1.addTransition("A", s1);
        s1.addTransition("B", s2);
        s2.addTransition("B", s3);
        s3.addTransition("A", s3);
        s3.addTransition("B", s0);

        FiniteStateMachine fsm = new FiniteStateMachine(nodes, s0);
        ArrayList<Node> path = fsm.run("ABBAA");
    }
}
