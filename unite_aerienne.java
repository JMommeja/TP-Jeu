package aw;

public class unite_aerienne extends unite{

	public unite_aerienne( String nom, int cout,int porte , int munition, Boolean active , String couleur, int coordoneX , int coordoneY ,int porteDeplacement, int pv) {
		super(nom, cout, porte , munition,  active ,  couleur, coordoneX ,coordoneY , porteDeplacement, pv);
		
	}

	public void seDeplacer(int x  , int y)
	{
		//verifier si il peut bien seplacer sur les terrain A FAIRE
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
}
