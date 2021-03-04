
public class Maus extends Säugetier {

	private int schwanzlänge;
	
	public Maus(String name, int beine, String haut, int felllänge, String fellfarbe, int schwanzlänge) {
		super(felllänge, fellfarbe, name, beine, haut);
		this.schwanzlänge = schwanzlänge;
	}
	
	public void lochGraben() {
		System.out.println("Die Maus gräbt ein Loch.");
	}
	
	@Override
	public void machGeräusch() {
		super.machGeräusch();
		System.out.println("Pieps Pieps");
	}
	
}
