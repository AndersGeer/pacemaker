package models;

import com.google.common.base.Objects;
import static com.google.common.base.MoreObjects.toStringHelper;
public class User 
{
	static long counter = 00;
	
	public long id;
	  public String firstName;
	  public String lastName;
	  public String email;
	  public String password;

	  public User()
	  {
	  }

	  public User(String firstName, String lastName, String email, String password)
	  {
		  this.id = ++counter;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.email = email;
	    this.password = password;
	  }
	  @Override
	public String toString() 
	  {
		  return toStringHelper(this).addValue(firstName)
				  .addValue(lastName)
				  .addValue(password)
				  .addValue(email)
				  .addValue(id)
				  .toString();
	  }
	  
	  @Override
	public int hashCode() {
		
		return Objects.hashCode(lastName,firstName,email,password);
	}

}
