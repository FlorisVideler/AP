import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @org.junit.jupiter.api.Test
    void addTransition() {
        Map<Integer, Node> expectedMap = new HashMap<>();
        Node startNode = new Node("Node1", false);
        Node endNode = new Node("Node2", true);
        expectedMap.put(0, endNode);
        startNode.addTransition(0.5f, endNode);
        assertEquals(expectedMap, startNode.transitions);
    }

    @org.junit.jupiter.api.Test
    void addEmptyTransition() {
        Map<Integer, Node> expectedMap = new HashMap<>();
        Node startNode = new Node("Node1", false);
        assertThrows( ,startNode.addTransition(0.5f, ););
    }

    @org.junit.jupiter.api.Test
    void doTransition() {
        Node startNode = new Node("Node1", false);
        Node endNode = new Node("Node2", true);
        startNode.addTransition(0.5f, endNode);
        assertEquals(endNode, startNode.doTransition(0.3f));
    }
}