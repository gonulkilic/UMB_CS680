package edu.umb.cs.cs680.hw09;

public class DrawerOpen implements State {

	public DrawerOpen() {}

	
	public void openCloseButtonPushed(DVDPlayer player){
		player.close();
		player.changestate(new DrawerClosedNotPlaying());
	}
	public void playButtonPushed(DVDPlayer player){
		player.close();
		player.play();
		player.changestate(new DrawerClosedPlaying());
	}
	public void stopButtonPushed(DVDPlayer player) {
		player.changestate(new DrawerOpen());
	}
	
	public String toString()
{
	return "DrawerOpen";	}
}
