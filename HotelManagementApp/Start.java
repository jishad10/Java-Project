import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.FileReadWriteDemo;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();

		
		Hotel hotel = new Hotel("Sunset Lodge");
		
		System.out.println("------------------------------------");
		System.out.println("Welcome to Sunset Lodge Hotel");
		System.out.println("------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?\n");
		
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Customer Management");
			System.out.println("\t3. Room Management");
			System.out.println("\t4. Show Hotel Information");
			System.out.println("\t5. Exit");
			
			System.out.println("\n---------------------------");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			System.out.println("---------------------------\n");
			
			switch(choice)
			{
				case 1:
					
					System.out.println("#####################################");
					System.out.println("You have selected Employee Management");
					System.out.println("#####################################");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Employee");
					System.out.println("\t3. Search Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option1)
					{
						case 1:
							
							System.out.println("#################################");
							System.out.println("You have selected Insert Employee");
							System.out.println("#################################");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Imployee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
								
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
								
							if(hotel.insertEmployee(e1))
							{
								System.out.println("*** Employee Inserted, ID: " + e1.getEmpId() + "  ***");
							}
							else
							{
								System.out.println("*** Employee NOT Inserted, NID: " + e1.getEmpId() + "  ***");
							}
							
							break;
							
						case 2:
							
							System.out.println("#################################");
							System.out.println("You have selected Remove Employee");
							System.out.println("#################################");
							
							System.out.print("Enter Employee ID to remove a Employee: ");
							String empId2 = sc.next();
							
							Employee e2 = hotel.searchEmployee(empId2);
							
							if(e2 != null)
							{
								System.out.println("*** Employee Found  ****");
								
								if(hotel.removeEmployee(e2))
								{
									System.out.println("*** Employee Removed, ID: " + e2.getEmpId() + " ***");
								}
							}
							else
							{
								System.out.println("*** Employee NOT Found and NOT Removed  ****");
							}
							
							break;
							
						case 3:
							
							System.out.println("#################################");
							System.out.println("You have selected Search Employee");
							System.out.println("#################################");
							
							System.out.print("Enter the ID to search a Employee: ");
							String empId3 = sc.next();
							
							Employee e3 = hotel.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("*** Employee Found  ****");
								e3.showDetails();
							}
							else
							{
								System.out.println("*** Employee NOT Found  ****");
							}
							
							break;
							
						case 4:
							
							System.out.println("#################################");
							System.out.println("You have selected Show All Employees");
							System.out.println("#################################");
							
							hotel.showAllEmployees();
							
							break;
							
						case 5:
							
							System.out.println("#####################################");
							System.out.println("Going Back....");
							System.out.println("#####################################");
							
							break;
							
						default:
							
							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back....");
							System.out.println("#####################################");
							
							break;
					}
					
					break;
					
				case 2:
					
					System.out.println("#####################################");
					System.out.println("You have selected Customer Management");
					System.out.println("#####################################");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Customer");
					System.out.println("\t2. Remove Customer");
					System.out.println("\t3. Search Customer");
					System.out.println("\t4. Show All Customer");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option2)
					{
						case 1:
							
							System.out.println("#################################");
							System.out.println("You have selected Insert Customer");
							System.out.println("#################################");
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Customer Name: ");
							String name1 = sc.next();
							System.out.print("Enter Customer Phone Number: ");
							String phnNumber1 = sc.next();
								
							Customer c1 = new Customer();
							c1.setNid(nid1);
							c1.setName(name1);
							c1.setPhnNumber(phnNumber1);
								
							if(hotel.insertCustomer(c1))
							{
								System.out.println("*** Customer Inserted, NID: " + c1.getNid() + "  ***");
							}
							else
							{
								System.out.println("*** Customer NOT Inserted, NID: " + c1.getNid() + "  ***");
							}								
							
							break;
							
						case 2:
							
							System.out.println("#################################");
							System.out.println("You have selected Remove Customer");
							System.out.println("#################################");
							
							System.out.print("Enter the NID to remove a customer: ");
							int nid2 = sc.nextInt();
							
							Customer c2 = hotel.searchCustomer(nid2);
							
							if(c2 != null)
							{
								System.out.println("*** Customer Found  ****");
								
								if(hotel.removeCustomer(c2))
								{
									System.out.println("*** Customer Removed, NID: " + c2.getNid() + " ***");
								}
							}
							else
							{
								System.out.println("*** Customer NOT Found and NOT Removed  ****");
							}
							
							break;
							
						case 3:
							
							System.out.println("#################################");
							System.out.println("You have selected Search Customer");
							System.out.println("#################################");
							
							System.out.print("Enter the NID to search a customer: ");
							int nid3 = sc.nextInt();
							
							Customer c3 = hotel.searchCustomer(nid3);
							
							if(c3 != null)
							{
								System.out.println("*** Customer Found  ****");
								c3.showDetails();
							}
							else
							{
								System.out.println("*** Customer NOT Found  ****");
							}
							
							break;
							
						case 4:
							
							System.out.println("#################################");
							System.out.println("You have selected Show All Customers");
							System.out.println("#################################");
							
							hotel.showAllCustomers();
							
							break;
							
						case 5:
							
							System.out.println("#####################################");
							System.out.println("Going Back....");
							System.out.println("#####################################");
							
							break;
							
						default:
							
							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back....");
							System.out.println("#####################################");
							
							break;
					}
					
					break;
					
				case 3:
					
					System.out.println("#####################################");
					System.out.println("You have selected Room Management");
					System.out.println("#####################################");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Select Room");
					System.out.println("\t2. Remove Room");
					System.out.println("\t3. Search Room");
					System.out.println("\t4. Show All Room");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option3)
					{
						case 1:
							
							System.out.println("#################################");
							System.out.println("You have selected Room Type");
							System.out.println("#################################");
							
							System.out.print("Enter NID to verify the customer: ");
							int nid1 = sc.nextInt();
							
							Customer c1 = hotel.searchCustomer(nid1);
							
							if(c1 != null)
							{
								System.out.println("*** Customer Verified  ***");
								
								Room r = null;
								
								System.out.println("There are two Types of Rooms...");
								System.out.println("Which one do you want?");
								System.out.println("\t1. Single Room");
								System.out.println("\t2. Double Room");
								System.out.println("\t3. Go back");
								
								System.out.println("\n---------------------------");
								System.out.print("Enter your type: ");
								int type = sc.nextInt();
								System.out.println("---------------------------\n");
								
								
								if(type == 1)
								{
									System.out.print("Enter Room Number: ");
									String rn = sc.next();
									System.out.print("Enter Room Price: ");
									double rp = sc.nextDouble();

									SingleRoom sr = new SingleRoom(rn, c1, rp);
									r = sr;
								}
								else if(type == 2)
								{
									System.out.print("Enter Room Number: ");
									String rn = sc.next();
									System.out.print("Enter Room Price: ");
									double rp = sc.nextDouble();
									System.out.print("Enter Room Capacity: ");
									int c = sc.nextInt();
									

									DoubleRoom dr = new DoubleRoom(rn, c1, rp, c);
									r = dr;
								}
								else if(type == 3)
								{
									System.out.println("#####################################");
									System.out.println("Going Back....");
									System.out.println("#####################################");
								}
								else
								{
									System.out.println("#####################################");
									System.out.println("Invalid Type... Going Back....");
									System.out.println("#####################################");
								}
								
								if(r != null)
								{
									if(hotel.insertRoom(r))
									{
										System.out.println("***  Room Selected, Room Number:" + r.getRoomNumber());
										frwd.writeInFile( "Room Number:" + r.getRoomNumber());
										frwd.writeInFile( "Room Price:" + r.getRoomPrice());
									}
									else
									{
										System.out.println("***  Room NOT Inserted, Room Number: " + r.getRoomNumber());
									}
								}
							}
							else
							{
								System.out.println("*** Invalid Customer, Can NOT Give Room  ****");
							}
							
							
							break;
							
						case 2:
							
							System.out.println("#################################");
							System.out.println("You have selected Remove Room");
							System.out.println("#################################");
							
							System.out.print("Enter Room Number to remove Room: ");
							String roomNumber1= sc.next();
							
							Room r2 = hotel.searchRoom(roomNumber1);
							
							if(r2 != null)
							{
								System.out.println("*** Room Found  ****");
								
								if(hotel.removeRoom(r2))
								{
									System.out.println("*** Room Removed, Room Number: " + r2.getRoomNumber() + " ***");
								}
							}
							else
							{
								System.out.println("*** Room NOT Found and NOT Removed  ****");
							}
							
							break;
							
						case 3:
							
							System.out.println("#################################");
							System.out.println("You have selected Search Room");
							System.out.println("#################################");
							
							System.out.print("Enter Room Number to Search Room: ");
							String roomNumber = sc.next();
							
							Room r3 = hotel.searchRoom(roomNumber);
							
							if(r3 != null)
							{
								System.out.println("*** Room Found  ****");
								r3.showDetails();
							}
							else
							{
								System.out.println("*** Room NOT Found  ****");
							}
							
							break;
							
						case 4:
							
							System.out.println("#################################");
							System.out.println("You have selected Show All Rooms");
							System.out.println("#################################");
							
							hotel.showAllRooms();
							frwd.readFromFile();
							
							break;
							
						case 5:
							
							System.out.println("#####################################");
							System.out.println("Going Back....");
							System.out.println("#####################################");
							
							break;
							
						default:
							
							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back....");
							System.out.println("#####################################");
							
							break;
					}
					
					break;

					
				case 4:
					
					System.out.println("##################################");
					System.out.println("You have selected Hotel Information");
					System.out.println("##################################");
					
					hotel.showDetails();
					
					break;
					
				case 5:
					
					System.out.println("#####################################");
					System.out.println("Thank You For Using Our System");
					System.out.println("#####################################");
					
					repeat = false;
					
					break;
					
				default:
					
					System.out.println("#####################################");
					System.out.println("Invalid Choice... Try Again....");
					System.out.println("#####################################");
					
					break;
			}
		}
	}
}