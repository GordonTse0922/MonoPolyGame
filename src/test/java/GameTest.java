

import Controller.PlayerController;
import Model.Player;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import Model.Game;

public class GameTest {
	Game game = new Game(2);
	
    @Test
    @Order(1)
	public void testEndTurn(){
		assertTrue(Boolean.class.isInstance(game.isEnded()));
	}

	@Test
	@Order(1)
	public void testMovePlayer(){
		PlayerController[] players = game.getPlayers();
		game.movePlayer(0);
		assertTrue(players[0].getPosition()>1);
	}
}
