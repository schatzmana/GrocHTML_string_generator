
public class SearchLocations {
	// returns <= 500 store locations (brief info about them) 
	// close to radius given that have specified product
	
	String status;
	Location[] locations;
	
	public void makeLocations (int num) { // tells you how many locations to make
		locations = new Location[num];
		
		for (int i=0; i<num; i++) {
			locations[i].type = 0;
		}
	}
	
}
	