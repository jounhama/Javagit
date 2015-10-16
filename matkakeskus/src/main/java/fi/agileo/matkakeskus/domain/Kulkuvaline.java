package luokat;

public class Kulkuvaline {
	private int numero;
	private int maxMatkustaja;
	private int matkustajiaKyydissa;
	
	public Kulkuvaline(int numero, int maxMatkustaja, int matkustajiaKyydissa) {
		super();
		this.numero = numero;
		this.maxMatkustaja = maxMatkustaja;
		this.matkustajiaKyydissa = matkustajiaKyydissa;
	}
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
		return matkustajiaKyydissa;
	}
	public void setMatkustajiaKyydissa(int matkusLkm) {
		this.matkustajiaKyydissa = matkusLkm;
	}
	public void lisaaMatkustaja(int lkm) {
		if (maxMatkustaja >= (matkustajiaKyydissa + lkm))
		    matkustajiaKyydissa = matkustajiaKyydissa + lkm;
	}
	public void vahennaMatkustaja(int lkm) {
		if (0 <= (matkustajiaKyydissa - lkm))
		    matkustajiaKyydissa = ( matkustajiaKyydissa - lkm);
	}
	
}
