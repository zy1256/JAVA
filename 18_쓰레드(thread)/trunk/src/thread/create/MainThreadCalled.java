package thread.create;

public class MainThreadCalled {
	public void mainThreadCalledMethod(){
		String threadMain = Thread.currentThread().getName();
		System.out.println("A.���羲�����̸� " + threadMain);
		System.out.println("B.���羲�����̸� " + threadMain);
		return;
	}
}
