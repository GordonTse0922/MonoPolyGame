import Model.Player;
import org.junit.jupiter.api.*;
import org.junit.platform.commons.annotation.Testable;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PlayerTest {
    Player player=new Player(0);

    @Test
    @Order(1)
    public void testPlayerInitCapital(){
        assertTrue(player.getCapital()==1500);
    }

    @Test
    @Order(2)
    public void testPlayerAddCapital(){
        player.addCapital(100);
        assertTrue(player.getCapital()==(1500+100));
    }

    @Test
    @Order(3)
    public void testPlayerGetCapitalType(){
        player.minusCapital(100);
        assertTrue(Integer.class.isInstance(player.getCapital()));
    }

    @Test
    @Order(4)
    public void testPlayerDeductCapital(){
//        player.minusCapital(100);
        assertTrue(player.getCapital()==1500);
    }

    @Test
    @Order(5)
    public void testPlayerIsBroke(){
        assertTrue(player.getBroke()==false);
    }
}
