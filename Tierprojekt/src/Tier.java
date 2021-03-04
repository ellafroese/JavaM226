
public class Tier {
	
	private String name;
	private String zeugungsart;
	private int beine;
	private String haut;
	
	public Tier(String name, String zeugungsart, int beine, String haut) {
		this.name = name;
		this.zeugungsart = zeugungsart;
		this.beine = beine;
		this.haut = haut;
		
	}
	
	public void machGeräusch() {
		System.out.println("Das Tier macht jetzt ein Geräusch: ");
	}

}
