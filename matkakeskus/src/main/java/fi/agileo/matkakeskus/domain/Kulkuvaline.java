package fi.agileo.matkakeskus.domain;

public class Kulkuvaline {
	private int numero;
	private int maxMatkustaja;
	private int MatkustajiaKyydissa;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getMaxMatkustaja() {
		return maxMatkustaja;
	}
	public void setMaxMatkustaja(int maxMatkustaja) {
		this.maxMatkustaja = maxMatkustaja;
	}
	public int getMatkustajiaKyydissa() {
		return MatkustajiaKyydissa;
	}
	public void setMatkustajiaKyydissa(int matkustajiaKyydissa) {
		MatkustajiaKyydissa = matkustajiaKyydissa;
	}
	
}
