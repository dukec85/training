package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Nashville"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// Declare array
		String[] countries; 
				
		// Define the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[2]);
		
		System.out.println("****************");
				
		// Declare and define the array (only size) 
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Tennessee";
		states[2] = "Utah";
		states[3] = "Vermont";
		states[4] = "Ohio";
		int i = 0;
		
		// Do Loop: enters the loop THEN tests the condition
		do {
			System.out.println("STATE: " + states[i]);
			i = i + 1;
		} while (i < 5);
		
		
		// While Loop: tests condition first the enters loop
		int n = 0;
		while (n <= 4) {
			System.out.println("STATE at " + n + ": " + states[n]);
			n++;
		}
		
		System.out.println("\nPRINTING WITH FOR LOOP");
		// For Loop: best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
	}

}
