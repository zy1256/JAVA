package thread.create;

public class ExtendsThread extends Thread {
	@Override
	public void run() {
		System.out.println("A."+Thread.currentThread().getName()+" ����");
		System.out.println("A."+Thread.currentThread().getName()+" ��ȯ");
		while(true){
			System.out.println(Thread.currentThread().getName());
		}
	}
}
