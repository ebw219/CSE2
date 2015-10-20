/*
Emily Weston
HW 08
Area
The purpose of this program is to practice writing methods, overloading methods, and forcing the user to enter good input.
*/

import java.util.Scanner; //imports Scanner class

public class Area {

    public static void rectangleArea() {
        System.out.print("Please enter the height of your rectangle: ");
        double height=inputCheck();
        System.out.print("Please enter the width of your rectangle: ");
        double width=inputCheck();
        System.out.println("The area of your rectangle is: " + (height*width));
        return;
    } //ends method rectangleArea
    
    public static void triangleArea() {
        System.out.print("Please enter the height of your triangle: ");
        double height=inputCheck();
        System.out.print("Please enter the width of your triangle: ");
        double width=inputCheck();
        System.out.println("The area of your triangle is: " + ((height*width)/2));
        return;
    } //ends method triangleArea
    
    public static void circleArea() {
        System.out.print("Please enter the radius of your circle: ");
        double radius=inputCheck();
        System.out.print("The area of your circle is: " + ((radius*radius)*Math.PI));
        return;
    } //ends method circleArea
    
    public static double inputCheck() {
        Scanner myScanner=new Scanner (System.in); //declares an instance of scanner

        boolean acceptable = true;
        double checkVar=0;
        while (acceptable) {
            if (myScanner.hasNextDouble() ) {
                checkVar=myScanner.nextDouble();
                acceptable=false;
            } //ends if statment
            else {
                System.out.print("ERROR please enter a postive double value: ");
                myScanner.nextLine();
            } //ends else statement
        } //end while loop
    return checkVar;
    } //ends method inputCheck
    
    
    public static void main(String[] args) {
        
        Scanner myScanner=new Scanner (System.in); //declares an instance of scanner
        
        System.out.println("Please pick a rectangle, a triangle, or a circle to caluclate the area of the shape: ");
        String shape=" ";
        shape=myScanner.next();
        
        String circle="circle";
        String triangle="triangle";
        String rectangle="rectangle";
        
        boolean acceptable=true;
        while (acceptable) {
            if (shape.equals(circle) || shape.equals(rectangle) || shape.equals(triangle)) {
                acceptable=false;
            }
            else {
                System.out.print("ERROR please pick a rectangle, a triangle, or a circle: ");
                shape=myScanner.next();
            }
        } //ends while loop
        
        if (shape.equals(rectangle)) {
            rectangleArea();
        }
        
        
        if (shape.equals(triangle)) {
            triangleArea();
        }
        
        if (shape.equals(circle)) {
            circleArea();
        }
        
        
        
    } //ends main method
    
} //ends class Area