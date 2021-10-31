package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import Model.Game;

public class GameTest {
	Game game = new Game(2);
	
    @Test
    @Order(1)
	public void chanceSquareTestGetNameReturnType(){
		assertTrue(Boolean.class.isInstance(game.isEnded()));
	}
}
