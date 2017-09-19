package com.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entities.Users;
import com.services.UserServices;
import java.util.List;


@Service
public class UserServicesImpl implements UserServices
{
	
    UserDao userDao;
 
    public boolean saveOrUpdate(Users users) {
        return userDao.saveOrUpdate(users);
    }
 
    public List<Users> list() {
        // TODO Auto-generated method stub
        return userDao.list();
    }
 
    public boolean delete(Users users) {
        // TODO Auto-generated method stub
        return userDao.delete(users);
    }

}
