
public abstract class CircleColllider implements Collidable {

	private int x, y;
	private int radius; // poluprecnik

	public CircleColllider(int x, int y, int radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("poluprecnik ne smije nula i  manji od nule");
		}

		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	private int clamp(int value, int min, int max) {
		if (value < min) {
			return min;
		} else if (value > max) {
			return max;
		} else {
			return value;
		}
	}

	@Override
	public boolean intersects(Collidable other) {

		if (other instanceof CircleColllider) { // provjeravamo da li je krug u pitanju
			CircleColllider c = (CircleColllider) other; // neprijateljski krug
			int dx = this.x - c.x; // vertikalnu udaljenost na osnovu pitagorine teoreme
			int dy = this.y - c.y; // horizontalnu udaljenost na osnovu pitagorine teoreme

			double distance = Math.sqrt(dx * dx + dy * dy); // udaljenost izmedju dva kruga
			return distance <= this.radius + c.radius; // ako je udaljenost manja ili jednaka zbiru precnika

		} else if (other instanceof RectangleCollider r) { // pravougaonik
			return other.intersects(this); // prepusti krugu da izračuna
		} else {
			return false; // uneseno nesto sto nije krug ili pravougaonik
		}
	}
}
