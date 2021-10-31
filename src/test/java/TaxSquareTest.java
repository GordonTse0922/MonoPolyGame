

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.TaxSquare;

public class TaxSquareTest {
	TaxSquare taxSquare = new TaxSquare("TestTaxSqaure", 0);
	
    @Test
    @Order(1)
	public void taxSquareTestGetNameReturnType(){
		assertTrue(String.class.isInstance(taxSquare.getName()));
	}
    
    @Test
    @Order(2)
	public void taxSquareTestGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(taxSquare.getIndex()));
	}
    
    @Test
    @Order(3)
    public void taxSquareTestGetName(){
    	assertEquals("TestTaxSqaure", taxSquare.getName());
    }
    
    @Test
    @Order(4)
    public void taxSquareTestGetIndex() {
    	assertTrue(taxSquare.getIndex() == 0);
    }
	
    @Test
    @Order(5)
    public void taxSquareTestSetGetName(){
    	taxSquare.setName("TestTaxSetterGetterName");
    	assertEquals("TestTaxSetterGetterName", taxSquare.getName());
    }
    
    @Test
    @Order(6)
    public void taxSquareTestSetGetIndex() {
    	taxSquare.setIndex(1);
    	assertTrue(taxSquare.getIndex() == 1);
    }
}