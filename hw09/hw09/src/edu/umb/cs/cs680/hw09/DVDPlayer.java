package edu.umb.cs.cs680.hw09;

public class DVDPlayer {
	
	private DVDPlayer player; 
	private State state;
	
	public DVDPlayer() {
		this.player = player;
	};
	

	public void changestate(State state) {
		this.state=state;
	}

	public State getState() {
		return state;
	}

	public void openClosedButtonPushed() {
		 state.openCloseButtonPushed(player);
	}
	public void playButtonPushed() {
		 state.playButtonPushed(player);
	}
	public void stopButtonPushed() {
		state.stopButtonPushed(player);
	}
	public void open() {
		System.out.println("OPEN");
	}
	public void close() {
		System.out.println("CLOSE");	
	}
	public void play() {
		System.out.println("PLAY");	
	}
	public void stop() {
		System.out.println("STOP");
	}

}
