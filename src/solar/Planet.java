package solar;

public class Planet {
	protected Coordinate coordinate;
	protected Coordinate orbitCenterCoordinate;
	protected int orbitRadius;

	public Planet() {
		coordinate = new Coordinate(1,0);
		orbitCenterCoordinate = new Coordinate(0, 0);
		this.orbitRadius = 1;
	}

	public Planet(int orbitRadius) {
		orbitCenterCoordinate = new Coordinate(0, 0);
		if (orbitRadius >= 1) {
			coordinate = new Coordinate(orbitRadius, 0);
			this.orbitRadius = orbitRadius;
		} else {
			coordinate = new Coordinate(1, 0);
			this.orbitRadius = 1;
		}
	}

	public Coordinate getCoordinate() {
		return this.coordinate;
	}

	public Coordinate getOrbitCenterCoordinate() {
		return this.orbitCenterCoordinate;
	}

	public int getOrbitRadius() {
		return this.orbitRadius;
	}

	public boolean orbit() {
		if (orbitCenterCoordinate.getY()==this.coordinate.getY() && orbitCenterCoordinate.getX()+orbitRadius == this.coordinate.getX()) {
			this.coordinate.setX(orbitCenterCoordinate.getX());
			this.coordinate.setY(-orbitRadius);
			return true;
		}
		else if (orbitCenterCoordinate.getX()==this.coordinate.getX() && orbitCenterCoordinate.getY()-orbitRadius == this.coordinate.getY()) {
			this.coordinate.setX(-orbitRadius);
			this.coordinate.setY(orbitCenterCoordinate.getY());
			return true;
		}
		else if (orbitCenterCoordinate.getY()==this.coordinate.getY() && orbitCenterCoordinate.getX()-orbitRadius == this.coordinate.getX()) {
			this.coordinate.setX(orbitCenterCoordinate.getX());
			this.coordinate.setY(orbitRadius);
			return true;
		}
		else if (orbitCenterCoordinate.getX()==this.coordinate.getX() && orbitCenterCoordinate.getY()+orbitRadius == this.coordinate.getY()) {
			this.coordinate.setX(orbitRadius);
			this.coordinate.setY(orbitCenterCoordinate.getY());
			return true;
		}
		else {
			return false;
		}
	}
}
