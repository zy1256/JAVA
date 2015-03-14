package thread.control;

public class UpperAThread extends Thread{
	@Override
	public void run(){
		while(true){
			System.out.println("A");
		}
	}

}
