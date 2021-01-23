package aw;

public class Usine extends Batiments {

	int revenue = 50000;
	
	
	public Usine(String nom, int lvL_Capture , int coordoneX , int coordoneY, String couleur, int bonusDef, int revenue) 
	{
		 super( nom,  lvL_Capture , coordoneX ,coordoneY  , couleur , bonusDef ) ;
		 this.revenue=revenue;		
	}
	public void usinecapturer(Joueur joueur)
	{
		 if (this.lvL_Capture == 20)
		 {
				 joueur.setArgent(revenue);
				
		 }
		 else 
		 {
			System.out.println("Joueur "+joueur.nom+" ne possede pas cette usine"); 
		 }
	}
}
