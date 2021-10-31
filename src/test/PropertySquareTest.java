import Model.PropertySquare;
import org.junit.jupiter.api.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PropertySquareTest {
    PropertySquare square = new PropertySquare("test",2);

    @Test
    public void testOwned(){
        assertFalse(square.isOwned());
    }

    @Test
    public void testCostType(){
        int result=square.getCost();
        assertTrue(Integer.class.isInstance(result));
    }

    @Test
    public void testOwner(){
        square.setOwner(1);
        int result= square.getOwner();
        assertTrue(result==1);
    }
}
