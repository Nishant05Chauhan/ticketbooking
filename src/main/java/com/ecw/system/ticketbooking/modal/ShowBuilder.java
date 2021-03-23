/**
 * 
 */
package com.ecw.system.ticketbooking.modal;

import java.math.BigDecimal;

/**
 * @author Nishant
 *
 */
public class ShowBuilder {

	private ShowType showType = ShowType.MOVIE;
	private ScreenNo screenNo = new ScreenNo("1234");
	private BigDecimal price = BigDecimal.TEN;
	private int quantity = 0;
	private String movieName;
	
	private ShowBuilder(ShowType showType) {
		this.showType = showType;
	}

	public static ShowBuilder aMovie() {
        return new ShowBuilder(ShowType.MOVIE);
    }

    public ShowBuilder withId(String value) {
        this.screenNo = new ScreenNo(value);
        return this;
    }

    public ShowBuilder price(BigDecimal price) {
        this.price = price;
	    return this;
    }

	public ShowBuilder withQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}
	
	public static ShowBuilder aMovie() {
        return new ShowBuilder(ShowType.MOVIE);
    }

	public Show build() {
		return new Show(screenNo, showType, price, quantity, movieName);
	}
}
