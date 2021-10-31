import Model.Capital;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CapitalTest {
    Capital capital=new Capital();

    @Test
    @Order(1)
    public void testCapitalMoneyType(){
        assertTrue(Integer.class.isInstance(capital.getMoney()));
    }

    @Test
    @Order(2)
    public void testCapitalMoneyRange(){
        int max=Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int result=capital.getMoney();
        assertTrue(min<=result && result<=max);
    }

    @Test
    @Order(3)
    public void testCapitalGetMoneyType(){
        int result =capital.getMoney();
        assertTrue(Integer.class.isInstance(result));
    }

    @Test
    @Order(4)
    public void testCapitalDeductMoneyType(){
        capital.deductMoney(100);
        assertTrue(capital.getMoney()==1400);
    }

    }
