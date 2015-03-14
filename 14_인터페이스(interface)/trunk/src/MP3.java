
public class MP3 implements OnOff,Volume{

	@Override
	public void up() {
		System.out.println("MP3.up()");
	}

	@Override
	public void down() {
		System.out.println("MP3.down()");
	}

	@Override
	public void on() {
		System.out.println("MP3.on()");
	}

	@Override
	public void off() {
		System.out.println("MP3.off()");
	}
	
}
