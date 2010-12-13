package fhbrs.ateam.ferienportal;

import java.util.Vector;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import fhbrs.ateam.ferienportal.data.Booking;

/**
 * Session Bean implementation class TravelSearchAgent
 */
@Stateless
@LocalBean
public class TravelSearchAgent implements TravelSearchAgentRemote, TravelSearchAgentLocal {
	@PersistenceContext(unitName="ferienportal")
	public EntityManager em;
	public TravelSearchAgent() {
    }
     
    public Vector<Booking> search(Booking booking) {
    	if (em == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("ferienportal");
			em = (EntityManager) emf.createEntityManager();
		}
    	Vector<Booking> results = new Vector<Booking>();
    	return results;
    }

}
