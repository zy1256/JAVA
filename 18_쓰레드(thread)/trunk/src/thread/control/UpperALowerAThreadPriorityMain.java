package thread.control;

public class UpperALowerAThreadPriorityMain {

	public static void main(String[] args) {
		UpperAThread ua = new UpperAThread();
		LowerAThread la = new LowerAThread();
		ua.setPriority(3);
		la.setPriority(8);
		ua.start();
		la.start();

	}

}
