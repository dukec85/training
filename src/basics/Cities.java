package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Nashville"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// Declare and define the array (only size) 
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Tennessee";
		states[2] = "Utah";
		states[3] = "Vermont";
		states[4] = "Ohio";
		System.out.println(states[0]);
		
		// Declare array
		String[] countries; 
		
		// Define the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[2]);
		
	}

}
