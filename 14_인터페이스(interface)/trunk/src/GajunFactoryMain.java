
public class GajunFactoryMain {

	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV();
		Radio r1=new Radio();
		Radio r2=new Radio();
		Radio r3=new Radio();
		MP3 mp1=new MP3();
		MP3 mp2=new MP3();
		
		OnOff[] gajuns = new OnOff[7];
		gajuns[0]=tv1;
		gajuns[1]=tv2;
		gajuns[2]=r1;
		gajuns[3]=r2;
		gajuns[4]=r3;
		gajuns[5]=mp1;
		gajuns[6]=mp2;
		
		GajunGumsa gg = new GajunGumsa();
		gg.setGajuns(gajuns);
		gg.gumsa();
		
	}

}
