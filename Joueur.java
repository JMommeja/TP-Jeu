package aw;

public class Joueur {
	String nom ;
	int argent ;
	
	public Joueur(String nom ,int argent) {
		this.nom = nom ;
		this.argent = argent ;
	}
	
	public static void AfficherStat(Joueur joueur) 
	{
		System.out.println(joueur.nom + " posséde " +joueur.argent);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}
}
