import java.beans.PropertyChangeListener;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class Driver {

	private static DigitalPin pin1 = new DigitalPin();
	private static DigitalPin pin2 = new DigitalPin();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digital Pin 1 has been initialized");
		System.out.println("Digital Pin 2 has been initialized");
		pin1.addListener(new Listener("digitalPin") {
			public <T> void propertyChanged(final String p, final T oldValue,
					final T newValue) {
				System.out.println(p + " changed: " + oldValue + " to "	+ newValue);
				// TODO
			}
		});
		pin2.addListener(new Listener("digitalPin") {
			public <T> void propertyChanged(final String p, final T oldValue,
					final T newValue) {
				System.out.println(p + " changed: " + oldValue + " to "
						+ newValue);
				// TODO
			}
		});

		String quit = "";
		while (!quit.equalsIgnoreCase("y")) {

			System.out.println("Change the value for p1 or p2?");
			String choice = keyboard.nextLine();

			if (choice.equalsIgnoreCase("p1")) {
				if (pin1.GetPinValue() == 0) {
					pin1.SetPinValue(1);
					System.out.println("changed pin1 to 1");
				} else {
					pin1.SetPinValue(0);
					System.out.println("changed pin1 to 0");
				}
			} else {
				if (pin2.GetPinValue() == 0) {
					pin2.SetPinValue(1);
					System.out.println("changed pin2 to 1");
				} else {
					pin2.SetPinValue(0);
					System.out.println("changed pin2 to 0");
				}

			}

			System.out.println("Would you like to quit? (y/n)");
			quit = keyboard.nextLine();
		}

	}

//	public static PropertyChangeListener pin1Change() {
//		Date date = new Date();
//		Timestamp ts = new Timestamp(date.getTime());
//		System.out.println(ts + "Digital pin 1 has changed");
//		System.out.println(ts + " : " + "new pin 1 value is "
//				+ pin1.GetPinValue());
//		return null;
//	}
//
//	public static PropertyChangeListener pin2Change() {
//		System.out.println("Digital pin 2 has changed");
//		Date date = new Date();
//		Timestamp ts = new Timestamp(date.getTime());
//		System.out.println(ts + " : " + "new pin 2 value is "
//				+ pin2.GetPinValue());
//		return null;
//	}

}
