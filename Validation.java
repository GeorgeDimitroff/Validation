import java.util.Scanner;
public class Validation {

	
	
	public static void main(String[] args) {
		String name, email, facility_key;
		int EGN, bulstat;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		name = scan.next();
		
		System.out.print("Въведи e-mail: ");
		email = scan.next();

		System.out.print("Enter facility key: ");
		facility_key = scan.next();

		System.out.print("Enter EGN: ");
		EGN = scan.nextInt();
		
		System.out.print("Enter Bulstat: ");
		bulstat = scan.nextInt();
		
		if(name.matches("^[A-Z]{1}[a-z]{0,49}$"))
			System.out.println("Name: " + name + " -> true");
		else 
			System.out.println("Name: " + name + " -> false");
		
		if(email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+\\.[a-zA-Z0-9]+$"))
			System.out.println("Email: " + email + " -> true");
		else 
			System.out.println("Email: " + email + " -> false");
		
		//Ако може да има символи между тиретата то израза става: ^[0-9]{2}-[a-zA-Z0-9]+-[0-9]{3}$
		if(facility_key.matches("^[0-9]{2}-[0-9]{3}$"))
			System.out.println("Facility key: " + facility_key + " -> true");
		else 
			System.out.println("Facility key: " + facility_key + " -> false");
		
		if(String.valueOf(EGN).matches("^[0-9]{10}$"))
			System.out.println("EGN: " + EGN + " -> true");
		else 
			System.out.println("EGN: " + EGN + " -> false");
		
		if(String.valueOf(bulstat).matches("^[0-9]{7}$"))
			System.out.println("Bulstat: " + bulstat + " -> true");
		else 
			System.out.println("Bulstat: " + bulstat + " -> false");
	}

}
