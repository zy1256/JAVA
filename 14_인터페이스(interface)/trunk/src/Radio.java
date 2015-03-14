
public class Radio implements OnOff,Volume{

	@Override
	public void up() {
		System.out.println("Radio.up()");
	}

	@Override
	public void down() {
		System.out.println("Radio.down()");
	}

	@Override
	public void on() {
		System.out.println("Radio.on()");
	}

	@Override
	public void off() {
		System.out.println("Radio.off()");
	}
	
}
