package edu.umb.cs.cs680.hw09;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class DrawerClosedPlayingTest {
	
	
	DrawerClosedPlaying cp = new DrawerClosedPlaying();
	DVDPlayer player1 = new DVDPlayer();
	
	@Test
	public void openCloseButtonPushedTest()
	{
		cp.openCloseButtonPushed(player1);
		String expected = "DrawerOpen";
		String actual = player1.getState().toString();
		assertEquals (actual,expected);
	}
	
	@Test
	public void playButtonPushed()
	{
		cp.playButtonPushed(player1);
		String expected = "DrawerClosedPlaying";
		String actual = player1.getState().toString();
		assertEquals (actual,expected);
	}
	
	@Test
	public void stopButtonPushed()
	{
		cp.stopButtonPushed(player1);
		String expected = "DrawerClosedNotPlaying";
		String actual = player1.getState().toString();
		assertEquals (actual,expected);
	}



}
