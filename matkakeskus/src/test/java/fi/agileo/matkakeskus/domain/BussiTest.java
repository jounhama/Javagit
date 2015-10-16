package luokat;

import static org.junit.Assert.*;

import org.junit.Test;

public class BussiTest {

	@Test
	public void testNumero() {
		Bussi bussi = new Bussi(111, 123, 0); //int numero, int maxMatkustaja, int matkustajiaKyydissa)
		assertEquals(111, bussi.getNumero());
	}

	@Test
	public void testMaxMatkustaja() {
		Bussi bussi = new Bussi(111, 223, 0); //int numero, int maxMatkustaja, int matkustajiaKyydissa)
		assertEquals(223, bussi.getMaxMatkustaja());
	}
 
	@Test
	public void testMatkustajiaKyydissa() {
		Bussi bussi = new Bussi(111, 123, 3); //int numero, int maxMatkustaja, int matkustajiaKyydissa)
		assertEquals(3, bussi.getMatkustajiaKyydissa());
	}

	@Test
	public void testLisaaMatkustaja() {
		Bussi bussi = new Bussi(111, 123, 3); //int numero, int maxMatkustaja, int matkustajiaKyydissa)
		bussi.lisaaMatkustaja(4);
		assertEquals(7, bussi.getMatkustajiaKyydissa());
		bussi.lisaaMatkustaja(4);
		assertEquals(11, bussi.getMatkustajiaKyydissa());
	}

	@Test
	public void testVahennaMatkustaja() {
		Bussi bussi = new Bussi(111, 123, 3); //int numero, int maxMatkustaja, int matkustajiaKyydissa)
		bussi.vahennaMatkustaja(2);
		assertEquals(1, bussi.getMatkustajiaKyydissa());
		bussi.vahennaMatkustaja(2);                      // ei v�henn�
		assertEquals(1, bussi.getMatkustajiaKyydissa()); 
		bussi.vahennaMatkustaja(1);
		assertEquals(0, bussi.getMatkustajiaKyydissa());
	}
}
