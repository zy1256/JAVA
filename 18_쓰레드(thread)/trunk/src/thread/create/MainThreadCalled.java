package thread.create;

public class MainThreadCalled {
	public void mainThreadCalledMethod(){
		String threadMain = Thread.currentThread().getName();
		System.out.println("A.현재쓰레드이름 " + threadMain);
		System.out.println("B.현재쓰레드이름 " + threadMain);
		return;
	}
}
