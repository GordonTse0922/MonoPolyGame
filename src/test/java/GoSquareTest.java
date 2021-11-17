
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.GoSquare;

public class GoSquareTest {
	GoSquare goSquare = new GoSquare("No Name", 0);
	
	/**
	 *  Test the return type of the getter function "getName" in Go Square Class. The return type should be String.
	 */
    @Test
    @Order(1)
	public void testGoSquareGetNameReturnType(){
		assertTrue(String.class.isInstance(goSquare.getName()));
	}
    
	/**
	 *  Test the return type of the getter function "getIndex" in Go Square Class. The return type should be Integer.
	 */
    @Test
    @Order(2)
	public void testGoSquareGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(goSquare.getIndex()));
	}
    
    /**
     *  Test the return content of the getter function "getName" in Go Square Class. The return content should be "No Name".
     */
    @Test
    @Order(3)
    public void testGoSquareGetName(){
    	assertEquals("No Name", goSquare.getName());
    }
    
    /**
     *  Test the return content of the getter function "getIndex" in Go Square Class. The return content should be 0.
     */
    @Test
    @Order(4)
    public void testGoSquareGetIndex() {
    	assertTrue(goSquare.getIndex() == 0);
    }
    
    /**
     *  Test the setter function "setName" in Go Square Class. The return content should be "TestGoSetterGetterName".
     */
    @Test
    @Order(5)
    public void testGoSquareSetGetName(){
    	goSquare.setName("TestGoSetterGetterName");
    	assertEquals("TestGoSetterGetterName", goSquare.getName());
    }
    
    /**
     *  Test the setter function "setIndex" in Go Square Class. The return content should be 1.
     */
    @Test
    @Order(6)
    public void testGoSquareSetGetIndex() {
    	goSquare.setIndex(1);
    	assertTrue(goSquare.getIndex() == 1);
    }
    
    /**
     *  Test the return type of the function "gainSalary" in Go Square Class. The return type should be Integer.
     */
    @Test
    @Order(7)
    public void testGoSquareGainSalaryReturnType() {
    	assertTrue(Integer.class.isInstance(goSquare.gainSalary()));
    }
    
    /**
     *  Test the return content of the function "gainSalary" in Go Square Class. The return content should be 1500.
     */
    @Test
    @Order(8)
    public void testGoSquareGainSalary() {
    	int result = goSquare.gainSalary();
    	assertTrue(result == 1500);
    }
}
