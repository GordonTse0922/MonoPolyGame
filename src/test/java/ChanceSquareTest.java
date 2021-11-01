package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.ChanceSquare;


public class ChanceSquareTest {
	ChanceSquare chanceSquare = new ChanceSquare("No Name", 0);
	
	/**
	 *  Test the return type of the getter function "getName" in Chance Square Class. The return type should be String.
	 */
    @Test
    @Order(1)
	public void testChanceSquareGetNameReturnType(){
		assertTrue(String.class.isInstance(chanceSquare.getName()));
	}
    
    /**
     *  Test the return type of the getter function "getIndex" in Chance Square Class. The return type should be Integer.
     */
    @Test
    @Order(2)
	public void testChanceSquareGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(chanceSquare.getIndex()));
	}
    
    /**
     *  Test the return content of the getter function "getName" in Chance Square Class. The return content should be "No Name".
     */
    @Test
    @Order(3)
    public void inJailSquareTestGetName(){
    	assertEquals("No Name", chanceSquare.getName());
    }
    
    /**
     *  Test the return content of the getter function "getIndex" in Chance Square Class. The return content should be 0.
     */
    @Test
    @Order(4)
    public void inJailSquareTestGetIndex() {
    	assertTrue(chanceSquare.getIndex() == 0);
    }
    
    /**
     *  Test the setter function "setName" in Chance Square Class. The return content should be "TestChanceSetterGetterName".
     */
    @Test
    @Order(5)
    public void testChanceSquareSetGetName(){
    	chanceSquare.setName("TestChanceSetterGetterName");
    	assertEquals("TestChanceSetterGetterName", chanceSquare.getName());
    }
    
    /**
     *  Test the setter function "setIndex" in Chance Square Class. The return content should be 1.
     */
    @Test
    @Order(6)
    public void testChanceSquareSetGetIndex() {
    	chanceSquare.setIndex(1);
    	assertTrue(chanceSquare.getIndex() == 1);
    }
    
    /**
     *  Test the return type of the function "randomAmount" in Chance Square Class. The return type should be Integer.
     */
    @Test
    @Order(7)
    public void testChanceSquareRandomAmountReturnType() {
    	assertTrue(Integer.class.isInstance(chanceSquare.randomAmount()));
    }
    
    /**
     *  Test the range of the return content of the function "randomAmount" in Chance Square Class. 
     *  The range of the return content should be 200 ~ -300 which is a multiple of 10.
     */
    @Test
    @Order(8)
    public void testChanceSquareRandomAmount() {
    	int result = chanceSquare.randomAmount();
    	assertTrue(200 >= result && result >= -300 && result%10 == 0);
    }
}
