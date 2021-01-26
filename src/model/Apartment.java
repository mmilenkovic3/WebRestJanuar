package model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Apartment {
	private UUID id;
	private ApartmentType type;
	private int roomNum;
	private int guestNum;
	private Location location;
	private List<Date> publishingDate;
	private List<Date> freeDate;
	private String hostUsername;
	private List<Comment> comments;
	private String images; //promeniti u listu slika
	private double cost;
	private Date chekInTime;
	private Date chekOutTime;
	private Status status;
	private List<Reservation> reservations;
	private List<Amenities> amenities;
	

}
