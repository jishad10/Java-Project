package classes;

import java.lang.*;

public abstract class Room
{	
	private String roomNumber;
	private Customer customer;
	private double roomPrice;
	
	public Room(){ }
	public Room(String roomNumber, Customer customer, double roomPrice)
	{
		this.roomNumber = roomNumber;
		this.customer = customer;
		this.roomPrice = roomPrice;
	}
	
	public void setRoomNumber(String roomNumber){ this.roomNumber = roomNumber; }
	public void setCustomer(Customer customer){	this.customer = customer;}
	public void setRoomPrice(double roomPrice) {this.roomPrice = roomPrice;}
	
	public String getRoomNumber(){	return roomNumber;}
	public Customer getCustomer(){	return customer;}
	public double getRoomPrice(){ return roomPrice;}
	
	public abstract void showDetails();
	
	
}