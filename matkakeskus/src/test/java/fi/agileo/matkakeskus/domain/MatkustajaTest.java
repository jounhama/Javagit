package luokat;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatkustajaTest {

	@Test
	public void testMatkustaja() {
		Matkustaja m = new Matkustaja(2015, "Jaska", "Jokunen");
		assertEquals(2015, m.getId());
		assertEquals("Jaska", m.getEtuNimi());
		assertEquals("Jokunen", m.getSukuNimi());
	}
	@Test
	public void testGetId() {
	}

	@Test
	public void testSetId() {
		Matkustaja m = new Matkustaja(2015, "Jaska", "Jokunen");
		m.setId(11);
		assertEquals(11, m.getId());
	}

	@Test
	public void testSetEtuNimi() {
		Matkustaja m = new Matkustaja(2015, "JJK", "Jokunen");
		m.setEtuNimi("Heikki");
		m.setSukuNimi("Kortelainen");
		assertEquals("Heikki", m.getEtuNimi());
		assertEquals("Kortelainen", m.getSukuNimi());
	}

	@Test
	public void testEtsiMatka() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testVaraaPaikka() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testMaksaLippu() {
		fail("Not yet implemented"); // TODO
	}

}
