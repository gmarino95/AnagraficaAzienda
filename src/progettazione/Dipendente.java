package progettazione;

public class Dipendente {

	private static int globalId;
	int id;
	String nome;
	String cognome;
	char sesso;
	String dataNascita;
	String codFisc;
	String email;
	String telefono;
	String ufficio;
	String mansione;
	
	//Costruttore
	Dipendente(String nome, String cognome, char sesso, String dataNascita, String codFisc, String email,
			String telefono, String ufficio, String mansione) {
		
		this.id = globalId++;
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.dataNascita = dataNascita;
		this.codFisc = codFisc;
		this.email = email;
		this.telefono = telefono;
		this.ufficio = ufficio;
		this.mansione = mansione;
	}

	//Metodi get e set
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

	String getCognome() {
		return cognome;
	}

	void setCognome(String cognome) {
		this.cognome = cognome;
	}

	char getSesso() {
		return sesso;
	}

	void setSesso(char sesso) {
		this.sesso = sesso;
	}

	String getDataNascita() {
		return dataNascita;
	}

	void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	String getCodFisc() {
		return codFisc;
	}

	void setCodFisc(String codFisc) {
		this.codFisc = codFisc;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	String getTelefono() {
		return telefono;
	}

	void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	String getUfficio() {
		return ufficio;
	}

	void setUfficio(String ufficio) {
		this.ufficio = ufficio;
	}

	String getMansione() {
		return mansione;
	}

	void setMansione(String mansione) {
		this.mansione = mansione;
	}
	
}
