
public class Location {
	String id, storeID, name, address, city, state, phone;
	int zipcode, type;
	double latitude, longitude;
	
	/* TYPE values:
	* search locations: int 0 
	* 		id, storeID, name, lat, lng
	* 
	* location details: int 1
	* 		id, store_ID, name, address, city, state, zipcode, lat, lng, phone
	*
	* store locations & search stores & Store:  int 2
	*		id, address, city, state, zipcode, lat, lng, phone
	*/
}

	
