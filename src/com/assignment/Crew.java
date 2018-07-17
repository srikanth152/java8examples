package com.assignment;

/*
 * Class Name:    Crew
 *
 * Author:        Your Name
 * Creation Date: Tuesday, September 05 2017, 16:31 
 * Last Modified: Wednesday, October 04 2017, 13:30
 * 
 * Class Description:
 *
 * This is the Crew class for Assignment C, Semester 2, 2017
 */

public class Crew
{
   private String name;
   private String crewId;
   private int jobs;
   private String level;

   Crew(String name, String crewId, int jobs)
   {
      this.name = name;
      this.crewId = crewId;
      this.jobs = jobs;
	  setLevel();
   }
   
   Crew(String name, String crewId)
   {
      this.name = name;
      this.crewId = crewId;
      jobs = 0;
	  setLevel();
   }
   
   private void setLevel()
   {

      if(jobs >= 0 && jobs <= 3)
      {
            level = "Trainee";
      }
      else if(jobs >= 4 && jobs <= 10)
      {
         level = "Trained Worker";
      }
      else if(jobs >= 11 && jobs <= 16)
	  {
		  level = "Advanced Worker";
	  }
	  else if(jobs >= 17)
	  {
		  level = "Specialist";
	  }
   } 
   
   public String getName()
   {
	   return name;
   }
  public String getCrewId()
  {
	  return crewId;
  }
  public int getJobs()
  {
	  return jobs;
  }
  public String getLevel()
  {
	  return level;
  }
  public void setJobs()
  {
	  jobs =+ 1;
	  setLevel();
  }
   public void setJobs(int bonus)
  {
	  jobs =+ 1;
	  jobs = jobs + bonus;
	  setLevel();
  }
  public String toString()
  {
  return "Crew [\n\tName: "+ name + "\n\tLevel: "+ level + 
  "\n\tId: " + crewId + "\n\tJobs: " + jobs + "\n\t]\n]";
  }

}

