package thread.control;

public class ThreadSleepMain {

	public static void main(String[] args) throws InterruptedException {
		ThreadSleep ts = new ThreadSleep();
		ts.finishCount=10;
		ts.start();
		/*
		 * ������
		 */
		Thread.sleep(10000);
		ts.stop();
	}

}
