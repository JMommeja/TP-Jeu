package aw;

import java.util.Scanner;

public class Port extends Batiments {

	public Port(String nom, int lvL_Capture , int coordoneX , int coordoneY, String couleur , int bonusDef )
	{
		   super( nom,  lvL_Capture , coordoneX ,coordoneY  , couleur  , bonusDef ) ;
		
		   
	} 
	public void créerunitéMarine (Joueur joueur)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Choisissez l'unité a créer parmis : 1:Infanterie / 2:Infanterie_AT / 3:Tank ");	
		int numerounite = input.nextInt();
		
	      switch(numerounite)
	        {
	            case 1 :
	            	if (joueur.argent>100)
	            	{	
	            	 unite Bateau_transport=new unite ("Bateau_transport", 5,5,5,true,this.couleur,this.coordoneX,this.coordoneY,3,10);
	            	 joueur.argent=joueur.argent-100;
	            	}
	            	else
	            	{
	            		System.out.println("Pas assez d'argent");
	            	}
	            break;
	            case 2:
	            	if (joueur.argent>500)
	            	{	
	            	unite Sous_marin=new unite ("Sous_marin", 5,5,5,true,this.couleur,this.coordoneX,this.coordoneY,3,10);
	            	}
	            	else
	            	{
	            		System.out.println("Pas assez d'argent");
	            	}
	            break;
	            case 3:
	            	if (joueur.argent>5000)
	            	{	
	            	unite Bateau_combat =new unite ("Bateau_combat", 5,5,5,true,this.couleur,this.coordoneX,this.coordoneY,3,10);
	            	}
	            	else
	            	{
	            		System.out.println("Pas assez d'argent");
	            	}
	            break;
	        }
	}
}

