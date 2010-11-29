package fhbrs.ateam.ferienportal.data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the travel database table.
 * 
 */
@Entity
@Table(name="travel")
public class Travel implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private Set<Booking> bookings;
	private User user;

    public Travel() {
    }


	@Id
	@Column(name="idtravel")
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="travel")
	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
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