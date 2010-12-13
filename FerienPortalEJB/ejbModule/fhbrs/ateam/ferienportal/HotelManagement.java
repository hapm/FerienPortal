package fhbrs.ateam.ferienportal;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import fhbrs.ateam.ferienportal.data.Hotel;

/**
 * Session Bean implementation class HotelManagement
 */
@Stateless
public class HotelManagement implements HotelManagementRemote, HotelManagementLocal {
	@PersistenceContext(unitName="ferienportal")
	public EntityManager em; 
	public void save(Hotel h){
		em.persist(h);
	}
	public void remove(Hotel h){
		em.remove(h);
	}
	public List<Hotel> getHotelList() {
		if (em == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("ferienportal");
			em = (EntityManager) emf.createEntityManager();
		}
		
		TypedQuery<Hotel> query = em.createNamedQuery("findAllHotels", Hotel.class);
		return query.getResultList();
	}

}
