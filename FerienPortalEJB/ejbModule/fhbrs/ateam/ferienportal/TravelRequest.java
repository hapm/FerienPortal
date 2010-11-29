package fhbrs.ateam.ferienportal;

import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Session Bean implementation class TravelRequest
 */
@Stateful
@TransactionManagement(TransactionManagementType.BEAN)
@LocalBean
public class TravelRequest {

    /**
     * Default constructor. 
     */
    public TravelRequest() {
    }
    
	private String destination;
	
	public double fromPrice;
	
	public double toPrice;

	public Date travelBegin;
	
	public Date travelEnd;

	public double getFromPrice() {
		return fromPrice;
	}

	public void setFromPrice(double fromPrice) {
		this.fromPrice = fromPrice;
	}

	public double getToPrice() {
		return toPrice;
	}

	public void setToPrice(double toPrice) {
		this.toPrice = toPrice;
	}

	public Date getTravelBegin() {
		return travelBegin;
	}

	public void setTravelBegin(Date travelBegin) {
		this.travelBegin = travelBegin;
	}

	public Date getTravelEnd() {
		return travelEnd;
	}

	public void setTravelEnd(Date travelEnd) {
		this.travelEnd = travelEnd;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}


}
