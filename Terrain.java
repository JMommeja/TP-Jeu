package aw;
public class Terrain {
	
		String nom;
		Boolean Traversable ;
		String type ;
		int coordoneX ;
		int coordoneY ;

		
		
	public Terrain(String nom,Boolean Traversable,String type,
		int coordoneX,int coordoneY) 
	{
		this.nom = nom ;
		this.Traversable = Traversable ;
		this.type = type ;
		this.coordoneX = coordoneX ;
        this.coordoneY = coordoneY ;
	}
}
