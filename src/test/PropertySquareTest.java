package test;

import Model.PropertySquare;
import org.junit.jupiter.api.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PropertySquareTest {
    PropertySquare square = new PropertySquare("test",2);
    
    @Test
    @Order(1)
	public void parkingSquareTestGetNameReturnType(){
		assertTrue(String.class.isInstance(square.getName()));
	}
    
    @Test
    @Order(2)
	public void parkingSquareTestGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(square.getIndex()));
	}
    
    @Test
    @Order(3)
    public void parkingSquareTestGetName(){
    	assertEquals("test", square.getName());
    }
    
    @Test
    @Order(4)
    public void parkingSquareTestGetIndex() {
    	assertTrue(square.getIndex() == 0);
    }
	
    @Test
    @Order(5)
    public void parkingSquareTestSetGetName(){
    	square.setName("TestParkingSetterGetterName");
    	assertEquals("TestParkingSetterGetterName", square.getName());
    }
    
    @Test
    @Order(6)
    public void parkingSquareTestSetGetIndex() {
    	square.setIndex(1);
    	assertTrue(square.getIndex() == 1);
    }
    
    @Test
    public void testOwned(){
        assertFalse(square.isOwned());
    }

    @Test
    public void testCostType(){
        int result=square.getCost();
        assertTrue(Integer.class.isInstance(result));
    }

    @Test
    public void testOwner(){
        square.setOwner(1);
        int result= square.getOwner();
        assertTrue(result==1);
    }
}
