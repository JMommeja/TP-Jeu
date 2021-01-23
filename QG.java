package aw;

public class QG extends Batiments 
{ 
	
	public QG(String nom, int lvL_Capture , int coordoneX , int coordoneY, String couleur, int bonusDef )
	{
		   super( nom,  lvL_Capture , coordoneX ,coordoneY  , couleur , bonusDef ) ;
	} 
	public void checkQG (unite unite)
	// je ne sais selectionner toutes les unites 
	{
		unite.fatigue = false ;
		System.out.println(this.nom +" est capturer a " + this.lvL_Capture + "/ 20 ");
		if (this.lvL_Capture >= 20)
		{
			System.out.println("Equipe " + this.nom + " a perdu");
		}
		
	}	
}

