
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.InJailSquare;

import java.io.ByteArrayInputStream;

public class InJailSqaureTest {
	InJailSquare inJailSquare = new InJailSquare("No Name", 0);

	/**
	 *  Test the return type of the getter function "getName" in InJail Square Class. The return type should be String.
	 */	
    @Test
    @Order(1)
	public void testInJailSquareGetNameReturnType(){
		assertTrue(String.class.isInstance(inJailSquare.getName()));
	}
    
	/**
	 *  Test the return type of the getter function "getIndex" in InJail Square Class. The return type should be Integer.
	 */
    @Test
    @Order(2)
	public void testInJailSquareGetIndexReturnType(){
		assertTrue(Integer.class.isInstance(inJailSquare.getIndex()));
	}
    
    /**
     *  Test the return content of the getter function "getName" in InJail Square Class. The return content should be "No Name".
     */
    @Test
    @Order(3)
    public void testInJailSquareGetName(){
    	assertEquals("No Name", inJailSquare.getName());
    }
    
    /**
     *  Test the return content of the getter function "getIndex" in InJail Square Class. The return content should be 0.
     */
    @Test
    @Order(4)
    public void testInJailSquareGetIndex() {
    	assertTrue(inJailSquare.getIndex() == 0);
    }
	
    /**
     *  Test the setter function "setName" in InJail Square Class. The return content should be "TestInJailSetterGetterName".
     */
    @Test
    @Order(5)
    public void testInJailSquareSetGetName(){
    	inJailSquare.setName("TestInJailSetterGetterName");
    	assertEquals("TestInJailSetterGetterName", inJailSquare.getName());
    }
    
    /**
     *  Test the setter function "setIndex" in InJail Square Class. The return content should be 1.
     */
    @Test
    @Order(6)
    public void testInJailSquareSetGetIndex() {
    	inJailSquare.setIndex(1);
    	assertTrue(inJailSquare.getIndex() == 1);
    }
    
    /**
     *  Test the return type of the function "askPayOrDice" in InJail Square Class. The return type should be Integer.
     */
    @Test
    @Order(7)
    public void testInJailSquareAskPayOrDiceReturnType() {
        String data = "1";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    	assertTrue(Integer.class.isInstance(inJailSquare.askPayOrDice(3, 1, 1)));
    }
    
    /**
     *  Test the range of the return content of the function "askPayOrDice" in InJail Square Class.
     *  If the parameter is > 0, the range of the return content should be 3 >= return content >= 0.
     *  
     *  We default the result is wrong because we have not implement the function "askPayOrDice".
     */
    @Test
    @Order(8)
    public void testInJailSquareAskPayOrDice() {
        String data = "1";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    	int result = inJailSquare.askPayOrDice(3,1, 1);
    	assertTrue(result==2);
    }

    @Test
    @Order(9)
    public void testInJailSquareAskPayOrDice2() {
        int result = inJailSquare.askPayOrDice(0,1, 1);
        assertTrue(result==2);
    }

    @Test
    @Order(10)
    public void testInJailSquareAskPayOrDice3() {
        String data = "2";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        int result = inJailSquare.askPayOrDice(3,1, 1);
        assertTrue(result==1);
    }

    @Test
    @Order(11)
    public void testInJailSquareAskPayOrDice4() {
        String data = "2";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        int result = inJailSquare.askPayOrDice(3,2, 1);
        assertTrue(result==0);
    }
    @Test
    @Order(11)
    public void testInJailSquareAskPayOrDiceErrorInput() {
        System.setIn(new ByteArrayInputStream(("4" + System.lineSeparator() + "2").getBytes()));
        int result = inJailSquare.askPayOrDice(3,2, 1);
        assertTrue(result==0);
    }
}
