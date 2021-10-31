package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.JailSquare;

public class JailSquareTest {
	JailSquare jailSquare = new JailSquare("TestJailSqaure", 0);
	
    @Test
    @Order(1)
	public void jailSquareTestGetNameReturnType(){
		assertTrue(String.class.isInstance(jailSquare.getName()));
	}
    
    @Test
    @Order(2)
	public void jailSquareTestGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(jailSquare.getIndex()));
	}
    
    @Test
    @Order(3)
    public void jailSquareTestGetName(){
    	assertEquals("TestJailSqaure", jailSquare.getName());
    }
    
    @Test
    @Order(4)
    public void jailSquareTestGetIndex() {
    	assertTrue(jailSquare.getIndex() == 0);
    }
	
    @Test
    @Order(5)
    public void jailSquareTestSetGetName(){
    	jailSquare.setName("TestJailSetterGetterName");
    	assertEquals("TestJailSetterGetterName", jailSquare.getName());
    }
    
    @Test
    @Order(6)
    public void jailSquareTestSetGetIndex() {
    	jailSquare.setIndex(1);
    	assertTrue(jailSquare.getIndex() == 1);
    }
    
    @Test
    @Order(7)
    public void jailSquareTestGoToJailReturnType() {
    	assertTrue(Boolean.class.isInstance(jailSquare.goToJail()));
    }
    
    @Test
    @Order(8)
    public void jailSquareTestGoToJail() {
    	assertTrue(jailSquare.goToJail());
    }
}
