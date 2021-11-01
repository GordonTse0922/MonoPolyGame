package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.TaxSquare;

public class TaxSquareTest {
	TaxSquare taxSquare = new TaxSquare("No Name", 0);
	
	/**
	 *  Test the return type of the getter function "getName" in Tax Square Class. The return type should be String.
	 */
    @Test
    @Order(1)
	public void testTaxSquareGetNameReturnType(){
		assertTrue(String.class.isInstance(taxSquare.getName()));
	}
    
	/**
	 *  Test the return type of the getter function "getIndex" in Tax Square Class. The return type should be Integer.
	 */
    @Test
    @Order(2)
	public void testTaxSquareGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(taxSquare.getIndex()));
	}
    
    /**
     *  Test the return content of the getter function "getName" in Tax Square Class.
     *  The return content should be "No Name".
     */
    @Test
    @Order(3)
    public void testTaxSquareGetName(){
    	assertEquals("No Name", taxSquare.getName());
    }
    
    /**
     *  Test the return content of the getter function "getIndex" in Tax Square Class. The return content should be 0.
     */
    @Test
    @Order(4)
    public void testTaxSquareGetIndex() {
    	assertTrue(taxSquare.getIndex() == 0);
    }
	
    /**
     *  Test the setter function "setName" in Tax Square Class. The return content should be "TestTaxSetterGetterName".
     */
    @Test
    @Order(5)
    public void testTaxSquareSetGetName(){
    	taxSquare.setName("TestTaxSetterGetterName");
    	assertEquals("TestTaxSetterGetterName", taxSquare.getName());
    }
    
    /**
     *  Test the setter function "setIndex" in Tax Square Class. The return content should be 1.
     */
    @Test
    @Order(6)
    public void testTaxSquareSetGetIndex() {
    	taxSquare.setIndex(1);
    	assertTrue(taxSquare.getIndex() == 1);
    }
    
    /**
     *  Test the return type of the function "payTax" in Tax Square Class. The return type should be Integer.
     */
    @Test
    @Order(7)
    public void testTaxSquarePayTaxReturnType() {
    	assertTrue(Integer.class.isInstance(taxSquare.payTax(1500)));
    }
    
    /**
     *  Test the return content of the function "payTax" in Tax Square Class.
     *  The return content should be 10% of the parameter, in this case should be 150.
     */
    @Test
    @Order(8)
    public void testTaxSquarePayTax() {
    	int result = taxSquare.payTax(1500);
    	assertTrue(result == 150);
    }
    
    /**
     *  Test the parameter input of the function "payTax" in Tax Square Class.
     *  If the parameter input is in the error range, the return content should be -1.
     */
    @Test
    @Order(9)
    public void testTaxSquarePayTaxParameterError() {
    	int result = taxSquare.payTax(-1);
    	assertFalse(result == -1);
    }
}
