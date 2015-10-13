package SamplePackage;

import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class implementation {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String choice;
		ArrayList<String> carClours = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		Car c = new Car();

		choice = "yes";

		System.out.println("Press ok to enter details");
		in.next();

		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("Enter the id of the car");
			c.getIds().add(in.nextInt());
			String choice1 = null;

			do {
				System.out.println("Enter the colour you like for a car");
				carClours.add(in.next());

				System.out.println("Do you like more colours?");

				choice1 = in.next();
			} while ((choice1.equals("yes")));

			System.out.println("Enter the name of the car");

			c.getCarInfo().put(in.next(), carClours);

			System.out.println("Now enter your name");
			c.getPersonNameList().add(in.next());

			System.out.println("Do you want to enter details of another car?");
			choice = in.next();

		}

		System.out.println("Thank you");
		System.out.println(c);

		Connector.connect(c);

	}

}
