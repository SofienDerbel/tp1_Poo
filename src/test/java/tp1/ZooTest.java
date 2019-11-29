package tp1;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

import org.junit.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class ZooTest {
	 private static final Logger logger = LogManager.getLogger(ZooTest.class);
	 FileHandler fh;  
	@Test
	public void testNouveauVisiteur() {
		
		

		 logger.trace("entering application");
		Zoo myZ = new Zoo();
		logger.error("writing an error");
		logger.warn("writing a warn");
		logger.info("writing an info");
		logger.fatal("writing a fatal");
		
		Animal c = new Animal();
		c.setTypeAnimal("Chat");
		c.setNomAnimal("chat1");
		
		myZ.ajouterSecteur("Chien");
		
		Animal a = new Animal();
		a.setTypeAnimal("Chien");
		a.setNomAnimal("chien1");
		
		Animal a2 = new Animal();
		a2.setTypeAnimal("Chien");
		a2.setNomAnimal("chien2");
		
		myZ.nouvelAnimal(a);
		myZ.nouvelAnimal(a2);
		myZ.ajouterSecteur("Chat");
		myZ.nouvelAnimal(c);
		//assertEquals(15, myZ.getLimiteVisiteur());
		
			// before Sorting arraylist: iterate using Iterator 
	        Iterator<Secteur> custIterator = myZ.getSecteursAnimaux().iterator(); 
	  
	        System.out.println("Before Sorting:\n"); 
	        for(int i = 0 ; i< myZ.getSecteursAnimaux().size();i++)
	        	System.out.println(myZ.getSecteursAnimaux().get(i).getNombreAnimaux()+" type  "+myZ.getSecteursAnimaux().get(i).getTypeAnimauxDansSecteur());
	  
	        // sorting using Collections.sort(al, comparator); 
	        Collections.sort(myZ.getSecteursAnimaux(), new sortByNombre()); 
	  
	        // after Sorting arraylist: iterate using enhanced for-loop 
	        System.out.println("\n\nAfter Sorting:\n"); 
	        for(int i = 0 ; i< myZ.getSecteursAnimaux().size();i++)
	        	System.out.println(myZ.getSecteursAnimaux().get(i).getNombreAnimaux()+" type  "+myZ.getSecteursAnimaux().get(i).getTypeAnimauxDansSecteur());
	  
	
	        logger.trace("Exit application.");
	}

}
