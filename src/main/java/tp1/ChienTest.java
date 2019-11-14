package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChienTest {

	@Test
	public void testNouvelAnimal() {
		Zoo myZ = new Zoo();
		myZ.ajouterSecteur("Chien");
		Chien a = new Chien();
		a.setNomAnimal("Chien");
		assertEquals(15, myZ.getLimiteVisiteur());
		for(int i = 0 ; i<20;i++)
			myZ.nouvelAnimal(a);
		
		assertEquals(1, myZ.getSecteursAnimaux().size());
		assertEquals(15, myZ.getLimiteVisiteur());
	}

}
