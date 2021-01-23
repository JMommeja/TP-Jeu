package aw;

public class Commandant {

	 String nom;
	 int niveau ;
	 String couleur ;
	 String capacite ;
	 
	 public Commandant(String nom , int niveau , String couleur ,  String capacite ) 
	 {
			this.nom = nom ;
			this.niveau = niveau ;
			this.couleur = couleur ;
			this.capacite = capacite ; 
	 }
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public int getNiveau() {
			return niveau;
		}

		public void setNiveau(int niveau) {
			this.niveau = niveau;
		}

		public String getCouleur() {
			return couleur;
		}

		public void setCouleur(String couleur) {
			this.couleur = couleur;
		}

		public String getCapacite() {
			return capacite;
		}

		public void setCapacite(String capacite) {
			this.capacite = capacite;
		}
		public void capacite (unite unite)
		{
			if (this.capacite == "Reparateur" ) 
			{
			//Pv tout les units allier +1	
			}
			if (this.capacite == "Tsunami")
			{
				//pv tout les units enemies -1
			}
		}
}
