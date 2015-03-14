package thread.sync;

public class UpperLowerSyncMain {

	public static void main(String[] args) {
		Object m = new Object();
		
		UpperThread ut = new UpperThread(m);
		LowerThread lt = new LowerThread(m);
		ut.start();
		lt.start();

	}

}
