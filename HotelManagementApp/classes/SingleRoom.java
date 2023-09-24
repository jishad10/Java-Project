package classes;

import java.lang.*;

public class SingleRoom extends Room
{
	
	public SingleRoom(){}
	public SingleRoom(String roomNumber, Customer customer, double roomPrice)
	{
		super(roomNumber, customer, roomPrice);
	
	}
	
	
	public void showDetails()
	{
		System.out.println("**** Room Information ****");
		this.getCustomer().showDetails();
		System.out.println("Single Room, Room Number: " + this.getRoomNumber());
		System.out.println("Single Room, Room Price: " + this.getRoomPrice());
		System.out.println();
	}
}