
package fr.fms.entities; 

public class City {

	//attributs
	public String ville;
	public String pays;
	private int habitants;
	
	//Constructeur 

	public City(String ville, String pays, int habitants) {
		setVille(ville);
		setPays(pays);
		setHabitants(habitants);
	}
	
	
//méthode
	public void setHabitants(int habitants) {
		if(habitants < 0 ) 
			System.out.println("Le nombre d'habitants ne peut pas être inferieur à 0"); 
			this.habitants = habitants;
		}

//getter et setters
	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getHabitants() {
		return this.habitants;
	}
		
	}


