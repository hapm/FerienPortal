package fhbrs.ateam.ferienportal.data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the hotel database table.
 * 
 */
@Entity
@Table(name="hotel")
@NamedQuery (name = "findAllHotels", query = "SELECT h FROM Hotel AS h")
public class Hotel implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idhotel;
	private String city;
	private String name;
	private BigDecimal price;
	private Set<Booking> bookings;
	private Set<Rating> ratings;

    public Hotel() {
    }


	@Id
	public int getIdhotel() {
		return this.idhotel;
	}

	public void setIdhotel(int idhotel) {
		this.idhotel = idhotel;
	}


	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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