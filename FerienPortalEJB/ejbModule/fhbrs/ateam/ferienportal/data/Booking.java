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
	private int id;
	private int persons;
	private User user;
	private Hotel hotel;
	private Travel travel;

    public Booking() {
    }


	@Id
	@Column(name="idbooking")
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getPersons() {
		return this.persons;
	}

	public void setPersons(int persons) {
		this.persons = persons;
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
	
}