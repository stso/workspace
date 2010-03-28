/**
 * 
 */

/**
 * @author stso
 *
 */
public class OverloadingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new OverloadingExample();
	}

	public void OverloadingExample(int foo) {
		System.out.println("int");
	}
	
	public void OverloadingExample(long bar) {
		System.out.println("long");
	}
}
