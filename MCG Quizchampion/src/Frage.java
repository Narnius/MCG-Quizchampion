
public class Frage {
	
	private int nummer;
	private String Kategorie;
	private int Schwierigkeitsgrad; //1 leicht, 2 mittel, 3 schwer
	private String frage;
	
	private String antwortA;
	private String antwortB;
	private String antwortC;
	private String antwortD;

	private Character korrekteAntwort;
	
	
	//Konstruktor
	public Frage(int nummer)
	{
		setNummer(nummer);
	}
	
	
	// Getters & Setters

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getKategorie() {
		return Kategorie;
	}

	public void setKategorie(String kategorie) {
		Kategorie = kategorie;
	}

	public int getSchwierigkeitsgrad() {
		return Schwierigkeitsgrad;
	}

	public void setSchwierigkeitsgrad(int schwierigkeitsgrad) {
		Schwierigkeitsgrad = schwierigkeitsgrad;
	}

	public String getFrage() {
		return frage;
	}

	public void setFrage(String frage) {
		this.frage = frage;
	}

	public String getAntwortA() {
		return antwortA;
	}

	public void setAntwortA(String antwortA) {
		this.antwortA = antwortA;
	}

	public String getAntwortB() {
		return antwortB;
	}

	public void setAntwortB(String antwortB) {
		this.antwortB = antwortB;
	}

	public String getAntwortC() {
		return antwortC;
	}

	public void setAntwortC(String antwortC) {
		this.antwortC = antwortC;
	}

	public String getAntwortD() {
		return antwortD;
	}

	public void setAntwortD(String antwortD) {
		this.antwortD = antwortD;
	}

	public Character getKorrekteAntwort() {
		return korrekteAntwort;
	}

	public void setKorrekteAntwort(Character korrekteAntwort) {
		this.korrekteAntwort = korrekteAntwort;
	}
	
}
