package fr.fms.entities; 

public class TestCity {

	public static void main(String[] args) {

		City city2 = new City("Toulouse", "France", 450000);
		City city3 = new City("Rome", "Italy", 450000);
		City city4 = new City("Madrid", "Espagne", 450000);

		city2.setHabitants(20000);

		//System.out.println(city2.ville + "\t" + city2.pays + "\t " + city2.habitants);
		//System.out.println(city3.ville + "\t" + city3.pays + "\t " + city3.habitants);
		//System.out.println(city4.ville + "\t" + city4.pays + "\t " + city4.habitants);

		//--------------------------------//
		
		System.out.println(city2.getVille() + "\t" + city2.getPays() + "\t " + city2.getHabitants());
		System.out.println(city3.getVille() + "\t" + city3.getPays() + "\t " + city3.getHabitants());
		System.out.println(city4.getVille() + "\t" + city4.getPays() + "\t " + city3.getHabitants());

		
		city2.setHabitants(-200);
		//--------------------------------//



	}
}