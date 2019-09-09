package edu.umb.cs.cs680.hw09;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class DrawerClosedNotPlayingTest {
	
	DrawerClosedNotPlaying closednp = new DrawerClosedNotPlaying();
	DVDPlayer player1 = new DVDPlayer();
	
	@Test
	public void openCloseButtonPushedTest()
	{
		closednp.openCloseButtonPushed(player1);
		String expected = "DrawerOpen";
		String actual = player1.getState().toString();
		assertEquals (actual,expected);
	}
	
	@Test
	public void playButtonPushed()
	{
		closednp.playButtonPushed(player1);
		String expected = "DrawerClosedPlaying";
		String actual = player1.getState().toString();
		assertEquals (actual,expected);
	}
	
	@Test
	public void stopButtonPushed()
	{
		closednp.stopButtonPushed(player1);
		String expected = "DrawerClosedNotPlaying";
		String actual = player1.getState().toString();
		assertEquals (actual,expected);
	}



}

