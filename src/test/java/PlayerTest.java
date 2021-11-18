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

    @Test
    @Order(1)
    public void testPlayerGetCapitalType(){
        assertTrue(Integer.class.isInstance(player.getCapital()));
    }

    /**
     *Test if the program can create capital for Player 0 with the default value
     * @result return with default value ($1500) and pass the test
     */
    @Test
    @Order(2)
    public void testPlayerInitCapital(){
        assertTrue(player.getCapital()==1500);
    }

    /**
     *Test if the program can add capital for Player 0 with a given value
     * @result return with $1600(1500+100) and pass the test
     */
    @Test
    @Order(3)
    public void testPlayerAddCapital(){
        player.addCapital(100);
        assertTrue(player.getCapital()==(1500+100));
    }

    /**
     *Test if the program can add capital for Player 0 with a given value
     * @result return with $1400(1500-100) and pass the test
     */
    @Test
    @Order(4)
    public void testPlayerMinusCapital(){
        player.minusCapital(100);
        assertTrue(player.getCapital()==(1500-100));
    }

    @Test
    @Order(5)
    public void testPlayerIsBrokeType(){
        assertTrue(Boolean.class.isInstance(player.getBroke()));
    }

    @Test
    @Order(6)
    public void testPlayerIsBroke(){
        assertTrue(player.getBroke()==false);
    }

    /**
     *Test if the program can change the broke status of a player (one of the End Game conditions)
     * @result the status is set to false and returned, test passed
     */
    @Test
    @Order(7)
    public void testPlayersSetBroke(){
        player.setBroke(true);
        assertTrue(player.getBroke());
    }

    /**
     *Test if the program can change the broke status of a player (one of the End Game conditions)
     * @result the status is set to false and returned, test passed
     */
    @Test
    @Order(8)
    public void testPlayerGetIdType(){
        assertTrue(Integer.class.isInstance(player.getId()));
    }

    @Test
    @Order(9)
    public void testPlayerGetId(){
        assertTrue(player.getId() == 0);
    }

    /**
     *Test if the program can validate the userID range as the game can accept at most 8 players
     * @result test passed
     */
    @Test
    @Order(10)
    public void testPlayerCheckIdRange(){
        int result = player.getId();
        assertTrue(0<=result && result <= 6);
    }

    /**
     *Test if the program can return the current position of a player
     * @result test passed
     */
    @Test
    @Order(11)
    public void testPlayerGetPositionType(){
        assertTrue(Integer.class.isInstance(player.getPosition()));
    }

    @Test
    @Order(12)
    public void testPlayerGetPosition(){
        assertTrue(player.getPosition() == 1);
    }

    /**
     *Test if the position of a player will exceed the max index of the map which is 20
     * @result test passed
     *
     * Player position = 2
     */
    @Test
    @Order(13)
    public void testMove(){
        player.move(1);
        assertTrue(player.getPosition()==2);
    }
    /**
     *Test if the position of a player will exceed the max index of the map which is 20
     * @result test passed
     *
     * Player position = 2
     */
    @Test
    @Order(14)
    public void testPlayerCheckPositionRange(){
        int result = player.getPosition();
        assertTrue(1<=result && result<=20);
    }
    /**
     *Test if the position of a player will exceed the max index of the map which is 20
     * @result test passed
     *
     * Player position = 20
     */
    @Test
    @Order(15)
    public void testPlayerCheckPositionRange2(){
        player.move(18);
        int result = player.getPosition();
        System.out.print(result);
        assertTrue(1<=result && result<=20);
    }
    /**
     *Test if the position of a player will exceed the max index of the map which is 20
     * @result test passed
     *
     * Player position = 1
     */
    @Test
    @Order(16)
    public void testPlayerCheckPositionRange3(){
        player.move(1);
        int result = player.getPosition();
        System.out.print(result);
        assertTrue(1<=result && result<=20);
    }
    /**
     *Test if the position of a player will exceed the max index of the map which is 20
     * @result test passed
     *
     * Player position = 6
     */
    @Test
    @Order(17)
    public void testPlayerCheckPositionRange4(){
        player.move(25);
        int result = player.getPosition();
        System.out.print(result);
        assertTrue(1<=result && result<=20);
    }

    /**
     *Test if the properties stored in the player model have the correct type
     * @result test passed
     */
    @Test
    @Order(18)
    public void testPlayerCheckPropertiesType(){
        List<PropertySquareController> result = player.getProperties();
        assertTrue(List.class.isInstance(result));
    }

    /**
     *Test if the properties is null/empty(expected value) when first created
     * @result test passed
     */
    @Test
    @Order(19)
    public void testPlayerCheckPropertiesNull(){
        List<PropertySquareController> result = player.getProperties();
        assertTrue(result.isEmpty());
    }

    @Test
    @Order(20)
    public void testPlayerAddProperties(){
        PropertySquareController p = new PropertySquareController(new PropertySquare("Test", 2, "Red"), new PropertySquareView());
        player.addProperty(p);
        List<PropertySquareController> result = player.getProperties();
        assertFalse(result.isEmpty());
    }

    /**
     *Test if the program can add a property to a player
     * @result test passed
     */
    @Test
    @Order(21)
    public void testPlayerAddPropertiesType(){
        PropertySquareController p=new PropertySquareController(new PropertySquare("TEST",2, "Red"),new PropertySquareView());
        player.addProperty(p);
        List<PropertySquareController> test= player.getProperties();
        PropertySquareController result=test.get(0);
//        System.out.
        assertTrue(PropertySquareController.class.isInstance(result));

    }

    @Test
    @Order(22)
    public void testPlayerClearProperties(){
        player.clearProperty();
        List<PropertySquareController> result = player.getProperties();

        assertTrue(result.isEmpty());
    }

    /**
     *Test if jail status of a player is false (default value) when player model is first created
     * @result test passed
     */
    @Test
    @Order(23)
    public void CheckInitJailStatus(){
        assertTrue(player.getJailStatus()==false);
    }

    /**
     *Test if jail status of a player is true after putting a player in jail.
     * @result test passed
     */
    @Test
    @Order(24)
    public void CheckSetInJail(){
        player.setInJail();
        assertTrue(player.getJailStatus());
    }

    /**
     *Test if jail status of a player is true after putting a player in jail.
     * @result test passed
     */
    @Test
    @Order(25)
    public void CheckSetInJailPos(){
        player.setInJail();
        assertTrue(player.getPosition() == 6);
    }

    /**
     *Test if jail status of a player is true after getting a player out from jail.
     * @result test passed
     */
    @Test
    @Order(26)
    public void CheckSetOutJail(){
        player.setOutJail();
        assertFalse(player.getJailStatus());
    }

    @Test
    @Order(27)
    public void CheckSetOutJailResetDice(){
        player.setOutJail();
        assertTrue(player.getInJailDice() == 3);
    }

    @Test
    @Order(28)
    public void CheckJailDice(){
        assertTrue(player.getInJailDice() == 3);
    }

    @Test
    @Order(29)
    public void CheckJailDiceType(){
        assertTrue(Integer.class.isInstance(player.getInJailDice()));
    }

    @Test
    @Order(30)
    public void CheckMinusJailDice(){
        player.minusInJailDice();
        assertTrue(player.getInJailDice() == 2);
    }

    @Test
    @Order(31)
    public void testSetPositionFromSave(){
        player.setPositionFromSave(1);
        assertTrue(player.getPosition() == 1);

    }

    @Test
    @Order(32)
    public void testSetCapitalFromSave(){
        player.setCapitalFromSave(1);
        assertTrue(player.getCapital() == 1);
    }

    @Test
    @Order(33)
    public void testSetJailStatusFromSave(){
        player.setJailStatusFromSave(0);
        assertFalse(player.getJailStatus());
    }

    @Test
    @Order(34)
    public void testSetJailStatusFromSave2(){
        player.setJailStatusFromSave(1);
        assertTrue(player.getJailStatus());
    }

}
