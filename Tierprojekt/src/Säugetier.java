
public class Säugetier extends Tier{
	
	private int felllänge;
	private String fellfarbe;
	
	public Säugetier(int felllänge, String fellfarbe, String name, int beine, String haut) {
		super(name, "direkt", beine, haut);
		this.fellfarbe = fellfarbe;
		this.felllänge = felllänge;
	}
	
	public void gibMilch() {
		System.out.println("Das Tier gibt Milch.");
	}

}
