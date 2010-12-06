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
	private int idtravel;
	private Set<Booking> bookings;
	private User user;

    public Travel() {
    }


	@Id
	public int getIdtravel() {
		return this.idtravel;
	}

	public void setIdtravel(int idtravel) {
		this.idtravel = idtravel;
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