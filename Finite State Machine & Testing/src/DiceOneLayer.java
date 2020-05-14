import java.util.ArrayList;

public class DiceOneLayer {
    public MonteCarloMachine buildDice(int eyes){
        if (eyes > 0){
            ArrayList<MonteCarloMachineNode> mcmNodes = new ArrayList<MonteCarloMachineNode>();
            float chance = 1/(float)eyes;
            MonteCarloMachineNode startNode = new MonteCarloMachineNode("StartNode");
            mcmNodes.add(startNode);
            for (int i = 0; i < eyes; i++) {
                MonteCarloMachineNode loopNode = new MonteCarloMachineNode(String.format("Node%s", i));
                startNode.addTransition(chance, loopNode);
                mcmNodes.add(loopNode);
            }
            return new MonteCarloMachine(mcmNodes);
        }else{
            throw new IllegalArgumentException("Dice has to have more than 0 eyes");
        }
    }
}