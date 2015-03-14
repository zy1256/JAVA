package thread.control;

public class LowerAThread extends Thread{
	@Override
	public void run(){
		while(true){
			System.out.println("a");
		}
	}
}
