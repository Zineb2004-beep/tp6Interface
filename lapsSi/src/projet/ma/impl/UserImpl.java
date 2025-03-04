package projet.ma.impl;

import java.util.ArrayList;
import java.util.List;


import ma.projet.dao.IDao;
import ma.projet.bean.User;


public class UserImpl implements IDao<User>{
	
	private List<User> users;
	
	public UserImpl() {
		users = new ArrayList<User>();
	}

	@Override
	public boolean create(User u) {
		
		return users.add(u);
	}

	@Override
	public boolean delete(User u) {
		
		return users.remove(u);
	}

	@Override
	public boolean update(User o) {
		
		return false;
	}

	@Override
	public User findById(int id) {
		for (User u : users) {
			if ( u.getId() == id)
				return u;
		}
		return null;
	}

	@Override
	public List<User> findAll() {
		
		return users;
	}
	
	

}
