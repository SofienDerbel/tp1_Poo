package tp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
	int visiteurs;
	List<Secteur> secteursAnimaux;
	public Zoo(){
		secteursAnimaux = new ArrayList<Secteur>();
	}
	public int getVisiteurs() {
		return visiteurs;
	}
	public void setVisiteurs(int visiteurs) {
		this.visiteurs = visiteurs;
	}
	public List<Secteur> getSecteursAnimaux() {
		return secteursAnimaux;
	}
	public void setSecteursAnimaux(List<Secteur> secteursAnimaux) {
		this.secteursAnimaux = secteursAnimaux;
	}
	
	public void ajouterSecteur(String a){
		Secteur s = new Secteur();
		s.setTypeAnimauxDansSecteur(a);
		secteursAnimaux.add(s);
	}
	
	public void nouveauVisiteur(){
		if(visiteurs<getLimiteVisiteur())
		visiteurs++;
	}
	
	public int getLimiteVisiteur(){
		return secteursAnimaux.size()*15;
	}
	public void nouvelAnimal(Animal a)
	{
		for(int i = 0 ; i<secteursAnimaux.size(); i++)
		{
			if(secteursAnimaux.get(i).getTypeAnimauxDansSecteur().equals(a.getNomAnimal()))
			{
				secteursAnimaux.get(i).getAnimauxDansSecteur().add(a);
			}
				
		}
	}
	public int nombreAnimaux()
	{	int x = 0 ;
	for(int i = 0 ; i<secteursAnimaux.size(); i++)
	{
	
			x+=secteursAnimaux.get(i).getAnimauxDansSecteur().size();
		
			
	}
		return x ;
	}
}
