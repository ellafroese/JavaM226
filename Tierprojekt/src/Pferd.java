
public class Pferd extends Säugetier{
	
	private int preis;
	
	public Pferd(int felllänge, String fellfarbe, String name, int beine, String haut, int preis) {
		super(felllänge, fellfarbe, name, beine, haut);
		this.preis = preis;
	}
	
	public void menschTragen() {
		System.out.println("Das Pferd trägt einen Menschen.");
	}
	
	@Override
	public void machGeräusch() {
		super.machGeräusch();
		System.out.println("Whier");
	}
	
}
