
public abstract class GameObject {


	private int x;
	private int y;
    private Collidable collider ;

	public GameObject(int x, int y, Collidable collider ) {
		super();
		this.setX (x);
		this.setY (y);
		this.setCollider (collider);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x =x;
		}
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Collidable  getCollider() {
		return collider;
	}

	public void setCollider(Collidable collider) {
		if (collider == null) {
			 throw new IllegalArgumentException("Collider ne može biti nula");
		}
		
		this.collider = collider;	
}
	
	
	public boolean intersects (GameObject other) {
		
		return this.collider.intersects(other.collider);
	}
	
	
	
	public abstract String getDisplayName();

	@Override
	public String toString() {
		return "{ 'GameObject': , 'x':" + getX()+ "','y':" + getY()+ "', Collider':" + getCollider()+ "}";

	}
	
}


