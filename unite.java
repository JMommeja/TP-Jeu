package aw;

public class unite {

	 String nom;
	 int cout;
	 int porte ; 
	 int porteDeplacement ;
	 int munition ;
	 Boolean active ;
	 String couleur ;
	 int coordoneX ;
	 int coordoneY ;
	 int pv ;

	public unite ( String nom, int cout,int porte , int munition, Boolean active , String couleur, int coordoneX , int coordoneY ,int porteDeplacement , int pv) {
		this.nom = nom;
        this.cout = cout;
        this.porte = porte;
        this.munition = munition;
        this.active = active;
        this.couleur = couleur ;
        this.coordoneX = coordoneX ;
        this.coordoneY = coordoneY ;
        this.porteDeplacement = porteDeplacement ;
        this.pv = pv ;
	}
	
	public void seDeplacer(int x , int y )
	{	
		if(this.coordoneX - x <= this.porteDeplacement || this.coordoneY - y <= this.porteDeplacement)
		{
			this.coordoneX = x;
			this.coordoneY = y;
		}
		else
		{
			throw new IllegalArgumentException("Deplacement impossible") ;
		}		
	}
	public void attaquer(unite unite)
	{
		//on check la porter
		if(this.coordoneX - unite.coordoneX <= this.porte && this.coordoneY - unite.coordoneY <= this.porte)
		{
			{
				//On check si la cible est dans la porte
				if (this.coordoneX > unite.coordoneX - this.porte  && this.coordoneY > unite.coordoneY - this.porte) 
				{
					//temporaire
					unite.pv = unite.pv - (this.pv/3 );
					System.out.println(unite.nom + " a pris des degats il a : "  + unite.getPv()  + " PV");
				}
			}
		}
		else
		{
			throw new IllegalArgumentException("attaque impossible") ;
		}		
	}
	public void capture (Batiments batiments) 
	{
		if (this.coordoneX == batiments.coordoneX &&  this.coordoneY == batiments.coordoneY) 
		{
			batiments.lvL_Capture = batiments.lvL_Capture + this.pv ;
			
			System.out.println("Le batiment " + batiments.nom +" "+ batiments.coordoneX +"/" +batiments.coordoneY + " est capturer a : "+ batiments.lvL_Capture + "/20");
			 if (batiments.lvL_Capture > 20)
			 {
				 batiments.couleur = this.couleur ;
			 }
		}
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}

	public int getMunition() {
		return munition;
	}

	public void setMunition(int munition) {
		this.munition = munition;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
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
	public int getporteDeplacement() {
		return porteDeplacement;
	}

	public void setporteDeplacement(int porteDeplacement) {
		this.porteDeplacement = porteDeplacement;
	}
	 
	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

}
