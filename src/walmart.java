
public class walmart {

	
	String productName = "Shampoo";
	String service = "tyre change";
	
	public walmart() {
		System.out.println("this is a parent class constructor");
	}
	
	public void getShampoo() {
		System.out.println("this product can be distributed to convinence store 1:" + productName);
	}
	
	public void getServices() {
		System.out.println("this service is given to convinence store 2:" + service);
	}
		
}
