package fhbrs.ateam.ferienportal.data;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the rating database table.
 * 
 */
@Embeddable
public class RatingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private int iduser;
	private int idhotel;

    public RatingPK() {
    }

	public int getIduser() {
		return this.iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public int getIdhotel() {
		return this.idhotel;
	}
	public void setIdhotel(int idhotel) {
		this.idhotel = idhotel;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RatingPK)) {
			return false;
		}
		RatingPK castOther = (RatingPK)other;
		return 
			(this.iduser == castOther.iduser)
			&& (this.idhotel == castOther.idhotel);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iduser;
		hash = hash * prime + this.idhotel;
		
		return hash;
    }
}