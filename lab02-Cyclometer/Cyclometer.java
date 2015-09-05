//Emily Weston
//9-4-15
//Lab 02
//Arithmetic Calculations - Cyclometer
//
//the purpose of this program is to use values stored in variables to 
//calculate the minutes, counts, and distance for each trip and the 
//distance for the two trips combined.

// define a class
public class Cyclometer{
    
//add main method
    public static void main(String[] args) {
        //input data
        int secsTrip1=480; //stores number of seconds in trip 1
        int secsTrip2=3220; //stores number of seconds in trip 2
        int countsTrip1=1561; //stores number of counts in trip 1
        int countsTrip2=9037; //stores number of counts in trip 2
        
        //intermediate variables and output data
        double wheelDiameter=27.0, //stores diameter of the wheel
        PI=3.14159, //stores value of PI
            feetPerMile=5280, //stores number of feet per mile
            inchesPerFoot=12, //stores number of inches per foot
            secondsPerMinute=60; //stores number of seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance; //declares variables for distances of trips
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        //prints minutes and counts for trip 1
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        //prints minutes and counts for trip 2
        
        distanceTrip1=countsTrip1*wheelDiameter*PI; //calculates the distance of trip 1 in inches
        distanceTrip1=inchesPerFoot*feetPerMile; //calculates distance of trip 1 in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculates distance of tirp 2 in miles
        totalDistance=distanceTrip1+distanceTrip2; //calculates total distance of both trips
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        //prints distance for trip 1
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        //prints distance for trip 2
        System.out.println("The total distance was "+totalDistance+" miles.");
        //prints total distance of both trips
        
        
    } //end of main method
    
    
    
} //end of class