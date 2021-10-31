package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.InJailSquare;

public class InJailSqaureTest {
	InJailSquare inJailSquare = new InJailSquare("TestInJailSqaure", 0);
	
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
    	assertEquals("TestInJailSqaure", inJailSquare.getName());
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
}
