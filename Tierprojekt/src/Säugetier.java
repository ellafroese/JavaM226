
public class S�ugetier extends Tier{
	
	private int felll�nge;
	private String fellfarbe;
	
	public S�ugetier(int felll�nge, String fellfarbe, String name, int beine, String haut) {
		super(name, "direkt", beine, haut);
		this.fellfarbe = fellfarbe;
		this.felll�nge = felll�nge;
	}
	
	public void gibMilch() {
		System.out.println("Das Tier gibt Milch.");
	}

}
