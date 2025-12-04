
public class Player extends GameObject {

	private String imeIgraca;
	private int health;

	public Player(int x, int y, Collidable collider, String imeIgraca, int health) {
		super(x, y, collider);
		this.imeIgraca = imeIgraca;
		this.health = health;
	}

	public String getImeIgraca() {
		return imeIgraca;
	}

	public void setImeIgraca(String imeIgraca) {
		if (imeIgraca == null) {
			throw new IllegalArgumentException("Ime ne može biti null");
		}
		this.imeIgraca = imeIgraca;
		{
			imeIgraca = imeIgraca.trim().replaceAll("\\s+", " "); // micemo sve sto nam je na pocetku a sta je visak
			String[] ime = imeIgraca.split(" "); // splitujemo kako bi makpli raymake
			StringBuilder sb = new StringBuilder();

			for (String i : ime) {
				if (!i.isEmpty()) {
					sb.append(Character.toUpperCase(i.charAt(0)));
					sb.append(i.substring(1).toLowerCase());
					sb.append(" ");

					// AKO POCINJE MALIM SLOVOM NAPISI U VELIKO
					// NAKON TOGA UZMI SVA SLOVA OSIM PRVOG I PRETVORI U MALA
					// DODAJ RAZMAKE IZMEDJU I TO SVE SPAJA
				}
				imeIgraca = sb.toString().trim();
			}

			if (imeIgraca.isEmpty()) {
				throw new IllegalArgumentException("Ime mora iti uneseno");
			}

			this.imeIgraca = imeIgraca;
		}
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health < 0 || health > 100) {
			throw new IllegalArgumentException("Health mora biti između 0 i 100");
		}
		this.health = health;
	}

	@Override
	public String getDisplayName() {
		return imeIgraca;
	}

	@Override
	public String toString() {
		return "Player [" + imeIgraca + "] @ (" + getX() + "," + getY() + ") " + getCollider() + " HP=" + health;
	}
}
