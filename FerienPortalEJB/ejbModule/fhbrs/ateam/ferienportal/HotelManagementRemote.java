package fhbrs.ateam.ferienportal;
import java.util.List;

import javax.ejb.Remote;

import fhbrs.ateam.ferienportal.data.Hotel;

@Remote
public interface HotelManagementRemote {
	public List<Hotel> getHotelList();
}
