
public class Maus extends S�ugetier {

	private int schwanzl�nge;
	
	public Maus(String name, int beine, String haut, int felll�nge, String fellfarbe, int schwanzl�nge) {
		super(felll�nge, fellfarbe, name, beine, haut);
		this.schwanzl�nge = schwanzl�nge;
	}
	
	public void lochGraben() {
		System.out.println("Die Maus gr�bt ein Loch.");
	}
	
	@Override
	public void machGer�usch() {
		super.machGer�usch();
		System.out.println("Pieps Pieps");
	}
	
}
