import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<Node>();

        Node node00 = new Node("Node00", false);

        Node node10 = new Node("Node10", false);
        Node node11 = new Node("Node11", false);

        Node node20 = new Node("Node20", false);
        Node node21 = new Node("Node21", false);
        Node node22 = new Node("Node22", false);
        Node node23 = new Node("Node23", false);

        Node node30 = new Node("Node30", true);
        Node node31 = new Node("Node31", true);
        Node node32 = new Node("Node32", true);
        Node node33 = new Node("Node33", true);
        Node node34 = new Node("Node34", true);
        Node node35 = new Node("Node35", true);

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

        nodes.add(node00);
        nodes.add(node10);
        nodes.add(node11);
        nodes.add(node20);
        nodes.add(node21);
        nodes.add(node22);
        nodes.add(node23);
        nodes.add(node30);
        nodes.add(node31);
        nodes.add(node32);
        nodes.add(node33);
        nodes.add(node34);
        nodes.add(node35);


        // Run meerdere keren om te testen of de randomheid goed werkt.
        for (int i = 0; i < 10; i ++) {
            MonteCarloMachine mcm = new MonteCarloMachine(nodes);
            mcm.run();
        }
    }
}
