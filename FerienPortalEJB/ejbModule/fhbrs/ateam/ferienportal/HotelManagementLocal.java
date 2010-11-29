package fhbrs.ateam.ferienportal;
import java.util.List;

import javax.ejb.Local;

import fhbrs.ateam.ferienportal.data.Hotel;

@Local
public interface HotelManagementLocal {
	public List<Hotel> getHotelList();
}
