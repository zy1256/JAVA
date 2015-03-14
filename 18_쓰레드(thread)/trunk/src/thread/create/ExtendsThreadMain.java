package thread.create;

public class ExtendsThreadMain {

	public static void main(String[] args) {
		System.out.println("main start");
		ExtendsThread et = new ExtendsThread();
		/*
		 * Causes this thread to begin execution; the Java Virtual Machine calls the run method 
		 * of this thread. 

			The result is that two threads are running concurrently: the current thread (which 
			returns from the call to the start method) and the other thread (which executes its run method). 


		 */
		et.start();
		
		System.out.println("2.main return");
		while(true){
			System.out.println("main");
		}
	}

}
