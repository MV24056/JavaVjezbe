
public abstract class RectangleCollider implements Collidable {

	private int x, y;
	private int width, height;

	public RectangleCollider(int x, int y, int width, int height) {
		if (width <= 0 && height <= 0) {
			throw new IllegalArgumentException("sirina i visina moraju biti vece od nule");
		} else {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public boolean intersects(Collidable other) {
		if (other instanceof RectangleCollider) { // provjeravamo da li je pravougaonik sa pravougaonikom sudar
			RectangleCollider r = (RectangleCollider) other; // neprijatelj
			return this.x < r.x + r.width && // ako lijeva ivica našeg pravougaonika je lijevo od desne ivice drugog
												// pravougaonika
					this.x + this.width > r.x && // desna ivica našeg pravougaonika je desno od lijeve ivice drugog
													// pravougaonika
					this.y < r.y + r.height && this.y + this.height > r.y;
		} else if (other instanceof CircleColllider) {

			return other.intersects(this);
		}
		return false;
	}

	@Override
	public String toString() {
		return "RectangleCollider" + x + y + width + height;
	}
}
