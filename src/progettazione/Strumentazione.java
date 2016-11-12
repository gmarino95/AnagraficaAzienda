package progettazione;

public class Strumentazione {

	private static int globalId;
	int id;
	String nome;
	String modello;
	String marca;
	int numPezzi;
	String tipologia;
	int annoAcqu;
	
	Strumentazione(String nome, String modello, String marca, int numPezzi, String tipologia, int annoAcqu) {

		this.id = globalId++;
		this.nome = nome;
		this.modello = modello;
		this.marca = marca;
		this.numPezzi = numPezzi;
		this.tipologia = tipologia;
		this.annoAcqu = annoAcqu;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	String getModello() {
		return modello;
	}

	void setModello(String modello) {
		this.modello = modello;
	}

	String getMarca() {
		return marca;
	}

	void setMarca(String marca) {
		this.marca = marca;
	}

	int getNumPezzi() {
		return numPezzi;
	}

	void setNumPezzi(int numPezzi) {
		this.numPezzi = numPezzi;
	}

	String getTipologia() {
		return tipologia;
	}

	void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	int getAnnoAcqu() {
		return annoAcqu;
	}

	void setAnnoAcqu(int annoAcqu) {
		this.annoAcqu = annoAcqu;
	}

}
