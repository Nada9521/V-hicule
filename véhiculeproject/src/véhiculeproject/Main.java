package véhiculeproject;

public class Main {

	public static void main (String[] args) {
		Voiture V1 = new Voiture ("Ma voiture","BMW","France");
		Voiture V2 = new Voiture ("Mon voiture","Golf","Allmangne");
		Moto M1 = new Moto ("MOTO","Motobican","Tunisie");
		Moto M2 = new Moto ("Ma voiture","piagot","France");
		
		V1.avancer();
		M1.avancer();
	}
	
}
