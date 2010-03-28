/**
 * 
 */
package scjp.chapter1;

/**
 * @author stso
 *
 */
public class EnumAsSwitchCaseExample {

	enum TimeZones { EST, CST, MST, PST, AKHIST }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TimeZones tz = TimeZones.CST;
		switch (TimeZones.CST) {
		case EST: System.out.println("EST"); break;
		case CST: System.out.println("CST"); break;
		default: System.out.println("I don't know!");
		}
	}

}
