package classes;

import java.lang.*;
import interfaces.*;

public class Hotel implements RoomOperations, EmployeeOperations, CustomerOperations
{
	private String name;
	private Room rooms[] = new Room [1000];
	private Customer customers[] = new Customer [500];
	private Employee employees[] = new Employee [100];
	
	public Hotel(){}
	public Hotel(String name)
	{
		this.name = name;
	}
	
	public void setName(String name){this.name = name;}
	
	public String getName(){return name;}

	public boolean insertRoom(Room r)
	{
		for(int i=0; i<rooms.length; i++)
		{
			if(rooms[i] == null)
			{
				rooms[i] = r;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeRoom(Room r)
	{
		for(int i=0; i<rooms.length; i++)
		{
			if(rooms[i] == r)
			{
				rooms[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Room searchRoom(String roomNumber)
	{
		for(int i=0; i<rooms.length; i++)
		{
			if(rooms[i] != null)
			{
				if(rooms[i].getRoomNumber().equals(roomNumber))
				{
					return rooms[i];
				}
			}
		}
		return null;
	}
	
	public void showAllRooms()
	{
		for(int i=0; i<rooms.length; i++)
		{
			if(rooms[i] != null)
			{
				rooms[i].showDetails();
			}
		}
	}
	
	
	public boolean insertCustomer(Customer c)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == null)
			{
				customers[i] = c;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeCustomer(Customer c)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == c)
			{
				customers[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Customer searchCustomer(int nid)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				if(customers[i].getNid() == nid)
				{
					return customers[i];
				}
			}
		}
		return null;
	}
	
	public void showAllCustomers()
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				customers[i].showDetails();
			}
		}
	}
	
	public boolean insertEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Employee searchEmployee(String empId)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					return employees[i];
				}
			}
		}
		return null;
	}
	
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				employees[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("Hotel Name: " + name);
		System.out.println("//////////////////////////////////");
		System.out.println("### List of Rooms ###");
		this.showAllRooms();
		System.out.println("//////////////////////////////////");
		System.out.println();
		System.out.println("### List of Employees ###");
		this.showAllEmployees();
		System.out.println("//////////////////////////////////");
		
	}	
}