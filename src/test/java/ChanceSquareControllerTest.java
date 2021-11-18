	

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Controller.ChanceSquareController;
import Model.ChanceSquare;
import View.ChanceSquareView;

public class ChanceSquareControllerTest {
	ChanceSquare chanceSquare = new ChanceSquare("test",9);
	ChanceSquareView chanceSquareView = new ChanceSquareView();
	ChanceSquareController chanceSquareController = new ChanceSquareController(chanceSquare, chanceSquareView);
	
	
}
