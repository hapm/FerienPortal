package fhbrs.ateam.ferienportal.data;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the booking database table.
 * 
 */
@Entity
@Table(name="booking")
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idbooking;
	private int persons;
	private Hotel hotel;
	private Travel travel;
	private User user;

    public Booking() {
    }


	@Id
	public int getIdbooking() {
		return this.idbooking;
	}

	public void setIdbooking(int idbooking) {
		this.idbooking = idbooking;
	}


	public int getPersons() {
		return this.persons;
	}

	public void setPersons(int persons) {
		this.persons = persons;
	}


	//bi-directional many-to-one association to Hotel
    @ManyToOne
	@JoinColumn(name="idhotel")
	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	

	//bi-directional many-to-one association to Travel
    @ManyToOne
	@JoinColumn(name="idtravel")
	public Travel getTravel() {
		return this.travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}
	

	//bi-directional many-to-one association to User
    @ManyToOne
	@JoinColumn(name="iduser")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}