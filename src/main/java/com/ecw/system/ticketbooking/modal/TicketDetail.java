/**
 * 
 */
package com.ecw.system.ticketbooking.modal;

/**
 * @author Nishant
 *
 */
public class TicketDetail {

	private String movieName;
	private String timing;
	private int persons;
	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	/**
	 * @return the timing
	 */
	public String getTiming() {
		return timing;
	}
	/**
	 * @param timing the timing to set
	 */
	public void setTiming(String timing) {
		this.timing = timing;
	}
	/**
	 * @return the persons
	 */
	public int getPersons() {
		return persons;
	}
	/**
	 * @param persons the persons to set
	 */
	public void setPersons(int persons) {
		this.persons = persons;
	}
	/**
	 * @param ticketDetailID
	 * @param movieName
	 * @param timing
	 * @param persons
	 */
	public TicketDetail(String movieName, String timing, int persons) {
		super();
		this.movieName = movieName;
		this.timing = timing;
		this.persons = persons;
	}
	
	
}
