package aw;

import java.util.Scanner;
public class Aeroport extends Batiments 
{ 
	
	public Aeroport(String nom, int lvL_Capture , int coordoneX , int coordoneY, String couleur, int bonusDef )
	{
		   super( nom,  lvL_Capture , coordoneX ,coordoneY  , couleur , bonusDef ) ;
	} 
	public void créerunitéAero (Joueur joueur)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Choisissez l'unité a créer parmis : 1:Helicopter / 2:Chasseur / 3:Bombardier ");	
		int numerounite = input.nextInt();
		
	      switch(numerounite)
	        {
	            case 1 :
	            	if (joueur.argent>100)
	            	{	
	            	 unite Helicopter=new unite ("Helicopter", 5,5,5,true,this.couleur,this.coordoneX , this.coordoneY , 3,10);
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
	            	unite Chasseur=new unite ("Chasseur", 5,5,5,true,this.couleur,this.coordoneX , this.coordoneY  , 3,10);
	            	}
	            	else
	            	{
	            		System.out.println("Pas assez d'argent");
	            	}
	            break;
	            case 3:
	            	if (joueur.argent>5000)
	            	{
	            	unite Bombardier=new unite ("Bombardier", 5,5,5,true,this.couleur,this.coordoneX , this.coordoneY  , 3,10);
	            	}
	            	else
	            	{
	            		System.out.println("Pas assez d'argent");
	            	}
	            break;
	        }
	}
}

