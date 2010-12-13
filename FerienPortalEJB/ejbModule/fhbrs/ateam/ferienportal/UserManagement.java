package fhbrs.ateam.ferienportal;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import fhbrs.ateam.ferienportal.data.Hotel;
import fhbrs.ateam.ferienportal.data.User;

/**
 * Session Bean implementation class UserManagement
 */
@Stateless
public class UserManagement implements UserManagementRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext(unitName="ferienportal")
	public EntityManager em;
    public UserManagement() {
        // TODO Auto-generated constructor stub
    }

	public void addUser(User user) {
		em.persist(user);
	}

	public void removeUser(User user) {
		em.remove(user);
	}

	public List<User> listUsers() {
		TypedQuery<User> query = em.createNamedQuery("findAllUsers", User.class);
		return query.getResultList();
	}

}
