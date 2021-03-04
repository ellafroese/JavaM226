import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Tier> tiere = new ArrayList<>();
	
	
	
	public static void main(String[] args) {
		
		Maus tier = new Maus("Hans", 4, "Fell", 2, "braun", 3);
		tiere.add(tier);
		
		Pferd tier1 = new Pferd (3, "Weiss", "Ferdinand", 4, "Fell", 3000);
		tiere.add(tier1);
		
		Schlange tier2 = new Schlange("Friedrich", 0, "schön", "grün");
		tiere.add(tier2);
		
		
		for(Tier t : tiere) {
			t.machGeräusch();
		}
		
	}
	

}
