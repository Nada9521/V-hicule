package véhiculeproject;


	class Voiture extends Véhicule {
		public  Voiture (String nom, String marque,String pays) {
			super (nom, marque, pays);
		
		}
	public void avancer() {
			System.out.println("la Voiture " + marque+ " avance");
		}
}
