package ma.projet.bean1;

public class Personne {

	private static int count;

	protected int id;
	protected String nom;
	protected String prenom;
	protected String dateNess;
	protected Double salaire;
	protected Profile profile;

	public Personne(String nom, String prenom, String dateNess, Double salaire, Profile profile) {
		super();
		this.id = ++count;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNess = dateNess;
		this.salaire = salaire;
		this.profile = profile;
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

	public String getDateNess() {
		return dateNess;
	}

	public String setDateNess(String dateNess) {
		return this.dateNess = dateNess;
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

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public void Affiche(Personne p) {

		System.out.println("Je suis le " + p.getProfile() + " " + p.getNom().toUpperCase() + " "
				+ p.getPrenom().substring(0, 1).toUpperCase() + p.getPrenom().substring(1).toLowerCase() + " "
				+ "né le " + p.getDateNess() + " mon salaire est " + p.getSalaire());
	}

	public double CalculerSalaire(Personne p) {
		double salaire = p.getSalaire();
		if (p.getProfile().getLibelle().equalsIgnoreCase("directeur")) {
			salaire *= 1.2;
		} else {
			salaire *= 1.1;
		}
		p.setSalaire(salaire);
		return salaire;
	}

}
