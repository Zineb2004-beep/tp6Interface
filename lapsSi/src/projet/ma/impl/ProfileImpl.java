package projet.ma.impl;

import java.util.ArrayList;
import java.util.List;

import ma.projet.dao.IDao;
import ma.projet.bean.Profile;

public class ProfileImpl implements IDao<Profile> {

	private List<Profile> prfls;

	public ProfileImpl() {
		prfls = new ArrayList<Profile>();
	}

	@Override
	public boolean create(Profile p) {
		return prfls.add(p);
	}

	@Override
	public boolean delete(Profile p) {
		return prfls.remove(p);
	}

	@Override
	public boolean update(Profile p) {
		return false;
	}

	@Override
	public Profile findById(int id) {
		for (Profile p : prfls) {
			if (p.getId() == id)
				return p;
		}
		return null;
	}

	@Override
	public List<Profile> findAll() {
		return prfls;
	}

}
