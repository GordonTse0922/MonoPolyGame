package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.ParkingSquare;

public class ParkingSquareTest {
	ParkingSquare parkingSquare = new ParkingSquare("No Name", 0);
	
	/**
	 *  Test the return type of the getter function "getName" in Parking Square Class. The return type should be String.
	 */
    @Test
    @Order(1)
	public void testParkingSquareGetNameReturnType(){
		assertTrue(String.class.isInstance(parkingSquare.getName()));
	}
    
	/**
	 *  Test the return type of the getter function "getIndex" in Parking Square Class. The return type should be Integer.
	 */
    @Test
    @Order(2)
	public void testParkingSquareGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(parkingSquare.getIndex()));
	}
    
    /**
     *  Test the return content of the getter function "getName" in Parking Square Class.
     *  The return content should be "No Name".
     */
    @Test
    @Order(3)
    public void testParkingSquareGetName(){
    	assertEquals("No Name", parkingSquare.getName());
    }
    
    /**
     *  Test the return content of the getter function "getIndex" in Parking Square Class. The return content should be 0.
     */
    @Test
    @Order(4)
    public void testParkingSquareGetIndex() {
    	assertTrue(parkingSquare.getIndex() == 0);
    }
	
    /**
     *  Test the setter function "setName" in Parking Square Class.
     *  The return content should be "TestParkingSetterGetterName".
     */
    @Test
    @Order(5)
    public void testParkingSquareSetGetName(){
    	parkingSquare.setName("TestParkingSetterGetterName");
    	assertEquals("TestParkingSetterGetterName", parkingSquare.getName());
    }
    
    /**
     *  Test the setter function "setIndex" in Parking Square Class. The return content should be 1.
     */
    @Test
    @Order(6)
    public void testParkingSquareSetGetIndex() {
    	parkingSquare.setIndex(1);
    	assertTrue(parkingSquare.getIndex() == 1);
    }
}
