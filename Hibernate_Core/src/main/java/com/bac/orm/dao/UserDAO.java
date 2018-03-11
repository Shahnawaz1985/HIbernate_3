package com.bac.orm.dao;

import java.util.List;

import com.bac.model.SimpleUser;

public interface UserDAO {
	
	List<SimpleUser> retrieveAllUsers();
	
	List<SimpleUser> retrieveAdminUsers();

	void saveUser(SimpleUser user);
	
	SimpleUser getUserById(String id);
	
	SimpleUser mergeObjects(String id, SimpleUser user);
	
	List<SimpleUser> findUserByFirstname(SimpleUser user);

}
