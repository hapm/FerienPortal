package fhbrs.ateam.ferienportal;
import java.util.List;

import javax.ejb.Remote;
import fhbrs.ateam.ferienportal.data.User;


@Remote
public interface UserManagementRemote {
	public void addUser(User user);
	public void removeUser(User user);
	public List<User> listUsers();
}
