
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.ChanceSquare;


public class ChanceSquareTest {
	ChanceSquare chanceSquare = new ChanceSquare();
	
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
    public void chanceSquareTestGetName(){
    	assertEquals("No Name", chanceSquare.getName());
    }
    
    @Test
    @Order(4)
    public void chanceSquareTestGetIndex() {
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
}