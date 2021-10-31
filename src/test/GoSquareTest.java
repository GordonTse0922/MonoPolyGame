package test;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.GoSquare;

public class GoSquareTest {
	GoSquare goSquare = new GoSquare("TestGoSqaure", 0);
	
    @Test
    @Order(1)
	public void goSquareTestGetNameReturnType(){
		assertTrue(String.class.isInstance(goSquare.getName()));
	}
    
    @Test
    @Order(2)
	public void goSquareTestGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(goSquare.getIndex()));
	}
    
    @Test
    @Order(3)
    public void goSquareTestGetName(){
    	assertEquals("TestGoSqaure", goSquare.getName());
    }
    
    @Test
    @Order(4)
    public void goSquareTestGetIndex() {
    	assertTrue(goSquare.getIndex() == 0);
    }
	
    @Test
    @Order(5)
    public void goSquareTestSetGetName(){
    	goSquare.setName("TestGoSetterGetterName");
    	assertEquals("TestGoSetterGetterName", goSquare.getName());
    }
    
    @Test
    @Order(6)
    public void goSquareTestSetGetIndex() {
    	goSquare.setIndex(1);
    	assertTrue(goSquare.getIndex() == 1);
    }
    
    @Test
    @Order(7)
    public void goSquareTestGainSalaryReturnType() {
    	assertTrue(Integer.class.isInstance(goSquare.gainSalary()));
    }
    
    @Test
    @Order(8)
    public void goSquareTestGainSalary() {
    	int result = goSquare.gainSalary();
    	assertTrue(result == 1500);
    }
}
