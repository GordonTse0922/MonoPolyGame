package test;
import Model.Capital;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class CapitalTest {
    Capital capital=new Capital();

    @Test
    public void testCapitalMoneyType(){
        assertTrue(Integer.class.isInstance(capital.getMoney()));
    }

    @Test
    public void testCapitalMonetRange(){
        int max=Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int result=capital.getMoney();
        assertTrue(min<=result && result<=max);
    }

    }
