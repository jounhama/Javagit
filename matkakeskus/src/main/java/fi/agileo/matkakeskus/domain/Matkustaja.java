package fi.agileo.matkakeskus.domain;

public class Matkustaja {
	private int id;         
	private String etuNimi;
	private String sukuNimi;

	public Matkustaja(int id, String etuNimi, String sukuNimi) {
		this.id = id;
		this.etuNimi = etuNimi;
		this.sukuNimi = sukuNimi;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEtuNimi() {
		return etuNimi;
	}

	public void setEtuNimi(String etuNimi) {
		this.etuNimi = etuNimi;
	}

	public String getSukuNimi() {
		return sukuNimi;
	}

	public void setSukuNimi(String sukuNimi) {
		this.sukuNimi = sukuNimi;
	}
	public void EtsiMatka(){
	}
	public void VaraaPaikka(){
	}
	public void MaksaLippu(){
	}
	
}
