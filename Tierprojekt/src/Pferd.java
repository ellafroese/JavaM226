
public class Pferd extends S�ugetier{
	
	private int preis;
	
	public Pferd(int felll�nge, String fellfarbe, String name, int beine, String haut, int preis) {
		super(felll�nge, fellfarbe, name, beine, haut);
		this.preis = preis;
	}
	
	public void menschTragen() {
		System.out.println("Das Pferd tr�gt einen Menschen.");
	}
	
	@Override
	public void machGer�usch() {
		super.machGer�usch();
		System.out.println("Whier");
	}
	
}
