
public class Schlange extends Reptil{
	
	private String schuppenfarbe;
	
	public Schlange(String name, int beine, String lederart, String schuppenfarbe) {
		super(name, beine, lederart);
		this.schuppenfarbe = schuppenfarbe;
	}
	
	public void häuten() {
		System.out.println("Die Schlange hat sich gehäutet");
	}
	
	
	@Override
	public void machGeräusch() {
		super.machGeräusch();
		System.out.println("zischhhhh");
	}
	

}
