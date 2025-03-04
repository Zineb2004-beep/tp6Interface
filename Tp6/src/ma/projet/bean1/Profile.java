package ma.projet.bean1;

public class Profile {

	private static int count;
	
	private int id;
	private String code;
	private String libelle;
	
	public Profile(String code, String libelle) {
		super();
		this.id = ++count;
		this.code = code;
		this.libelle = libelle;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return   libelle ;
	}
	
}
