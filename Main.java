package aw;

public class Main {
	
	public static void main(String[] args) {		
		carte LaCarte = new carte();
		
		// Debut partie 
		// On check le QG des 2 equipes 
		LaCarte.QG_B.checkQG(LaCarte.Infanterie_B1);
		LaCarte.QG_R.checkQG(LaCarte.Infanterie_R1);
		// Tour rouge 
		// Joueur Rouge cr�e une unite aerienne  
		LaCarte.aeroport_R1.cr�erunit�Aero(LaCarte.J_R);		
		// deplace une unit�
		LaCarte.Infanterie_R1.seDeplacer(2,2);
		// essaye de capture l'usine 
		LaCarte.Infanterie_R1.capture((Batiments)LaCarte.usine_B1);
		// On check si l'usine est capturer si oui on donne l'argent.	
		LaCarte.usine_B1.usinecapturer(LaCarte.J_R);
		LaCarte.usine_B1.usinecapturer(LaCarte.J_B);
		// On fait un recap des sous du joueur
		Joueur.AfficherStat(LaCarte.J_R);
		// Fin du tour
		// On check le QG des 2 equipes 	
		LaCarte.QG_B.checkQG(LaCarte.Infanterie_B1);
		LaCarte.QG_R.checkQG(LaCarte.Infanterie_R1);
		// Tour Bleu
		// Joueur Bleu cr�e une unite au sol
		LaCarte.Industrie_B1.cr�erunit�Sol(LaCarte.J_B);
		// deplace une unit�
		LaCarte.Infanterie_B1.seDeplacer(0,0);
		// Essaye de capturer le QG
		LaCarte.Infanterie_B1.capture((Batiments)LaCarte.QG_R);
		
		// On check le QG des 2 equipes 
		LaCarte.QG_B.checkQG(LaCarte.Infanterie_B1);
		LaCarte.QG_R.checkQG(LaCarte.Infanterie_R1);
		
		//Fin du tour
		// tour rouge
		
		LaCarte.Infanterie_R1.capture((Batiments)LaCarte.usine_B1);
		
		LaCarte.usine_B1.usinecapturer(LaCarte.J_R);
		LaCarte.usine_B1.usinecapturer(LaCarte.J_B);
		
		Joueur.AfficherStat(LaCarte.J_R);
		
		// Fin de tour
		//tour trich�.
		// tour bleu
		LaCarte.Infanterie_B1.seDeplacer(2,2);
		LaCarte.Infanterie_B1.attaquer((unite)LaCarte.Infanterie_B1);
		LaCarte.Infanterie_B1.seDeplacer(0,0);
		LaCarte.Infanterie_B1.capture((Batiments)LaCarte.QG_R);
		LaCarte.QG_B.checkQG(LaCarte.Infanterie_B1);
		
		LaCarte.Infanterie_B1.capture((Batiments)LaCarte.QG_R);
	
		LaCarte.QG_B.checkQG(LaCarte.Infanterie_B1);
		LaCarte.QG_R.checkQG(LaCarte.Infanterie_R1);
		
		LaCarte.Infanterie_B1.capture((Batiments)LaCarte.QG_R);
		
		LaCarte.QG_B.checkQG(LaCarte.Infanterie_B1);
		LaCarte.QG_R.checkQG(LaCarte.Infanterie_R1);
		
	}
}


