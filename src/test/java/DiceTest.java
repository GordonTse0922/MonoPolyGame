import Model.Dice;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class DiceTest {
    Dice dice = new Dice();

    /**
     *Test if the dice return value is int
     * @result the function will return a value with int type and pass the test
     */
    @Test
    public void diceTestReturnType(){
        assertTrue(Integer.class.isInstance(dice.toss()));
    }

    /**
     *Test if the dice return value is within the range (2-8)
     * @result the function will return a value with bound (2,8) and pass the test
     */
    @Test
    public void diceTestWithInRange(){
        int result=dice.toss();
        assertTrue(2 <= result && result <= 8);
    }
}
