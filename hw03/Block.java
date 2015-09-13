//Emily Weston
//9-11-15
//HW 03
//Block
//
//the purpose of this program is to take user input and use the dimensions to
//calculate the volume and surface area of a block

import java.util.Scanner; //imports Scanner class in order to use it

public class Block {
    
    public static void main(String[] args) {
        
        Scanner myScanner=new Scanner (System.in); //declare an instance of Scanner
        
        System.out.print("Enter the length of the block: ");
        //prompts user to input the length of the block
        double blockLength = myScanner.nextDouble();
        //accepts user input and stores it
        
        System.out.print("Enter the width of the block: ");
        //prompts user to input the width of the block
        double blockWidth = myScanner.nextDouble();
        //accepts user input and stores it
        
        System.out.print("Enter the height of the block: ");
        //prompts user to input the height of the block
        double blockHeight = myScanner.nextDouble();
        //accepts user input and stores it
        
        double blockVolume = blockLength * blockWidth * blockHeight;
        //calculates and stores volume of the block
        double blockSurface = 2*(blockWidth*blockLength + blockHeight*blockLength + blockHeight*blockWidth);
        //calculates and stores surface area of the block
        
        System.out.println("The volume of the block of dimensions "+blockLength+" x "+blockWidth+" x "+blockHeight+" is "+blockVolume);
        //prints dimensions and volume of the block
        System.out.println("The surface area of the block is "+blockSurface);
        //prints surface area of the block

        
    } //ends main method
    
} //ends class Block