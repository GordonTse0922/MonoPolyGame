package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.ParkingSquare;

public class ParkingSquareTest {
	ParkingSquare parkingSquare = new ParkingSquare("No Name", 0);
	
    @Test
    @Order(1)
	public void parkingSquareTestGetNameReturnType(){
		assertTrue(String.class.isInstance(parkingSquare.getName()));
	}
    
    @Test
    @Order(2)
	public void parkingSquareTestGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(parkingSquare.getIndex()));
	}
    
    @Test
    @Order(3)
    public void parkingSquareTestGetName(){
    	assertEquals("No Name", parkingSquare.getName());
    }
    
    @Test
    @Order(4)
    public void parkingSquareTestGetIndex() {
    	assertTrue(parkingSquare.getIndex() == 0);
    }
	
    @Test
    @Order(5)
    public void parkingSquareTestSetGetName(){
    	parkingSquare.setName("TestParkingSetterGetterName");
    	assertEquals("TestParkingSetterGetterName", parkingSquare.getName());
    }
    
    @Test
    @Order(6)
    public void parkingSquareTestSetGetIndex() {
    	parkingSquare.setIndex(1);
    	assertTrue(parkingSquare.getIndex() == 1);
    }
}
