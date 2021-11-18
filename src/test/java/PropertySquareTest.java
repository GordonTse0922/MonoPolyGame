import Model.PropertySquare;
import org.junit.jupiter.api.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PropertySquareTest {
    PropertySquare square = new PropertySquare("test", 2, "Red");
	
	/**
	 *  Test the return type of the getter function "getName" in Property Square Class. The return type should be String.
	 */
    @Test
    @Order(1)
	public void testPropertySquareGetNameReturnType(){
		assertTrue(String.class.isInstance(square.getName()));
	}
    
	/**
	 *  Test the return type of the getter function "getIndex" in Property Square Class. The return type should be Integer.
	 */
    @Test
    @Order(2)
	public void testPropertySquareGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(square.getIndex()));
	}
    
    /**
     *  Test the return content of the getter function "getName" in Property Square Class. The return content should be "test".
     */
    @Test
    @Order(3)
    public void testPropertySquareGetName(){
    	assertEquals("test", square.getName());
    }
    
    /**
     *  Test the return content of the getter function "getIndex" in Property Square Class. The return content should be 2.
     */
    @Test
    @Order(4)
    public void testPropertySquareGetIndex() {
    	assertTrue(square.getIndex() == 2);
    }
	
    /**
     *  Test the setter function "setName" in Property Square Class. The return content should be "TestPropertySetterGetterName".
     */
    @Test
    @Order(5)
    public void testPropertySquareSetGetName(){
    	square.setName("TestPropertySetterGetterName");
    	assertEquals("TestPropertySetterGetterName", square.getName());
    }
    
    /**
     *  Test the setter function "setIndex" in Property Square Class. The return content should be 1.
     */
    @Test
    @Order(6)
    public void testPropertySquareSetGetIndex() {
    	square.setIndex(1);
    	assertTrue(square.getIndex() == 1);
    }

    /**
     *  Test the return type of the function "getOwner" in Property Square Class. The return type should be Integer.
     */
    @Test
    @Order(7)
    public void testGetOwnedType(){
        int result=square.getOwner();
        assertTrue(Integer.class.isInstance(result));
    }
    
    /**
     *  Test the return content of the function "getOwner" in Property Square Class. The return content should be 0.
     */
    @Test
    @Order(8)
    public void testGetOwned(){
        assertTrue(square.getOwner() == 0);
    }

    /**
     *  Test the setter function "setOwner" in Property Square Class. The return content should be 1.
     */
    @Test
    @Order(9)
    public void testSetOwned(){
        square.setOwner(1);
        assertTrue(square.getOwner() == 1);
    }
    
    /**
     *  Test the return type of the function "getCost" in Property Square Class. The return type should be Integer.
     */
    @Test
    @Order(10)
    public void testGetCostType(){
        int result=square.getCost();
        assertTrue(Integer.class.isInstance(result));
    }

    /**
     *  Test the return content of the function "getCost" in Property Square Class. The return content should be 800.
     */
    @Test
    @Order(11)
    public void testGetCost(){
        int result=square.getCost();
        assertTrue(result == 800);
    }

    /**
     *  Test the return type of the function "getRents" in Property Square Class. The return type should be Integer.
     */
    @Test
    @Order(12)
    public void testGetRentType(){
        int result=square.getRent();
        assertTrue(Integer.class.isInstance(result));
    }

    /**
     *  Test the return content of the function "getRent" in Property Square Class. The return content should be 90.
     */
    @Test
    @Order(13)
    public void testGetRent(){
        int result=square.getRent();
        assertTrue(result == 90);
    }

    /**
     *  Test the return type of the function "getColorBand" in Property Square Class. The return type should be String.
     */
    @Test
    @Order(14)
    public void testGetColorBandType(){
        String result=square.getColorBand();
        assertTrue(String.class.isInstance(result));
    }

    /**
     *  Test the return content of the function "getColorBand" in Property Square Class. The return content should be 90.
     */
    @Test
    @Order(15)
    public void testGetColorBand(){
        String result=square.getColorBand();
        assertEquals("Red", result);
    }

}
