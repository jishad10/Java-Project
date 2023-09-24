package classes;

import java.lang.*;

public class DoubleRoom extends Room
{
	private int capacity;
	
	public DoubleRoom(){}
	public DoubleRoom(String roomNumber, Customer customer, double roomPrice,int capacity)
	{
		super(roomNumber, customer, roomPrice);
		this.capacity = capacity;
	}
	
	public void setCapacity(int capacity) {this.capacity = capacity;}
	public int getCapacity(){return capacity;}
	
	public void showDetails()
	{
		System.out.println("**** Room Information ****");
		this.getCustomer().showDetails();
		System.out.println("Double Room, Room Number: " + this.getRoomNumber());
		System.out.println("Double Room, Room Price: " + this.getRoomPrice());
		System.out.println("Room Capacity:" + capacity);
		System.out.println();
	}
}