package basics;

public class Weather {
	public static void main(String[] args) {
		// This program will give suggestions of what to wear based on the weather (temperature)
		
		int temperature = 85;
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt");
		} 
		else if (temperature > 60) {
			System.out.println("It's a little cooler. Perhaps wear a long-sleeve shirt and jeans");
		}
	}
}
