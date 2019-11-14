package tp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Secteur {
String typeAnimauxDansSecteur ;
List<Animal> animauxDansSecteur ;
public Secteur(){
	animauxDansSecteur= new ArrayList<Animal>();
}
public String getTypeAnimauxDansSecteur() {
	return typeAnimauxDansSecteur;
}
public void setTypeAnimauxDansSecteur(String typeAnimauxDansSecteur) {
	this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
}
public List<Animal> getAnimauxDansSecteur() {
	return animauxDansSecteur;
}
public void setAnimauxDansSecteur(List<Animal> animauxDansSecteur) {
	this.animauxDansSecteur = animauxDansSecteur;
}

public void ajouterAnimal(Animal a)
{
	animauxDansSecteur.add(a);
}

public int getNombreAnimaux(){
	return animauxDansSecteur.size();
}
public String obtenirType(){
	return typeAnimauxDansSecteur;
}
}
