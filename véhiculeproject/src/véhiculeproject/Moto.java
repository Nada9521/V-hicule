package véhiculeproject;


	class Moto extends Véhicule {
		public  Moto (String nom, String marque,String pays) {
			super (nom, marque, pays);
		
		}
		public void avancer() {
			System.out.println("le Moto avance");
		}

}
