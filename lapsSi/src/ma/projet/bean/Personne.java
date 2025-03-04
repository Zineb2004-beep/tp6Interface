package ma.projet.bean;

public class Personne {

	private static int count;

	protected int id;
	protected String nom;
	protected String prenom;
	protected String mail;
	protected String telephone;
	protected Double salaire;

	public Personne(String nom, String prenom, String mail, String telephone, Double salaire) {
		super();
		this.id = ++count;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.telephone = telephone;
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	public int getId() {
		return id;
	}
	
	

}
