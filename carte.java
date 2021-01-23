package aw;
import java.util.ArrayList;
public class carte {
	
	public ArrayList<unite> unite ;
	public ArrayList<Batiments> batiments ;
	public ArrayList<Terrain> terrain ;
	
	public QG QG_R ;
	public QG QG_B ;
	public Port port_R ; 
	public Aeroport aeroport_R1 ; 
	public Industrie Industrie_B1 ;
	public Industrie Industrie_R1 ;
	public Joueur J_R ;
	public Joueur J_B ;
	public Usine usine_B1 ;
	public Usine Usine_W ;
	public Usine Usine_R ;
	public unite_terrestre Infanterie_B1 ;
	public unite_terrestre Infanterie_R1 ;
	
	public carte() 
	{
		 J_R = new Joueur ("Joueur_Rouge" , 500);
		 J_B = new Joueur ("Joueur_Bleu" , 500);
		
		ArrayList<unite> unite = new ArrayList<unite>();
		ArrayList<Batiments> batiments = new ArrayList<Batiments>();
		ArrayList<Terrain> terrain = new ArrayList<Terrain>();
		
		//0_0 a 0_6
		QG_R =new QG ("QG_Rouge",0,0,0,"R",3);
		Terrain Case0_1=new Terrain ("Ocean",true,"M",0,1);
		Terrain Case0_2=new Terrain ("Plaine",true,"T",0,2);
		aeroport_R1 =new Aeroport ("Aeroport",0,0,3,"R",1);
		Terrain Case0_4=new Terrain ("Plaine",true,"T",0,4);
		Terrain Case0_5=new Terrain ("Ocean",true,"M",0,5);
		QG_B = new QG ("QG_Bleu",0,0,6,"B",3);
		//1_0 a 1_6
		Industrie_R1 =new Industrie ("Industrie",0,1,0,"B",1);
		Terrain Case1_1=new Terrain ("Plaine",true,"T",1,1);
		Terrain Case1_2=new Terrain ("Plaine",true,"T",1,2);
		Terrain Case1_3=new Terrain ("Plaine",true,"T",1,3);
		Terrain Case1_4=new Terrain ("Plaine",true,"T",1,4);
		Terrain Case1_5=new Terrain ("Plaine",true,"T",1,5);
		Industrie_B1 =new Industrie ("Industrie",0,1,6,"B",1);
		//2_0 a 2_6
		Infanterie_R1 = new unite_terrestre ("Infanterie", 5,100,5,true,"b",2,0,3,10);
		Terrain Case2_0=new Terrain ("Plaine",true,"T",2,0);
		Terrain Case2_1=new Terrain ("Plaine",true,"T",2,1);
		 usine_B1 = new Usine ("Usine",0,2,2,"B",3,1000);
		 Usine_W = new Usine ("Usine",0,2,3,"W",3,1000); 
		 Usine_R = new Usine ("Usine",0,2,4,"R",3,1000);
		Terrain Case2_5=new Terrain ("Plaine",true,"T",2,5);
		Terrain Case2_6=new Terrain ("Plaine",true,"T",2,6);
		Infanterie_B1 =new unite_terrestre ("Infanterie", 5,100,5,true,"b",0,1,3,10);
		
		terrain.add(Case0_1);
		terrain.add(Case0_2);
		terrain.add(Case0_4);
		terrain.add(Case0_5);
		terrain.add(Case0_1);
		terrain.add(Case0_2);
		terrain.add(Case0_4);
		terrain.add(Case0_5);
		terrain.add(Case1_1);
		terrain.add(Case1_2);
		terrain.add(Case1_3);
		terrain.add(Case1_4);
		terrain.add(Case1_5);
		terrain.add(Case2_0);
		terrain.add(Case2_1);
		terrain.add(Case2_5);
		terrain.add(Case2_6);
	}
}
