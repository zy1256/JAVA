
public class TV implements OnOff,Volume{

	@Override
	public void up() {
		System.out.println("TV.up()");
	}

	@Override
	public void down() {
		System.out.println("TV.down()");
	}

	@Override
	public void on() {
		System.out.println("TV.on()");
	}

	@Override
	public void off() {
		System.out.println("TV.off()");
	}
	

}
