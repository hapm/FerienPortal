package fhbrs.ateam.ferienportal;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import fhbrs.ateam.ferienportal.data.Hotel;

/**
 * Session Bean implementation class HotelManagement
 */
@Stateless
@LocalBean
@NamedQuery( name = "findAllHotels" , query = "Select * from hotel AS h" )	
public class HotelManagement implements HotelManagementRemote, HotelManagementLocal {
	@PersistenceContext(unitName="ferienportal")
	public EntityManager em; 
	
	public List<Hotel> getHotelList() {
		TypedQuery<Hotel> query = em.createNamedQuery("findAllHotels", Hotel.class);
		return query.getResultList();
	}

}
