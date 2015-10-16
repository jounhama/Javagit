package fi.agileo.matkakeskus.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunaTest {

	@Test
	public void testNumero() {
		Juna juna = new Juna(111, 123, 0); //int numero, int maxMatkustaja, int matkustajiaKyydissa)
		assertEquals(111, juna.getNumero());
	}
	
	@Test
	public void testMaxMatkustaja() {
		Juna juna = new Juna(111, 223, 0); //int numero, int maxMatkustaja, int matkustajiaKyydissa)
		assertEquals(223, juna.getMaxMatkustaja());
	}
	
	@Test
	public void testMatkustajiaKyydissa() {
		Juna juna = new Juna(111, 123, 3); //int numero, int maxMatkustaja, int matkustajiaKyydissa)
		assertEquals(3, juna.getMatkustajiaKyydissa());
	}
	
	@Test
	public void testLisaaMatkustaja() {
		Juna juna = new Juna(111, 123, 3); //int numero, int maxMatkustaja, int matkustajiaKyydissa)
		juna.lisaaMatkustaja(4);
		assertEquals(7, juna.getMatkustajiaKyydissa());
	}
	
	@Test
	public void testVahennaMatkustaja() {
		Juna juna = new Juna(111, 123, 3); //int numero, int maxMatkustaja, int matkustajiaKyydissa)
		juna.vahennaMatkustaja(2);
		assertEquals(1, juna.getMatkustajiaKyydissa());
	}
}
