/*
Emily Weston
10/2/15
Lab 06
the purpose of this program is to use loops, which are a critical piece of syntax in many programming languages
*/

public class GettingLoopy {
    
    public static void main(String[] args) {
        
        
        System.out.println("Step 1: ");
        int num = 1; //declares a variable
        while (num < 7){ //sets a condition
            System.out.print(num);
            num ++; // increases variable num by 1 each time it goes through the loop
            while (num==7){ //sets a condition
                System.out.println(7777777);
                break; //breaks the infinite loop
            } //ends second while loop
        } //ends first while loop
        
        
        System.out.println("Step 2: ");
        System.out.print("While loop: ");
        int primeNum=10; //declares a variable
        while (primeNum < 100) { //sets a condition
            if  (primeNum%2!=0 && primeNum%3!=0 && primeNum%5!=0 && primeNum%7!=0) { //sets a condition
            System.out.print(primeNum + " ");
            } //ends if statement
        primeNum++; //increases variable primeNum by 1 each time it goes through the loop
        } //ends while loop
        
        
        
        System.out.println(" ");
        System.out.print("For loop: ");
        int primeNum1=10; //declares a variable
        for (primeNum1=10; primeNum1<=100; primeNum1++) { //sets a condition, increases variable by 1 each time it goes through the loop 
            if  (primeNum1%2!=0 && primeNum1%3!=0 && primeNum1%5!=0 && primeNum1%7!=0) { //sets a condition
                System.out.print(primeNum1 + " ");
                } //ends if statement
        } //ends for loop
        
        
        
        System.out.println(" ");
        System.out.print("Do while loop: ");
        int primeNum2=10; //declares a variable
        do {primeNum2++; //increases the variable by 1 each time it goes through the loop
            if  (primeNum2%2!=0 && primeNum2%3!=0 && primeNum2%5!=0 && primeNum2%7!=0) { //sets a condition
                System.out.print(primeNum2 + " ");
                } //ends if statement
        } while (primeNum2<=99); //sets condition
        
        
        System.out.println(" ");
        System.out.println("Step 3:");
        int symbolNum=(int)(Math.random()*(201))+5; //declares a variable and picks a random number between 5 and 200
        int smileyNum = 5; //declares another variable
        String symbol="ツ"; //declares a string
        while (smileyNum <= symbolNum) { //sets a condition
            System.out.print(symbol);
            if ((smileyNum+16)%20==0){ //sets a condition
                System.out.println("");
            } //ends if statement
            smileyNum++; //increases variable by 1 each time it goes throught thel oop
        } //ends while loop
        
        
    } //ends main method
    
} //ends class GettingLoopy