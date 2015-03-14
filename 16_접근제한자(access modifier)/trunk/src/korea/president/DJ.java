package korea.president;

import america.persident.Bush;

public class DJ {
	public int a;
	protected int b;
	int c;
	private int d;
	
	public void a(){
		System.out.println("public method a();");
	}
	protected void b(){
		System.out.println("protected method b();");
	}
	void c(){
		System.out.println("method c();");
	}
	private void d(){
		System.out.println("private method a();");
	}
	public void access(){
		/****같은 패키지의 경우*****/
		YS ys = new YS();
		ys.a = 1;
		ys.b = 2;
		ys.c = 3;
		//ys.d = 4;
		ys.a();
		ys.b();
		ys.c();
		//ys.d();
		/******다른 패키지*******/
		Bush bs = new Bush();
		bs.a=1;
		//bs.b=2;
		//bs.c=3;
		//bs.d=4;
		
		bs.a();
		//bs.b();
		//bs.c();
		//bs.d();
		
		
	}

}
