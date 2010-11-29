package fhbrs.ateam.ferienportal.data;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rating database table.
 * 
 */
@Entity
@Table(name="rating")
public class Rating implements Serializable {
	private static final long serialVersionUID = 1L;
	private RatingPK id;
	private String comment;
	private int rating;
	private User user;
	private Hotel hotel;

    public Rating() {
    }


	@EmbeddedId
	public RatingPK getId() {
		return this.id;
	}

	public void setId(RatingPK id) {
		this.id = id;
	}
	

    @Lob()
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
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
	
}