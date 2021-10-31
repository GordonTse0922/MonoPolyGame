package test;
import Model.Dice;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class DiceTest {
    Dice dice = new Dice();
    @Test
    public void diceTestReturnType(){
        assertTrue(Integer.class.isInstance(dice.toss()));
    }
    @Test
    public void diceTestWithInRange(){
        int result=dice.toss();
        assertTrue(0 <= result && result <= 8);
    }
}
