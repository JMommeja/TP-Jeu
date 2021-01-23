package aw;
public abstract class Batiments {
	
		 String nom;
		 int lvL_Capture ;
		 int coordoneX ;
		 int coordoneY ;
		 String couleur ;
		 int bonusDef ;

		 public String getNom() {
				return nom;
			}
			public void setNom(String nom) {
				this.nom = nom;
			}
			public int getLvL_Capture() {
				return lvL_Capture;
			}
			public void setLvL_Capture(int lvL_Capture) {
				this.lvL_Capture = lvL_Capture;
			}

			public int getCoordoneX() {
				return coordoneX;
			}

			public void setCoordoneX(int coordone) {
				this.coordoneX = coordone;
			}
			public int getCoordoneY() {
				return coordoneY;
			}

			public void setCoordoneY(int coordoneY) {
				this.coordoneY = coordoneY;
			}
			public String getCouleur() {
				return couleur;
			}
			public void setCouleur(String couleur) {
				this.couleur = couleur;
			}
			public int getBonusDef() {
				return bonusDef;
			}
			public void setBonusDef(int bonusDef) {
				this.bonusDef = bonusDef;
			}
		public Batiments(String nom, int lvL_Capture , int coordoneX ,int coordoneY  , String couleur , int bonusDef )
		    {
				this.nom = nom;
	            this.lvL_Capture = lvL_Capture;
	            this.coordoneX = coordoneX ;
	            this.coordoneY = coordoneY ;
	            this.couleur = couleur;
	            this.bonusDef = bonusDef ;
	        }
		
}
