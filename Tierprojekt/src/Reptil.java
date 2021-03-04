
public class Reptil extends Tier{
	
	private String lederart;
	
	public Reptil(String name, int beine, String lederart) {
		super(name, "Ei", beine, "Schuppen");
		this.lederart = lederart;
	}
	
	public void schwanzAbwerfen() {
		System.out.println("Das Reptil wirft seinen Schwanz ab");
	}
	
	

}
