package ma.projet.bean;

public class User extends Personne {

	private String login;
	private String password;
	private String service;
	private Profile profile;

	public User(String nom, String prenom, String mail, String telephone, Double salaire, String login, String password,
			Profile profile, String service) {
		super(nom, prenom, mail, telephone, salaire);
		this.login = login;
		this.password = password;
		this.profile = profile;
		this.service = service;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "User [Nom:" + nom + " " + ", Prenom:" + prenom + " " + ", service=" + service + " " + ", profile=" + profile.getLibelle() + "]";
	}

}
