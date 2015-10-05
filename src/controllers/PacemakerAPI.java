package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.User;

public class PacemakerAPI
{
	private Map<Long,User> userIdIndex = new HashMap<>();
  private Map<String,User> userMailIndex = new HashMap<>();

  public Collection<User> getUsers ()
  {
    return userIdIndex.values();
  }

  public  void deleteUsers() 
  {
    userIdIndex.clear();
    userMailIndex.clear();
  }

  public User createUser(String firstName, String lastName, String email, String password) 
  {
    User user = new User (firstName, lastName, email, password);
    userMailIndex.put(email,user);
    userIdIndex.put(user.id, user);
    return user;
  }

  public User getUser(String email) 
  {
   return userMailIndex.get(email);
  }
  
  public User getUser(Long id) 
  {
   return userIdIndex.get(id);
  }
  

  public void deleteUser(Long id) 
  {
    User user = userIdIndex.remove(id);
    userMailIndex.remove(user.email);
  }
}
