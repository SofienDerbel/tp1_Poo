package tp1;

import java.util.Comparator;

class sortByNombre implements Comparator<Secteur> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Secteur a, Secteur b) 
    { 
        return Integer.compare(a.getNombreAnimaux(), b.getNombreAnimaux()); 
    } 
} 