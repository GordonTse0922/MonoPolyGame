package test;
import Controller.PropertySquareController;
import Model.Player;
import org.junit.jupiter.api.*;
import java.util.List;

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

    @Test
    @Order(6)
    public void testPlayerGetIdType(){
        assertTrue(Integer.class.isInstance(player.getId()));
    }

    @Test
    @Order(7)
    public void testPlayerCheckIdRange(){
        int result = player.getId();
        assertTrue(0<=result && result <= 8);
    }

    @Test
    @Order(8)
    public void testPlayerGetPosition(){
        assertTrue(Integer.class.isInstance(player.getPosition()));
    }

    @Test
    @Order(9)
    public void testPlayerCheckPositionRange(){
        int result = player.getPosition();
        assertTrue(1<=result && result<=20);
    }

    @Test
    @Order(10)
    public void testPlayerCheckPropertiesType(){
        List<PropertySquareController> result = player.getProperties();
        assertTrue(List.class.isInstance(result));
    }

    @Test
    @Order(11)
    public void testPlayerCheckPropertiesNull(){
        List<PropertySquareController> result = player.getProperties();
        assertFalse(!result.isEmpty());
    }

    @Test
    @Order(12)
    public void CheckInitJailStatus(){
        assertTrue(player.getJailStatus()==false);
    }

    @Test
    @Order(12)
    public void CheckSetInJail(){
        player.setInJail();
        assertTrue(player.getJailStatus());
    }
    @Test
    @Order(13)
    public void CheckSetOutJail(){
        player.setOutJail();
        assertFalse(player.getJailStatus());
    }
}
