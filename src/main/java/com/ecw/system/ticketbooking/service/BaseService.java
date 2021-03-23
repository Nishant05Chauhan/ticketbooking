/**
 * 
 */
package com.ecw.system.ticketbooking.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.ecw.system.ticketbooking.modal.ScreenNo;
import com.ecw.system.ticketbooking.modal.Show;
import com.ecw.system.ticketbooking.modal.ShowBuilder;

/**
 * @author Nishant
 *
 */
public class BaseService {
	
	public static final BigDecimal TEN_POUNDS = BigDecimal.valueOf(10.0);
	public static final BigDecimal FIVE_POUNDS = BigDecimal.valueOf(5.0);
	public static final BigDecimal NINE_POUNDS = BigDecimal.valueOf(9.0);
	public static final BigDecimal SEVEN_POUNDS = BigDecimal.valueOf(7.0);
    
	public static final int QTY_10 = 10;

    static Show SUPER_MEN = ShowBuilder.aMovie().withId("10001").price(TEN_POUNDS).withQuantity(QTY_10).build();
    static Show THE_HOBBIT = ShowBuilder.aMovie().withId("10002").price(FIVE_POUNDS).withQuantity(QTY_10).build();
    static Show GAME_OF_THRONES = ShowBuilder.aMovie().withId("20001").price(NINE_POUNDS).withQuantity(QTY_10).build();
    static Show BREAKING_BAD = ShowBuilder.aMovie().withId("20110").price(SEVEN_POUNDS).withQuantity(QTY_10).build();
	
	protected static Map<ScreenNo, Show> movies = new HashMap<ScreenNo, Show>() {
        {
            put(SUPER_MEN.getScreenNo(), SUPER_MEN);
            put(THE_HOBBIT.getScreenNo(), THE_HOBBIT);
            put(GAME_OF_THRONES.getScreenNo(), GAME_OF_THRONES);
            put(BREAKING_BAD.getScreenNo(), BREAKING_BAD);
        }
    };
}
