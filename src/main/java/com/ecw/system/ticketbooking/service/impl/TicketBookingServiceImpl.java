/**
 * 
 */
package com.ecw.system.ticketbooking.service.impl;

import static org.assertj.core.api.Assertions.filter;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.ecw.system.ticketbooking.modal.ScreenNo;
import com.ecw.system.ticketbooking.modal.Show;
import com.ecw.system.ticketbooking.modal.TicketDetail;
import com.ecw.system.ticketbooking.service.BaseService;
import com.ecw.system.ticketbooking.service.TicketBookingService;

/**
 * @author Nishant
 *
 */
public class TicketBookingServiceImpl extends BaseService implements TicketBookingService {

	@Override
	public boolean bookTicket(TicketDetail ticketDetail) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public List<String> movies(){
		HashSet<String> movieList = new HashSet<>(); 
		movies.forEach((k, v) -> movieList.add(v.));
		return movies;
	}

}
