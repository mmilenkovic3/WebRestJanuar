package model;

import java.util.Date;
import java.util.UUID;

public class Reservation {
	private UUID idReservedApartment;
	private Date startReservation;
	private int numDay;
	private double fullPrice;
	private String reservationMessage;
	private String username;
	private ApartmentStatus status;

}
