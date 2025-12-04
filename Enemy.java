
public class Enemy extends GameObject implements Attacker {

	private String type;
	private int damage;
	private int health;

	public Enemy(int x, int y, Collidable collider, String type, int damage, int health) {
		super(x, y, collider);
		this.setType(type);
		this.setDamage(damage);
		this.setHealth(health);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (type == null || type.trim().isEmpty()) {
			throw new IllegalArgumentException("Tip ne može biti prazan");
		}
		this.type = type;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if (damage < 0 || damage > 100) {
			throw new IllegalArgumentException("Damage mora biti izmedju 0 i 100");
		}
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health < 0 || health > 100) {
			throw new IllegalArgumentException("Health mora biti izmedju 0 i 100");
		}
		this.health = health;
	}

	@Override
	public int getEffectiveDamage() {
		return damage;
	}

	@Override
	public String getDisplayName() {
		return type;
	}
}
