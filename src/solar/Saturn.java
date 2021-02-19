package solar;

public class Saturn extends Planet {
	private int speed;

	public Saturn() {
		super();
		this.speed = 0;
	}

	public Saturn(int orbitRadius, int speed) {
		super(orbitRadius);
		if (speed >= 0) {
			this.speed = speed;
		} else {
			this.speed = 0;
		}
	}

	public int getSpeed() {
		return speed;
	}

	public boolean orbit() {
		if (this.speed > 0) {
			for (int i = 0; i < this.speed; i++) {
				super.orbit();
			}
			return true;
		} else {
			return false;
		}
	}

}
