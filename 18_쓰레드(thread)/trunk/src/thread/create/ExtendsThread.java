package thread.create;

public class ExtendsThread extends Thread {
	@Override
	public void run() {
		System.out.println("A."+Thread.currentThread().getName()+" 실행");
		System.out.println("A."+Thread.currentThread().getName()+" 반환");
		while(true){
			System.out.println(Thread.currentThread().getName());
		}
	}
}
