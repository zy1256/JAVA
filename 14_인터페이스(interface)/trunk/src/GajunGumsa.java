
public class GajunGumsa {
	
	private OnOff[] gajuns;

	public OnOff[] getGajuns() {
		return gajuns;
	}
	public void setGajuns(OnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	public void gumsa(){
		for (int i = 0; i < gajuns.length; i++) {
			gajuns[i].on();
			Volume tempGajun = (Volume)gajuns[i];
			tempGajun.up();
			tempGajun.down();
			gajuns[i].off();
			System.out.println("------Ãâ°í-------");
		}
	}
	

}
