package fhbrs.ateam.ferienportal;

import java.util.Vector;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import fhbrs.ateam.ferienportal.data.Travel;

/**
 * Session Bean implementation class TravelSearchAgent
 */
@Stateless
@LocalBean
public class TravelSearchAgent implements TravelSearchAgentRemote, TravelSearchAgentLocal {
    public TravelSearchAgent() {
    }
    
    public Vector<Travel> search(TravelRequest travel) {
    	Vector<Travel> results = new Vector<Travel>();
    	return results;
    }

}
