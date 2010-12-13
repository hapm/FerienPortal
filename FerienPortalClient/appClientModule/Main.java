import java.math.BigDecimal;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import fhbrs.ateam.ferienportal.data.*;

import fhbrs.ateam.ferienportal.*;

public class Main {
	private static HotelManagementRemote hmr;
	//private static 
	public static void main(String[] args) {
		try {
			hmr = (HotelManagementRemote) new InitialContext(Util.getInitProperties()).lookup("java:global/FerienPortal/FerienPortalEJB!fhbrs.ateam.ferienportal.HotelManagementRemote");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Hotel h = new Hotel();
		h.setCity("Dortmund");
		h.setPrice(new BigDecimal(32432432));
		h.setName("Ritz");
		hmr.save(h);
		List<Hotel> l = hmr.getHotelList();
		System.out.println(l.get(0));
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}