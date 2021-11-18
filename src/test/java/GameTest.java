

import Controller.PlayerController;
import Controller.PropertySquareController;
import Model.Player;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import Model.Game;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class GameTest {


	@Test
	public void testStart(){
		Game game = new Game(6);

		game.setTurns(100);
		game.start();
	}
	@Test
	public void testLoad(){
		Game game = new Game();

		List<Integer> savedData= new ArrayList<>();
		savedData = game.load();
		assertFalse(savedData.isEmpty());
	}

	@Test
	public void testSave(){
		Game game = new Game(2);

		game.save();

		List<Integer> savedData= new ArrayList<>();
		savedData = game.load();
		assertFalse(savedData.isEmpty());
	}

	@Test
	@Order(1)
	public void testPlayerOutJail(){
		Game game = new Game(3);
		game.setTurns(100);
		game.setPlayerInJailForTest();
		game.start();

		PlayerController[] players = game.getPlayers();
		assertTrue(players[0].getPlayerJailStatus() == true && players[1].getPlayerJailStatus() == false && players[2].getPlayerJailStatus() == false);
	}

	@Test
	@Order(2)
	public void testPlayerBuyProperty(){
		Game game = new Game(3);
		game.setTurns(100);
		game.start();

		PlayerController[] players = game.getPlayers();
		List<PropertySquareController> player1 = players[0].getProperties();
		List<PropertySquareController> player2 = players[1].getProperties();
		List<PropertySquareController> player3 = players[2].getProperties();
		assertTrue(player1.size() == 1 && player2.size() == 1 && player3.size() == 1);
	}

	@Test
	@Order(2)
	public void testPlayerPayRent(){
		Game game = new Game(2);
		game.setTurns(100);
		game.start();

		PlayerController[] players = game.getPlayers();
		int player1Cap = players[0].getCapital();
		int player2Cap = players[1].getCapital();

		List<PropertySquareController> player1Property = players[0].getProperties();
		int rent = player1Property.get(0).getPropertyRent();
		int cost = player1Property.get(0).getPropertyCost();
		assertTrue(player2Cap - cost + rent + rent == player1Cap);
	}

	/**
	 *Test if the game can check if a turn is ended (all players have moved once)
	 * @result the function will return true and pass the test
	 */
    @Test
    @Order(1)
	public void testEndGameType(){
		Game game = new Game(2);

		assertTrue(ArrayList.class.isInstance(game.isEnded()));
	}

	@Test
	@Order(1)
	public void testEndGame(){
		Game game = new Game(2);
		ArrayList<Integer> notBroke = game.isEnded();
		assertFalse(notBroke.isEmpty());
	}

	@Test
	@Order(1)
	public void testEndGameByBroke(){
		Game game = new Game(2);

		System.setIn(new ByteArrayInputStream(("1" + System.lineSeparator() + "1").getBytes()));

		game.setPlayerBroken(0);
		game.start();
		ArrayList<Integer> notBroke = game.isEnded();
		assertTrue(notBroke.size() == 1);
	}

	@Test
	@Order(1)
	public void testEndGameByLimitRoundWithOneWinner(){
		Game game = new Game(2);
		game.setTurns(101);
		game.setPlayerBroken(0);
		game.start();

		ArrayList<Integer> winner = game.getWinner();
		assertTrue(winner.size() == 1);
	}

	@Test
	@Order(1)
	public void testEndGameByLimitRoundWithTie(){
		Game game = new Game(2);
		game.setTurns(101);
		game.start();

		ArrayList<Integer> winner = game.getWinner();
		assertTrue(winner.size() == 2);
	}


	/**
	 *Test if the game can check if a turn is ended (all players have moved once)
	 * @result the function will return true and pass the test
	 */
	@Test
	@Order(2)
	public void testMovePlayer(){
		Game game = new Game(2);

		PlayerController[] players = game.getPlayers();
		game.movePlayer(0);
		assertTrue(players[0].getPosition()>1);
	}
}
