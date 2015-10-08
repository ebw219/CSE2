import java.util.Scanner; //imports Scanner class
import java.text.*;

public class CheckDigit {
    
    public static void main(String[] args) {
        
        
        Scanner myScanner=new Scanner (System.in); //declares an instance of scanner
        
        char oneChar=0, twoChar=0, threeChar=0, fourChar=0, fiveChar=0, 
        sixChar=0, sevenChar=0, eightChar=0, nineChar=0, checkChar=0; //declares and defines a variable for each char of the input
        String barcode="0123456789"; //declares and defines a variable for the input
        System.out.print("Please enter a 10 digit barcode: "); //prompts the user to input an ISBN number
     
        int q=0; //declares and defines a variable to use to check the loop
        boolean condition=true; //declares and defines a boolean to use to check the loop
        
        
        do { //opens do while loop
            barcode=myScanner.next(); //allows user to input ISBN number
            if (barcode.length()==10) { //sets condition for if statement
                oneChar=barcode.charAt(0); //turns each digit of the user's input into a separate variable
                twoChar=barcode.charAt(1);
                threeChar=barcode.charAt(2);
                fourChar=barcode.charAt(3);
                fiveChar=barcode.charAt(4);
                sixChar=barcode.charAt(5);
                sevenChar=barcode.charAt(6);
                eightChar=barcode.charAt(7);
                nineChar=barcode.charAt(8);
                checkChar=barcode.charAt(9);
                if (oneChar=='0' || oneChar=='1' || oneChar=='2' || oneChar=='3' 
                || oneChar=='4' || oneChar=='5' || oneChar=='6' || oneChar=='7' 
                || oneChar=='8' || oneChar=='9') { //sets condition for each char to check if the user's input is made up of all numbers
                    q++; //additional statement to control the loop; adds one to the value of q if the condition is met
                } //ends if statement
                if (twoChar=='0' || twoChar=='1' || twoChar=='2' || twoChar=='3'
                || twoChar=='4' || twoChar=='5' || twoChar=='6' || twoChar=='7' 
                || twoChar=='8' || twoChar=='9') {
                    q++;
                } //ends if statement
                if (threeChar=='0' || threeChar=='1' || threeChar=='2' || threeChar=='3' 
                || threeChar=='4' || threeChar=='5' || threeChar=='6' || threeChar=='7'
                || threeChar=='8' || threeChar=='9') {
                    q++;
                } //ends if statement
                if (fourChar=='0' || fourChar=='1' || fourChar=='2' || fourChar=='3' 
                || fourChar=='4' || fourChar=='5' || fourChar=='6' || fourChar=='7'
                || fourChar=='8' || fourChar=='9') {
                    q++;
                } //ends if statement
                if (fiveChar=='0' || fiveChar=='1' || fiveChar=='2' || fiveChar=='3' 
                || fiveChar=='4' || fiveChar=='5' || fiveChar=='6' || fiveChar=='7' 
                || fiveChar=='8' || fiveChar=='9') {
                    q++;
                } //ends if statement
                if (sixChar=='0' || sixChar=='1' || sixChar=='2'|| sixChar=='3' 
                || sixChar=='4' || sixChar=='5' || sixChar=='6' || sixChar=='7'
                || sixChar=='8' || sixChar=='9') {
                    q++;
                } //ends if statement
                if (sevenChar=='0' || sevenChar=='1' || sevenChar=='2' || sevenChar=='3'
                || sevenChar=='4' || sevenChar=='5' || sevenChar=='6' || sevenChar=='7' 
                || sevenChar=='8' || sevenChar=='9') {
                    q++;
                } //ends if statement
                if (eightChar=='0' || eightChar=='1' || eightChar=='2' || eightChar=='3'
                || eightChar=='4' || eightChar=='5' || eightChar=='6' || eightChar=='7' 
                || eightChar=='8' || eightChar=='9') {
                    q++;
                } //ends if statement
                if (nineChar=='0' || nineChar=='1' || nineChar=='2' || nineChar=='3'
                || nineChar=='4' || nineChar=='5' || nineChar=='6' || nineChar=='7' 
                || nineChar=='8' || nineChar=='9') {
                    q++;
                } //ends if statement
                if (checkChar=='0' || checkChar=='1' || checkChar=='2' || checkChar=='3' 
                || checkChar=='4' || checkChar=='5' || checkChar=='6' || checkChar=='7'
                || checkChar=='8' || checkChar=='9' || checkChar=='X') {
                    q++;
                } //ends if statement
            
                if (q==10) { //sets condition to check if the user's input is the correct amount of digits
                    condition=false; //ends the loop if the user's input is the correct amount of digits
                    continue; //continues the code
                } //ends if statement
                else { //if the q==10 condition is not true
                    q=0; //additional statement to control the loop; resets the loop and allows the user to input a new ISBN number
                    condition = true; //additional statement to control the loop; resets the loop and allows the user to input a new ISBN number
                } //ends else statement
            } //ends outermost if statement
            
            System.out.print("This is not a valid ISBN. Please enter 10 digits: "); //tells the user that their input is not valid and prompts them to input a new ISBN number
            barcode=myScanner.next(); //allows user to input ISBN number
            q = 0; //additional statement to control the loop; resets the loop and allows the user to input a new ISBN number
            
        } while (condition); //ends do while loop and sets condition for the loop
        

        int one=Character.getNumericValue(oneChar); //converts each char into an int variable
        int two=Character.getNumericValue(twoChar);
        int three=Character.getNumericValue(threeChar);
        int four=Character.getNumericValue(fourChar);
        int five=Character.getNumericValue(fiveChar);
        int six=Character.getNumericValue(sixChar);
        int seven=Character.getNumericValue(sevenChar);
        int eight=Character.getNumericValue(eightChar);
        int nine=Character.getNumericValue(nineChar);
        int check=Character.getNumericValue(checkChar);
        
        int summation=((one*10)+(two*9)+(three*8)+(four*7)+(five*6)+(six*5)+(seven*4)+(eight*3)+(nine*2)); //finds the ISBN sum of all the digits
        int remainder=(summation%11); //finds the remainder of the ISBN sum
        
        if (remainder==check) { //condition for if statement
            System.out.println("This is a valid ISBN."); //tells user their input is a valid ISBN number
        } //ends if statement
        else { //if the remainder==check condition is not true
            System.out.println("This is not a valid ISBN. Check digit should be " + check); //tells user their input is not a valid ISBN number and what it should be
        } //ends else statement
        

        
        
    } //ends main method
    
} //ends class CheckDigit