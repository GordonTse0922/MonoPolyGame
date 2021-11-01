

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.InJailSquare;

public class InJailSqaureTest {
	InJailSquare inJailSquare = new InJailSquare("No Name", 0);
	
    @Test
    @Order(1)
	public void inJailSquareTestGetNameReturnType(){
		assertTrue(String.class.isInstance(inJailSquare.getName()));
	}
    
    @Test
    @Order(2)
	public void inJailSquareTestGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(inJailSquare.getIndex()));
	}
    
    @Test
    @Order(3)
    public void inJailSquareTestGetName(){
    	assertEquals("No Name", inJailSquare.getName());
    }
    
    @Test
    @Order(4)
    public void inJailSquareTestGetIndex() {
    	assertTrue(inJailSquare.getIndex() == 0);
    }
	
    @Test
    @Order(5)
    public void inJailSquareTestSetGetName(){
    	inJailSquare.setName("TestInJailSetterGetterName");
    	assertEquals("TestInJailSetterGetterName", inJailSquare.getName());
    }
    
    @Test
    @Order(6)
    public void inJailSquareTestSetGetIndex() {
    	inJailSquare.setIndex(1);
    	assertTrue(inJailSquare.getIndex() == 1);
    }
    
    @Test
    @Order(7)
    public void chanceSquareTestRandomAmountReturnType() {
    	assertTrue(Integer.class.isInstance(inJailSquare.askPayOrDice(3)));
    }
    
    @Test
    @Order(8)
    public void chanceSquareTestRandomAmount() {
    	int result = inJailSquare.askPayOrDice(3);
    	assertTrue(3 >= result && result >= 0);
    }
    
    @Test
    @Order(9)
    public void chanceSquareTestRandomAmountParameter() {
    	int result = inJailSquare.askPayOrDice(0);
    	assertTrue(result == 2);
    }
    
    @Test
    @Order(10)
    public void chanceSquareTestRandomAmountParameterError() {
    	int result = inJailSquare.askPayOrDice(-1);
    	assertTrue(result == -1);
    }
}
