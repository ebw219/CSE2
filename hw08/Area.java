/*
Emily Weston
HW 08
Area
The purpose of this program is to practice writing methods, overloading methods, and forcing the user to enter good input.
*/

import java.util.Scanner; //imports Scanner class

public class Area {

    public static void rectangleArea() { //declares method to find rectangle area
        System.out.print("Please enter the height of your rectangle: ");
        double height=inputCheck(); //allows user to enter input and checks it
        System.out.print("Please enter the width of your rectangle: ");
        double width=inputCheck(); //allows user to enter input and checks it
        System.out.println("The area of your rectangle is: " + (height*width));
        return; //makes the method keep its data
    } //ends method rectangleArea
    
    public static void triangleArea() { //declares method to find triangle area
        System.out.print("Please enter the height of your triangle: ");
        double height=inputCheck(); //allows user to enter input and checks it
        System.out.print("Please enter the width of your triangle: ");
        double width=inputCheck(); //allows user to enter input and checks it
        System.out.println("The area of your triangle is: " + ((height*width)/2));
        return; //makes the method keep its data
    } //ends method triangleArea
    
    public static void circleArea() { //declares method to find circle area
        System.out.print("Please enter the radius of your circle: ");
        double radius=inputCheck(); //allows uer to enter input and checks it
        System.out.print("The area of your circle is: " + ((radius*radius)*Math.PI));
        return; //makes the method keep its data
    } //ends method circleArea
    
    public static double inputCheck() { //declares method to check the users input
        Scanner myScanner=new Scanner (System.in); //declares an instance of scanner

        boolean acceptable = true;
        double checkVar=0;
        while (acceptable) { //while statement to check the users input
            if (myScanner.hasNextDouble() ) { //condition to check if users input is a double
                checkVar=myScanner.nextDouble();
                acceptable=false;
            } //ends if statment
            else {
                System.out.print("ERROR please enter a postive double value: ");
                myScanner.nextLine();
            } //ends else statement
        } //end while loop
    return checkVar; //makes the method keep its data
    } //ends method inputCheck
    
    
    public static void main(String[] args) { //main method
        
        Scanner myScanner=new Scanner (System.in); //declares an instance of scanner
        
        System.out.println("Please pick a rectangle, a triangle, or a circle to caluclate the area of the shape: ");
        String shape=" ";
        shape=myScanner.next(); //allows user to input a shape of choice
        
        String circle="circle";
        String triangle="triangle";
        String rectangle="rectangle";
        
        boolean acceptable=true;
        while (acceptable) {
            if (shape.equals(circle) || shape.equals(rectangle) || shape.equals(triangle)) { //checks if user input is one of the acceptable shapes
                acceptable=false;
            }
            else {
                System.out.print("ERROR please pick a rectangle, a triangle, or a circle: ");
                shape=myScanner.next();
            }
        } //ends while loop
        
        if (shape.equals(rectangle)) {
            rectangleArea(); //runs method to get rectangle area
        } //ends if statement
        else if (shape.equals(triangle)) {
            triangleArea(); //runs method to get triangle area
        } //ends else if statement
        else if (shape.equals(circle)) {
            circleArea(); //runs method to get circle area
        } //ends else if statement
        
        
        
    } //ends main method
    
} //ends class Area