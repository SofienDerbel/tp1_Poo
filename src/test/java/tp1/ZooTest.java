package tp1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;

public class ZooTest {

	@Test
	public void testNouveauVisiteur() {
		Zoo myZ = new Zoo();
		myZ.ajouterSecteur("Chien");
		assertEquals(15, myZ.getLimiteVisiteur());
		for(int i = 0 ; i<20;i++)
			myZ.nouveauVisiteur();
		
			assertEquals(15, myZ.getVisiteurs());
		
	}

}
