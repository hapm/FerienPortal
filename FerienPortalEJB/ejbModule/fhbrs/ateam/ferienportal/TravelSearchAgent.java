package fhbrs.ateam.ferienportal;

import java.util.Vector;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import fhbrs.ateam.ferienportal.data.Travel;

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
     
    public Vector<Travel> search(TravelRequest travel) {
    	if (em == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("ferienportal");
			em = (EntityManager) emf.createEntityManager();
		}
    	Vector<Travel> results = new Vector<Travel>();
    	return results;
    }

}
