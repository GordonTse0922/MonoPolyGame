package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.TaxSquare;

public class TaxSquareTest {
	TaxSquare taxSquare = new TaxSquare("No Name", 0);
	
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
    	assertEquals("No Name", taxSquare.getName());
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
    
    @Test
    @Order(7)
    public void taxSquareTestPayTaxReturnType() {
    	assertTrue(Integer.class.isInstance(taxSquare.payTax(1500)));
    }
    
    @Test
    @Order(8)
    public void taxSquareTestPayTax() {
    	int result = taxSquare.payTax(1500);
    	assertTrue(result == 150);
    }
    
    @Test
    @Order(9)
    public void taxSquareTestPayTaxParameterError() {
    	int result = taxSquare.payTax(-1);
    	assertTrue(result == -1);
    }
}
