package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.JailSquare;

public class JailSquareTest {
	JailSquare jailSquare = new JailSquare("No Name", 0);
	
	/**
	 *  Test the return type of the getter function "getName" in Jail Square Class. The return type should be String.
	 */
    @Test
    @Order(1)
	public void testJailSquareGetNameReturnType(){
		assertTrue(String.class.isInstance(jailSquare.getName()));
	}
    
    /**
     *  Test the return type of the getter function "getIndex" in Jail Square Class. The return type should be Integer.
     */
    @Test
    @Order(2)
	public void testJailSquareGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(jailSquare.getIndex()));
	}
    
    /**
     *  Test the return content of the getter function "getName" in Jail Square Class.
     *  The return content should be "No Name".
     */
    @Test
    @Order(3)
    public void testJailSquareGetName(){
    	assertEquals("No Name", jailSquare.getName());
    }
    
    /**
     *  Test the return content of the getter function "getIndex" in Jail Square Class. The return content should be 0.
     */
    @Test
    @Order(4)
    public void testJailSquareGetIndex() {
    	assertTrue(jailSquare.getIndex() == 0);
    }
    
    /**
     *  Test the setter function "setName" in Jail Square Class. The return content should be "TestJailSetterGetterName".
     */
    @Test
    @Order(5)
    public void testJailSquareSetGetName(){
    	jailSquare.setName("TestJailSetterGetterName");
    	assertEquals("TestJailSetterGetterName", jailSquare.getName());
    }
    
    /**
     *  Test the setter function "setIndex" in Jail Square Class. The return content should be 1.
     */
    @Test
    @Order(6)
    public void testJailSquareSetGetIndex() {
    	jailSquare.setIndex(1);
    	assertTrue(jailSquare.getIndex() == 1);
    }
    
    /**
     *  Test the return type of the function "goToJail" in Jail Square Class. The return type should be Boolean.
     */
    @Test
    @Order(7)
    public void testJailSquareGoToJailReturnType() {
    	assertTrue(Boolean.class.isInstance(jailSquare.goToJail()));
    }
    
    /**
     *  Test the return content of the function "goToJail" in Jail Square Class. The return content should be True.
     */
    @Test
    @Order(8)
    public void testJailSquareGoToJail() {
    	assertTrue(jailSquare.goToJail());
    }
}
