package com.assignment;

/*
 * Class Name:    SpaceCity
 *
 * Author:        Your Name
 * Creation Date: Tuesday, September 05 2017, 16:28 
 * Last Modified: Sunday, September 24 2017, 00:47
 * 
 * Class Description:
 *
 * This is the driver file for Assignment C, Semester 2, 2017
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SpaceCity
{
    private SpaceVehicle sv1;
    private SpaceVehicle sv2;

    private final int ADD_SPACE_VEHICLE = 1;
    private final int ADD_CREW = 2;
    private final int ADD_JOB = 3;
    private final int END_JOB = 4;
    private final int LOAD_FROM_FILE = 5;
    private final int DISPLAY = 6;
    private final int EXIT = 7;

    private Scanner kb;

    public static void main( String [ ] args ) throws IOException
    {
       SpaceCity s = new SpaceCity( );
       s.run( );
    }

    public SpaceCity( )
    {
       kb = new Scanner( System.in );

    }

    public void run( ) throws IOException
    {
         int choice = -1;

         while( choice != EXIT )
         {
              displayMenu( );
              System.out.print("Enter choice >> ");
              choice = kb.nextInt( );
              kb.nextLine( );
              process( choice );
         }
    }

    public void displayMenu( )
    {
       System.out.println( "Space City Menu" );
       System.out.println( "\t" + ADD_SPACE_VEHICLE + ". Add Space Vehicle" );
       System.out.println( "\t" + ADD_CREW + ". Add Crew" );
       System.out.println( "\t" + ADD_JOB + ". Add Job" );
       System.out.println( "\t" + END_JOB + ". End Job" );
       System.out.println( "\t" + LOAD_FROM_FILE + ". Load from file" );
       System.out.println( "\t" + DISPLAY + ". Display" );
       System.out.println( "\t" + EXIT + ". Exit" );
    }

    public void process( int choice ) throws IOException
    {
         switch( choice )
         {
              case ADD_SPACE_VEHICLE :
                   addVehicle( );
                 break;

              case ADD_CREW :
                   addCrew( );
                 break;

              case ADD_JOB :
                   addJob( );
                 break;

              case END_JOB :
                   endJob( );
                 break;

              case LOAD_FROM_FILE :
                   load( );
                 break;

              case DISPLAY :
                   display( );
                 break;

              case EXIT :
                   // Just trap this choice so that it does not show
                   // as an error
                 break;

              default :
                   System.out.println( "Invalid choice" );
                 break;
         }
    }

    public void addVehicle( )
    {
		if(sv1 != null && sv2 != null)
		{
			System.out.println("Space vehicles 1 and 2 both are occupied");
		}
		else
		{
			Scanner k1 = new Scanner(System.in);
			System.out.print("Enter Space Vehicle ID: ");
			String vId = k1.nextLine();
			
			if(sv1 == null && sv2 == null)
			{
				sv1 = new SpaceVehicle(vId);
			}
			else if(sv1 != null && sv2 == null)
			{
				if(!vId.equals(sv1.getSpaceVehicleId()))
				{
					sv2 = new SpaceVehicle(vId);
				}
				else
				{
					System.out.println("The space vehicle which is entered is already in use");
				}
			}
		}

    }

    public void addCrew( )
    {
		if(sv1 == null && sv2 == null)
		{
			System.out.println("No space vehicle exists to add the crew");
		}
		else
		{
			Scanner k1 = new Scanner(System.in);
			System.out.print("Enter Space Vehicle ID: ");
			String vId = k1.nextLine();
			
			if (sv1 != null && vId.equals(sv1.getSpaceVehicleId()))
			{
				if(sv1.canAddCrew())
				{
					System.out.print("Please enter the crew ID: ");
					String crewId = k1.nextLine();
					
					if(sv2 != null)
					{
						boolean b = sv2.canAddCrew();
						if(b == true)
						{
							System.out.println("Enter the crew name: ");
							String crewName = k1.nextLine();
							sv1.addCrew(crewName, crewId);
						}
						else
						{
							if(crewId.equals(sv2.getCrewId()))
							{
								System.out.println("The crew ID which you have entered is already in use");
							}
						}
					}
					else
					{
						System.out.print("Enter the crew name: ");
						String crewName = k1.nextLine();
						sv1.addCrew(crewName, crewId);
					}
				}
				else
				{
					System.out.println("There already exists a crew.");
				}
			}
			else if (sv2 != null && vId.equals(sv2.getSpaceVehicleId()))
			{
				if(sv2.canAddCrew())
				{
					System.out.print("Please enter the crew ID: ");
					String crewId = k1.nextLine();
					
					if(sv1 != null)
					{
						if(sv1.canAddCrew())
						{
							System.out.println("Enter the crew name: ");
							String crewName = k1.nextLine();
							sv2.addCrew(crewName, crewId);
						}
						
						else if(crewId.equals(sv1.getCrewId()))
						{
							System.out.println("The crew ID which you have entered is already in use");
						}
					}
					else
					{
						System.out.println("Enter the crew name: ");
						String crewName = k1.nextLine();
						sv1.addCrew(crewName, crewId);
					}
				}
				else
				{
					System.out.println("There already exists a crew.");
				}
			}
			else 
			{
				System.out.println("The space vehicle ID which you have entered does not exist");
			}
		}
		
			
    }

    public void addJob( )
    {
		if(sv1 == null && sv2 == null)
		{
			System.out.println("No job can be added as there is no space vehicle");
		}
		else
		{
			Scanner k1 = new Scanner(System.in);
			System.out.println("\nEnter the space vehicle ID: ");
			String vId = k1.nextLine();
			
			if(sv1 != null && vId.equals(sv1.getSpaceVehicleId()))
			{
				if(!sv1.canAddCrew())
				{
					if(!sv1.getWorking())
					{
						System.out.println("Enter the level of the job");
						String level = k1.nextLine();
						if(sv1.jobLevel(level))
						{
							System.out.println("Is there any bonus for the job");
							String input = k1.nextLine();
							if(input.equalsIgnoreCase("yes"))
							{
								System.out.println("Enter bonus: ");
								int b = k1.nextInt();
								k1.nextLine();
								sv1.startJob(b);
							}
							else if(input.equalsIgnoreCase("no"))
							{
								sv1.startJob();
							}
							else
							{
								System.out.println("There is no level at all");
							}
						}
						else
						{
							System.out.println("The space vehicle 1 is already in job");
						}
					}
					else
					{
						System.out.println("There is no crew in space vehicle 1");
					}
				}
			}
				
			else if(sv2 != null && vId.equals(sv2.getSpaceVehicleId()))
			{
				if(!sv2.canAddCrew())
				{
					if(!sv2.getWorking())
					{
						System.out.println("Enter the level of the job");
						String level = k1.nextLine();
						if(sv2.jobLevel(level))
						{
							System.out.println("Is there any bonus for the job");
							String input = k1.nextLine();
							if(input.equalsIgnoreCase("yes"))
							{
								System.out.println("Enter bonus: ");
								int b = k1.nextInt();
								k1.nextLine();
								sv2.startJob(b);
							}
							else if(input.equalsIgnoreCase("no"))
							{
								sv2.startJob();
							}
							else
							{
								System.out.println("There is no level at all");
							}
						}
						else
						{
							System.out.println("The space vehicle 2 is already in job");
						}
					}
					else
					{
						System.out.println("There is no crew in space vehicle 1");
					}
				}
			}
			else
			{
				System.out.println("The space vehicle ID is not found");
			}
	
		}

    }

    public void endJob( )
    {
		if(sv1 == null && sv2 == null)
		{
			System.out.println("No space vehicle exists to end a job");
		}
		else
		{
			Scanner k1 = new Scanner(System.in);
			System.out.println("Enter the space vehicle ID: ");
			String vId = k1.nextLine();
			
			if (sv1 != null && vId.equals(sv1.getSpaceVehicleId()))
			{
				if(!sv1.canAddCrew())
				{
					boolean b = sv1.getWorking();
					if(b)
					{
						sv1.setWorking();					
					}
					else
					{
						System.out.println("Space vehicle 1 is not doing any job.");
					}
				}
				else
				{
					System.out.println("Even crew is not assigned to " + sv1.getSpaceVehicleId());
				}
			}
			else if (sv2 != null && vId.equals(sv2.getSpaceVehicleId()))
			{
				if(!sv2.canAddCrew())
				{
					boolean b = sv1.getWorking();
					if(b)
					{
						sv1.setWorking();					
					}
					else
					{
						System.out.println("Space vehicle 2 is not doing any job.");
					}
				}
				else
				{
					System.out.println("Even crew is not assigned to " + sv2.getSpaceVehicleId());
				}
			}
			else
			{
				System.out.println("No such space vehicle exists");
			}
		}

    }

    public void load( ) throws IOException
    {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the input file name: ");
		String fName = keyboard.nextLine();
		
		File fOpen = new File(fName);
		Scanner inFile = new Scanner(fOpen);
		
		String vId = inFile.nextLine();
		int hours = inFile.nextInt();
		boolean working = inFile.nextBoolean();
		
		if(sv1 == null)
		{
			SpaceVehicle v1 = new SpaceVehicle(vId, working, hours);
		}
		else if(sv1 != null && sv2 == null)
		{
			SpaceVehicle v2 = new SpaceVehicle(vId, working, hours);
		}
		else
		{
			System.out.println("Both the space vehicles are occupied");
		}

    }

    public void display( )
    {
		if(sv1 == null && sv2 == null)
		{
			System.out.println("There is no space vehicle to display");
		}
		else if(sv1 != null && sv2 == null)
		{
			System.out.println(sv1);
		}
		else if(sv1 != null && sv2 != null)
		{
			System.out.println(sv1);
			System.out.println(sv2);
		}
		else if(sv1 == null && sv2 != null)
		{
			System.out.println(sv2);
		}
		
    }

}

