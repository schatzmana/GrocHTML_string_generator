
public class HTML_string_generator {

	public static final String API_key = "d8cd93d2a376344378a78c8f57ff0e83";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( locID_gen("ffy5Pc7R") );
		System.out.println( prodAvail_gen("123456789", "KV0jAidH,AAKEVdmW") );

	}

	public static String locID_gen (String ID) {
		return ("https://api.goodzer.com/products/v0.1/location_details/?locationId="+ ID +"&apiKey=" + API_key);		
	}

	public static String prodAvail_gen (String prodID, String locIDs) {
		return ("http://inventory.goodzer.com/products/v0.1/product_availability/?productId=" + prodID +"&locationIds="+ locIDs +"&apiKey=" + API_key);
	}

	public static String storeLoc_gen (String storeID, double lat, double lng, double radius, int offset, int limit) {
		//defaults: radius = 10, offset = 0, limit = 50

		if (radius == 0 && offset == 0 && limit == 0 ) {
			return ("https://api.goodzer.com/products/v0.1/store_locations/?storeId="+ storeID +" &lat="+ lat +"&lng="+ lng +"&apiKey=" + API_key);
		}else if (radius == 0 && offset == 0 && limit != 0 ) {
			return ("https://api.goodzer.com/products/v0.1/store_locations/?storeId="+ storeID +" &lat="+ lat +"&lng="+ lng +"&limit"+ limit +"&apiKey=" + API_key);	
		}else if (radius == 0 && offset != 0 && limit == 0 ) {
			return ("https://api.goodzer.com/products/v0.1/store_locations/?storeId="+ storeID +" &lat="+ lat +"&lng="+ lng +"&offset"+ offset +"&apiKey=" + API_key);	
		}else if (radius == 0 && offset != 0 && limit != 0 ) {
			return ("https://api.goodzer.com/products/v0.1/store_locations/?storeId="+ storeID +" &lat="+ lat +"&lng="+ lng +"&offset"+ offset +"&limit"+ limit +"&apiKey=" + API_key);	
		}else if (radius != 0 && offset == 0 && limit == 0 ) {
			return ("https://api.goodzer.com/products/v0.1/store_locations/?storeId="+ storeID +" &lat="+ lat +"&lng="+ lng +"&radius"+ radius +"&apiKey=" + API_key);	
		}else if (radius != 0 && offset == 0 && limit != 0 ) {
			return ("https://api.goodzer.com/products/v0.1/store_locations/?storeId="+ storeID +" &lat="+ lat +"&lng="+ lng +"&radius"+ radius +"&limit"+ limit +"&apiKey=" + API_key);	
		}else if (radius != 0 && offset != 0 && limit == 0 ) {
			return ("https://api.goodzer.com/products/v0.1/store_locations/?storeId="+ storeID +" &lat="+ lat +"&lng="+ lng +"&radius"+ radius + "&offset"+ offset +"&apiKey=" + API_key);	
		}else{ //(radius != 0 && offset != 0 && limit != 0 )
			return ("https://api.goodzer.com/products/v0.1/store_locations/?storeId="+ storeID +" &lat="+ lat +"&lng="+ lng +"&radius"+ radius + "&offset"+ offset +"&limit"+ limit +"&apiKey=" + API_key);	
		}
	}
	
	public static String searchInStore_gen (String storeID, String query, int offset, String sorting, String priceRange) {
		if(sorting=="0"){
			sorting = new String("relevance");
		}
		if(priceRange=="0"){
			priceRange = new String("");
		}
		
		return ("https://api.goodzer.com/products/v0.1/search_in_store/?storeId="+storeID+"&query="+query+"&offset="+offset+"&sorting="+sorting+"&priceRange="+priceRange+"&apiKey="+API_key);
	}
	
	

}
