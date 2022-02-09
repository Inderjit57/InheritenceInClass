
public class InheriMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConvinenceStore1 convinenceStore1 = new ConvinenceStore1();
		
		convinenceStore1.getShampoo();
		convinenceStore1.getNo();
		System.out.println("\n");
		
		ConvinenceStore2 convinenceStore2 = new ConvinenceStore2();
		convinenceStore2.getServices();
		convinenceStore2.getService();
		System.out.println("\n");
		
		ConvinenceStore3 convinenceStore3 = new ConvinenceStore3();
		convinenceStore3.getShampoo();
		convinenceStore3.getServices();
		convinenceStore3.getNo();
		convinenceStore3.getService();
		convinenceStore3.getService();
		convinenceStore3.getEverything();
	}

}
