package fhbrs.ateam.ferienportal.data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the hotel database table.
 * 
 */
@Entity
@Table(name="hotel")
public class Hotel implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Set<Booking> bookings;
	private Set<Rating> ratings;

    public Hotel() {
    }


	@Id
	@Column(name="idhotel")
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="hotel")
	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}
	

	//bi-directional many-to-one association to Rating
	@OneToMany(mappedBy="hotel")
	public Set<Rating> getRatings() {
		return this.ratings;
	}

	public void setRatings(Set<Rating> ratings) {
		this.ratings = ratings;
	}
	
}