package ma.test;


import ma.projet.bean.Profile;
import ma.projet.bean.User;
import projet.ma.impl.ProfileImpl;
import projet.ma.impl.UserImpl;


public class Test {
	public static void main(String[] args) {
		
		ProfileImpl prfls = new ProfileImpl();
		prfls.create(new Profile("CP", "Chef de projet"));
		prfls.create(new Profile("MN", "Manager"));
		prfls.create(new Profile("DP", "Directeur de projet"));
		prfls.create(new Profile("DRH", "Directeur des ressources humaines"));
		prfls.create(new Profile("DG", "Directeur général"));
		
		UserImpl users = new UserImpl();
		users.create(new User("SALAMI", "Nadia", "Salami@gmail", "0608040901", 35000.00, "salami","salami123", prfls.findById(2),"Ressources Humaines"));
		users.create(new User("ALAMI", "Ali", "alami@gmail", "0608048901", 30000.00, "alami","alami123", prfls.findById(2),"Ressources Humaines"));	
		users.create(new User("BENANI", "Safa", "benanii@gmail", "0654804091", 23000.00, "benanii","benanii123", prfls.findById(1),"Informatique"));	
		
		for(User u : users.findAll()) {
			if (u.getProfile()==prfls.findById(2)) {
				System.out.println(u);
			}
		}


	}

}
