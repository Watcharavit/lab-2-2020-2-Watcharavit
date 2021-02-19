package solar;

import java.util.ArrayList;

public class Application {
	ArrayList<Planet> planets;

	public void main() {
		Planet earth = new Earth(1, 4);
		Planet saturn = new Saturn(2, 2);
		planets.add(earth);
		planets.add(saturn);
		for (int i = 0; i <= 1; i++) {
			printPlanet(planets.get(i));
		}
	}

	static public String printPlanet(Planet planet) {
		if (planet instanceof Earth) {
			return "Earth's Waste Level is " + ((Earth) planet).getWasteLevel();
		} else if (planet instanceof Saturn){
			return "Saturn's Speed is " + ((Saturn) planet).getSpeed();
		}else {
			return "";
		}
	}

}
