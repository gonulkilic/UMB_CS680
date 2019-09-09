package edu.umb.cs.cs680.hw09;

public class DrawerClosedPlaying implements State {

	public DrawerClosedPlaying() {}
	
	public void openCloseButtonPushed(DVDPlayer player) {

		player.stop();
		player.open();
        player.changestate(new DrawerOpen());
}
	public void playButtonPushed(DVDPlayer player){	
		player.changestate(new DrawerClosedPlaying());
}
	public void stopButtonPushed(DVDPlayer player) {
	      	
		player.stop();
        player.changestate(new DrawerClosedNotPlaying());
}
	public String toString()
	{
		return "DrawerClosedPlaying";
	}
}
