
package com.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entities.Users;

@Repository
public interface UserServices 
{

	 public boolean saveOrUpdate(Users users);
	 
	    public List<Users> list();
	 
	    public boolean delete(Users users);
}
