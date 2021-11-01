

import Controller.PlayerController;
import Model.Player;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import Model.Game;

public class GameTest {
	Game game = new Game(2);

	/**
	 *Test if the game can check if a turn is ended (all players have moved once)
	 * @result the function will return true and pass the test
	 */
    @Test
    @Order(1)
	public void testEndTurn(){
		assertTrue(Boolean.class.isInstance(game.isEnded()));
	}

	/**
	 *Test if the game can check if a turn is ended (all players have moved once)
	 * @result the function will return true and pass the test
	 */
	@Test
	@Order(2)
	public void testMovePlayer(){
		PlayerController[] players = game.getPlayers();
		game.movePlayer(0);
		assertTrue(players[0].getPosition()>1);
	}
}
