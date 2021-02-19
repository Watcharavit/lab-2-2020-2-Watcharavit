package solar;

public class Earth extends Planet {
	private int wasteLevel;

	public Earth() {
		super();
		this.wasteLevel = 0;
		
	}

	public Earth(int orbitRadius, int wasteLevel) {
		super(orbitRadius);
		if (wasteLevel >= 0) {
			this.wasteLevel = wasteLevel;
		} else {
			this.wasteLevel = 0;
		}
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public boolean orbit() {
		if (this.wasteLevel <= 5) {
			super.orbit();
			return true;
		}
		else {
			return false;
		}
	}
}