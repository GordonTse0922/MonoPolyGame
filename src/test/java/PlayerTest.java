import Controller.PropertySquareController;
import Model.Player;
import Model.PropertySquare;
import View.PropertySquareView;
import org.junit.jupiter.api.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PlayerTest {
    Player player=new Player(0);

    /**
     *Test if the program can create capital for Player 0 with the default value
     * @result return with default value ($1500) and pass the test
     */
    @Test
    @Order(1)
    public void testPlayerInitCapital(){
        assertTrue(player.getCapital()==1500);
    }

    /**
     *Test if the program can add capital for Player 0 with a given value
     * @result return with $1600(1500+100) and pass the test
     */
    @Test
    @Order(2)
    public void testPlayerAddCapital(){
        player.addCapital(100);
        assertTrue(player.getCapital()==(1500+100));
    }

    /**
     *Test if the program can add capital for Player 0 with a given value
     * @result return with $1600(1500+100) and pass the test
     */
    @Test
    @Order(3)
    public void testPlayerGetCapitalType(){
        player.minusCapital(100);
        assertTrue(Integer.class.isInstance(player.getCapital()));
    }

    /**
     *Test if the program can deduct capital from a player
     * @result return with $1400(1400+100) and pass the test
     */
    @Test
    @Order(4)
    public void testPlayerDeductCapital(){
//        player.minusCapital(100);
        assertTrue(player.getCapital()==1500);
    }

    /**
     *Test if the program can deduct capital from a player
     * @result return with $1400(1400+100) and pass the test
     */
    @Test
    @Order(5)
    public void testPlayerIsBroke(){
        assertTrue(player.getBroke()==false);
    }

    /**
     *Test if the program can change the broke status of a player (one of the End Game conditions)
     * @result the status is set to false and returned, test passed
     */
    @Test
    @Order(6)
    public void testPlayersSetBroke(){
        player.setBroke(false);
        assertFalse(player.getBroke());
    }

    /**
     *Test if the program can change the broke status of a player (one of the End Game conditions)
     * @result the status is set to false and returned, test passed
     */
    @Test
    @Order(7)
    public void testPlayerGetIdType(){
        assertTrue(Integer.class.isInstance(player.getId()));
    }

    /**
     *Test if the program can validate the userID range as the game can accept at most 8 players
     * @result test passed
     */
    @Test
    @Order(8)
    public void testPlayerCheckIdRange(){
        int result = player.getId();
        assertTrue(0<=result && result <= 8);
    }

    /**
     *Test if the program can return the current position of a player
     * @result test passed
     */
    @Test
    @Order(9)
    public void testPlayerGetPosition(){
        assertTrue(Integer.class.isInstance(player.getPosition()));
    }

    @Test
    @Order(10)
    public void testMove(){
        player.move(1);
        assertTrue(player.getPosition()==2);
    }

    /**
     *Test if the position of a player will exceed the max index of the map which is 19
     * @result test passed
     */
    @Test
    @Order(11)
    public void testPlayerCheckPositionRange(){
        int result = player.getPosition();
        assertTrue(1<=result && result<=19);
    }

    /**
     *Test if the properties stored in the player model have the correct type
     * @result test passed
     */
    @Test
    @Order(12)
    public void testPlayerCheckPropertiesType(){
        List<PropertySquareController> result = player.getProperties();
        assertTrue(List.class.isInstance(result));
    }

    /**
     *Test if the properties is null/empty(expected value) when first created
     * @result test passed
     */
    @Test
    @Order(13)
    public void testPlayerCheckPropertiesNull(){
        List<PropertySquareController> result = player.getProperties();
        assertTrue(result.isEmpty());
    }

    /**
     *Test if jail status of a player is false (default value) when player model is first created
     * @result test passed
     */
    @Test
    @Order(14)
    public void CheckInitJailStatus(){
        assertTrue(player.getJailStatus()==false);
    }

    /**
     *Test if jail status of a player is true after putting a player in jail.
     * @result test passed
     */
    @Test
    @Order(15)
    public void CheckSetInJail(){
        player.setInJail();
        assertTrue(player.getJailStatus());
    }

    /**
     *Test if jail status of a player is true after getting a player out from jail.
     * @result test passed
     */
    @Test
    @Order(16)
    public void CheckSetOutJail(){
        player.setOutJail();
        assertFalse(player.getJailStatus());
    }

    /**
     *Test if the program can add a property to a player
     * @result test passed
     */
    @Test
    @Order(17)
    public void TestAddProperties(){
        PropertySquare model=new PropertySquare("TEST",2, 300, "Red");
        PropertySquareView view = new PropertySquareView();
        PropertySquareController controller=new PropertySquareController(model,view);
        player.addProperty(controller);
        List<PropertySquareController> test= player.getProperties();
        PropertySquareController result=test.get(0);
//        System.out.
        assertTrue(PropertySquareController.class.isInstance(result));

    }

}
