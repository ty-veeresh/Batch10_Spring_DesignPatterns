package comm.tyss.game;

public abstract class GameMode {

	public abstract void init();
	public abstract void start();
	public abstract void end();
	
	
	public void play(){
		init();
		start();
		end();
	}
	
}
