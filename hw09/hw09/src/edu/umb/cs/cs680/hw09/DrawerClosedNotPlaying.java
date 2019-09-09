package edu.umb.cs.cs680.hw09;

public class DrawerClosedNotPlaying implements State {
	
	public DrawerClosedNotPlaying () {}

	public void openCloseButtonPushed(DVDPlayer player) {
		player.open();
		player.changestate(new DrawerOpen());
		
}
    public void playButtonPushed(DVDPlayer player){
		player.close();
    	player.play();
		player.changestate(new DrawerClosedPlaying());
}
    public void stopButtonPushed(DVDPlayer player) {
    	
		player.changestate(new DrawerClosedNotPlaying());
    }
    
    public String toString()
	{
		return "DrawerClosedNotPlaying";
	}

}
