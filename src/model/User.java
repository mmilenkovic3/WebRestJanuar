package model;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Role role;	
	private String username;
	private String password;
	private String name;
	private String lastname;
	private Gender gender;
	
	private List<Apartment> listApartments;
	private List<Reservation> listReservations;
	private List<Apartment> apartmentForRent;
	
	public User(){}
	
	public User(Role role,String username, String password, String name, String lastname, Gender gender,
			List<Apartment> listApartments, List<Reservation> listReservations, List<Apartment> apartmentForRent) {
		
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.role = role;
		this.listApartments = listApartments;
		this.listReservations = listReservations;
		this.apartmentForRent = apartmentForRent;
	}
	
	public User(String username, String password, String name, String lastname, Gender gender) {
		this.role = Role.GUEST;
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.listApartments = new ArrayList<Apartment>();
		this.listReservations =  new ArrayList<Reservation>();
		this.apartmentForRent = new ArrayList<Apartment>();
	}	
/*
	public User(String username, String password, String name, String lastname, Gender gender,
			List<Apartment> listApartments, List<Apartment> apartmentForRent) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.role = Role.HOST;
		this.listApartments = listApartments;
		this.apartmentForRent = apartmentForRent;
	}

	public User(String username, String password, String name, String lastname, Gender gender,
			List<Reservation> listReservations) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.role = Role.GUEST;
		this.listReservations = new ArrayList<Reservation>();
	}

	*/

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Apartment> getListApartments() {
		return listApartments;
	}

	public void setListApartments(List<Apartment> listApartments) {
		this.listApartments = listApartments;
	}

	public List<Reservation> getListReservations() {
		return listReservations;
	}

	public void setListReservations(List<Reservation> listReservations) {
		this.listReservations = listReservations;
	}

	public List<Apartment> getApartmentForRent() {
		return apartmentForRent;
	}

	public void setApartmentForRent(List<Apartment> apartmentForRent) {
		this.apartmentForRent = apartmentForRent;
	}
	
	
	
	
	

	

}
