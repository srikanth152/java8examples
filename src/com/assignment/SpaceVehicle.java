package com.assignment;

/*
 * Class Name:    SpaceVehicle
 *
 * Author:        Your Name
 * Creation Date: Tuesday, September 05 2017, 19:24 
 * Last Modified: Sunday, September 24 2017, 02:40
 * 
 * Class Description:
 *
 * This is the SpaceVehicle class for Assignment C, Semester 2, 2017
 * Each Space Vehicle has just one Crew object. This Crew object has
 * to be added after the SpaceVehicle is instantiated
 *
 */

public class SpaceVehicle
{
	private boolean working;
	private String spaceVehicleId;
	private Crew crew;
	private int hours;
	
	SpaceVehicle(String spaceVehicleId)
	{
		this.spaceVehicleId = spaceVehicleId;
		working = false;
		crew = null;
		hours = 0;
		
	}
	
	SpaceVehicle(String spaceVehicleId, boolean working, int hours)
	{
		this.spaceVehicleId = spaceVehicleId;
		this.working = working;
		this.hours = hours;
		crew = null;
	}
	
	public boolean getWorking()
	{
		return working;
	}
	public void setWorking()
	{
		if(working == true)
		{
			working = false;
		}
		else
		{
			working = true;
		}
	}
	public String getSpaceVehicleId()
	{
		return spaceVehicleId;
	}
	public String getCrewId()
	{
		return crew.getCrewId();
	}
	public int getHours()
	{
		return hours;
	}
	public void addCrew(String name, String crewId)
	{
		if(crew == null)
		{
			Crew c1 = new Crew(name, crewId);
			System.out.println(c1.toString());
		}
	}
	public void addCrew(String name, String crewId, int jobs)
	{
		if(crew == null)
		{
			Crew c2 = new Crew(name, crewId, jobs);
			System.out.println(c2.toString());
		}
	}
	public void startJob()
	{
		if(working == false && crew != null)
		{
			working = true;
			crew.setJobs();
			hours = hours + 1;		
			
		}
	}
	public void startJob(int bonus)
	{
		if(working == false && crew != null)
		{
			working = true;
			crew.setJobs(bonus);
			hours = hours + 1;		
			
		}
	}
	public void endJob()
	{
		if(working == true)
		{
			working = false;
		}
	}
	public boolean jobLevel(String level)
	{
		if(level.equalsIgnoreCase("Specilist"))
		{
			return crew.getJobs() >= 17;
		}
		else if(level.equalsIgnoreCase("Advanced Worker"))
		{
			return crew.getJobs() >= 11;
		}
		else if(level.equalsIgnoreCase("Trained Worker"))
		{
			return crew.getJobs() >= 4;
		}
		else if(level.equalsIgnoreCase("Trainee"))
		{
			return true;
		}
		else
		{	
			return false;
		}
		
	}
	public boolean canAddCrew()
	{
		boolean b = false;
		if(crew == null)
		{
			b = true;
		}
		else
		{
			b = false;
		}
		return b;
	}
	public String toString()
	{
		String r;
		if(crew == null)
		{
			r = "SpaceVehicle \n[ \n\tId: "+spaceVehicleId+
			"\n\tHours:0\n\tCurrently not working\n\tThis Space Vehicle has no crew\n]";
		}
		else
		{
			r = "SpaceVehicle \n[ \n\tId: "+spaceVehicleId+"\n\tHours: "
			+hours+"\n\tCurrently not working"+crew.toString();			
		}
		return r;		
	}
}

