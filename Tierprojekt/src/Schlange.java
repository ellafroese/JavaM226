
public class Schlange extends Reptil{
	
	private String schuppenfarbe;
	
	public Schlange(String name, int beine, String lederart, String schuppenfarbe) {
		super(name, beine, lederart);
		this.schuppenfarbe = schuppenfarbe;
	}
	
	public void h�uten() {
		System.out.println("Die Schlange hat sich geh�utet");
	}
	
	
	@Override
	public void machGer�usch() {
		super.machGer�usch();
		System.out.println("zischhhhh");
	}
	

}
