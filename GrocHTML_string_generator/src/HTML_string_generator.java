
public class HTML_string_generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( locID_gen("ffy5Pc7R") );
		System.out.println( prodAvail_gen("123456789", "KV0jAidH,AAKEVdmW") );

	}
	
	public static String locID_gen (String ID) {
		return ("https://api.goodzer.com/products/v0.1/location_details/?locationId="+ ID +"&apiKey=d8cd93d2a376344378a78c8f57ff0e83");		
	}
	
	public static String prodAvail_gen (String prodID, String locIDs) {
		return ("http://inventory.goodzer.com/products/v0.1/product_availability/?productId=" + prodID +"&locationIds="+ locIDs +"&apiKey=d8cd93d2a376344378a78c8f57ff0e83");
	}
	
	
}
