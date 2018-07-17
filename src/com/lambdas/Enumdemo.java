package com.lambdas;

public class Enumdemo {
    public enum DCLItineraryItemType {
        
         DCL_RESERVATION("dclReservation"), 
         DCL_DINING_RESERVATION("dclDiningReservation"),
         DCL_NURSERY_RESERVATION("dclNurseryReservation"), 
         DCL_SPA_RESERVATION("dclSpaReservation"),
         DCL_ONBOARD_ACTIVITY("dclOnboardActivity"), 
         DCL_PORT_ADVENTURE("dclPortAdventure");

         private final String description;
         private final String value;

         private DCLItineraryItemType(String description) {
             this.description = description;
             this.value = this.name();
         }

        

         public String getDescription() {
             return description;
         }

         public String value() {
             return this.value;
         }
     }
public static void main(String[] args) {
   
    System.out.println(DCLItineraryItemType.DCL_DINING_RESERVATION.getDescription());
}
}
