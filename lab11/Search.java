/*
Emily Weston
Lab 11
Search
The purpose of this program is to perform linear and binary search on large arrays of random numbers.
*/

import java.util.Scanner; //imports Scanner class

public class Search {
    
    public static void main(String [] args) {
        
        Scanner myScanner = new Scanner (System.in);
        
        int[] array1 = new int [5000];
        int[] array2 = new int [5000];
        
        for (int q=0; q<array1.length; q++) {
            array1[q]=(int)(Math.random()*100000);
        }
        
        int min=0;
        int max=0;
        if (array1[1]>array1[0]) {
            min=array1[0];
            max=array1[1];
        }
        else if (array1[1]<array1[0]) {
            min=array1[1];
            max=array1[0];
        }
        for (int q=0; q<array1.length; q++) {
            if (array1[q]>max) {
                array1[q]=max;
            }
            else if (array1[q]<min) {
                array1[q]=min;
            }
        }
        
        System.out.println("The max is: " + max);
        System.out.println("The min is: " + min);
        
        
        int before=0;
        int q=0;
        for (q=0; q<array2.length; q++) {
            array2[q]=(int)(Math.random()*100000);
            if (array2[q]>before) {
                before=array2[q];
            }
            else {
                continue;
            }
        }
        
        
        int min2=0;
        int max2=0;
        if (array2[1]>array2[0]) {
            min2=array2[0];
            max2=array2[1];
        }
        else if (array2[1]<array2[0]) {
            min2=array2[1];
            max2=array2[0];
        }
        for (int w=0; w<array2.length; w++) {
            if (array2[w]>max2) {
                array2[w]=max2;
            }
            else if (array2[w]<min2) {
                array2[w]=min2;
            }
        }

        
        System.out.println("The max is: " + max2);
        System.out.println("The min is: " + min2);
        
        
        System.out.println("Please enter an integer greater than 0: ");
        int user=myScanner.nextInt();
        if (user<0) {
            System.exit(0);
        }
        
        
        int low=0;
        int high=array2.length-1;
        int mid=(low+high)/2;
        while (low<=high) {
            if (array2[mid]<user) {
                low=mid+1;
                mid=(low+high)/2;
            }
            else if (array2[mid]==user) {
                System.out.print(user + " was found.");
            }
            else {
                high=mid-1;
                mid=(low+high)/2;
            }
            if (low>high) {
                System.out.println(user + " was not found in the list");
                if (user>100000) {
                    System.out.println("The number above the key was none.");
                }
                else {
                    System.out.println("The number above the key was " + array2[low]);
                }
                if (user<array2[0]) {
                    System.out.println("The number below the key was none.");
                }
                else {
                    System.out.println("The number below the key was " + array2[high]);
                }
                break;
            }
        }

        
        
        
        
    } // ends main method
    
} //ends class Search