import Model.Capital;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CapitalTest {
    Capital capital=new Capital();


    /**
     *Test if the capital is int Type when created
     * @result capital type checking will pass
     */
    @Test
    @Order(1)
    public void testCapitalMoneyType(){
        assertTrue(Integer.class.isInstance(capital.getMoney()));
    }

    /**
     *Test if the capital is within the designated range which is MAX & MIN value of int type in java
     * @result capital range checking will pass
     */
    @Test
    @Order(2)
    public void testCapitalMoneyRange(){
        int max=Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int result=capital.getMoney();
        assertTrue(min<=result && result<=max);
    }

    /**
     *Test if the addMoney() function is working properly
     * @result capital will be $1600 after adding $100 and will pass the checking
     */
    @Test
    @Order(3)
    public void testCapitalAddMoney(){
        capital.addMoney(100);
        assertTrue(capital.getMoney()==1600);
    }

    /**
     *Test if the deductMoney() function is working properly
     * @result capital will be $1400 after deducting $100 and will pass the checking
     */
    @Test
    @Order(4)
    public void testCapitalDeductMoney(){
        capital.deductMoney(100);
        assertTrue(capital.getMoney()==1400);
    }

    }
