package test;

import Model.PropertySquare;
import org.junit.jupiter.api.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PropertySquareTest {
    PropertySquare square = new PropertySquare("test",2);
	
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
     *  Test the return content of the function "isOwned" in Property Square Class. The return content should be False.
     *  
     *  We default the result is wrong because we have not implement the function "askPayOrDice".
     */
    @Test
    public void testOwned(){
        assertFalse(square.isOwned());
    }
    
    /**
     *  Test the return type of the function "getCost" in Property Square Class. The return type should be Integer.
     */
    @Test
    public void testCostType(){
        int result=square.getCost();
        assertTrue(Integer.class.isInstance(result));
    }

    /**
     *  Test the setter function "setOwner" in Property Square Class. The return content should be 1.
     */
    @Test
    public void testOwner(){
        square.setOwner(1);
        int result= square.getOwner();
        assertTrue(result==1);
    }
}
