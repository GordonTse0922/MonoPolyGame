

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.ChanceSquare;


public class ChanceSquareTest {
	ChanceSquare chanceSquare = new ChanceSquare( 9);
	
    @Test
    @Order(1)
	public void chanceSquareTestGetNameReturnType(){
		assertTrue(String.class.isInstance(chanceSquare.getName()));
	}
    
    @Test
    @Order(2)
	public void chanceSquareTestGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(chanceSquare.getIndex()));
	}
    
    @Test
    @Order(3)
    public void inJailSquareTestGetName(){
    	assertEquals("No Name", chanceSquare.getName());
    }
    
    @Test
    @Order(4)
    public void inJailSquareTestGetIndex() {
    	assertTrue(chanceSquare.getIndex() == 0);
    }
	
    @Test
    @Order(5)
    public void chanceSquareTestSetGetName(){
    	chanceSquare.setName("TestChanceSetterGetterName");
    	assertEquals("TestChanceSetterGetterName", chanceSquare.getName());
    }
    
    @Test
    @Order(6)
    public void chanceSquareTestSetGetIndex() {
    	chanceSquare.setIndex(1);
    	assertTrue(chanceSquare.getIndex() == 1);
    }
    
    @Test
    @Order(7)
    public void chanceSquareTestRandomAmountReturnType() {
    	assertTrue(Integer.class.isInstance(chanceSquare.randomAmount()));
    }
    
    @Test
    @Order(8)
    public void chanceSquareTestRandomAmount() {
    	int result = chanceSquare.randomAmount();
    	assertTrue(200 >= result && result >= -300 && result%10 == 0);
    }
}
