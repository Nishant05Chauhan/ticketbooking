/**
 * 
 */
package com.ecw.system.ticketbooking.modal;

import java.math.BigDecimal;

/**
 * @author Nishant
 *
 */
public class Show {
	
	private final ScreenNo screenNo;
	private ShowType showType;
	private final BigDecimal pricePerPerson;
	private final int persons;
	private final String movieName;
	/**
	 * @return the showId
	 */
	public ScreenNo getScreenNo() {
		return screenNo;
	}
	/**
	 * @return the showType
	 */
	public ShowType getShowType() {
		return showType;
	}
	/**
	 * @return the pricePerPerson
	 */
	public BigDecimal getPricePerPerson() {
		return pricePerPerson;
	}
	/**
	 * @return the persons
	 */
	public int getPersons() {
		return persons;
	}
	
	
	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * @param screenNo
	 * @param showType
	 * @param pricePerPerson
	 * @param persons
	 * @param movieName
	 */
	public Show(ScreenNo screenNo, ShowType showType, BigDecimal pricePerPerson, int persons, String movieName) {
		super();
		this.screenNo = screenNo;
		this.showType = showType;
		this.pricePerPerson = pricePerPerson;
		this.persons = persons;
		this.movieName = movieName;
	}
	
	
}
