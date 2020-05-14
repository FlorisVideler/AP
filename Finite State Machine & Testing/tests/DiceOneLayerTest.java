import org.junit.Test;

import static org.junit.Assert.*;

public class DiceOneLayerTest {

    @Test
    public void buildDice() {
        MonteCarloMachine dice = new DiceOneLayer().buildDice(6);
        dice.run();
    }

    @Test(expected = IllegalArgumentException.class)
    public void buildDiceZeroEyes() {
        MonteCarloMachine dice = new DiceOneLayer().buildDice(0);
        dice.run();
    }

    @Test(expected = IllegalArgumentException.class)
    public void buildDiceNegativeEyes() {
        MonteCarloMachine dice = new DiceOneLayer().buildDice(-6);
        dice.run();
    }
}