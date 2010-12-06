package fhbrs.ateam.ferienportal.data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int iduser;
	private String username;
	private Set<Booking> bookings;
	private Set<Rating> ratings;
	private Set<Travel> travels;

    public User() {
    }


	@Id
	public int getIduser() {
		return this.iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="user")
	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}
	

	//bi-directional many-to-one association to Rating
	@OneToMany(mappedBy="user")
	public Set<Rating> getRatings() {
		return this.ratings;
	}

	public void setRatings(Set<Rating> ratings) {
		this.ratings = ratings;
	}
	

	//bi-directional many-to-one association to Travel
	@OneToMany(mappedBy="user")
	public Set<Travel> getTravels() {
		return this.travels;
	}

	public void setTravels(Set<Travel> travels) {
		this.travels = travels;
	}
	
}