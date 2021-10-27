import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiceTest {
    @Test
    public void diceTestReturnType(){
        Dice dice = new Dice();
        assertTrue(Integer.class.isInstance(dice.toss()));
    }
    @Test
    public void diceTestWithInRange(){
        Dice dice = new Dice();
        int result=dice.toss();
        assertTrue(2 <= result && result <= 8);
    }
}
