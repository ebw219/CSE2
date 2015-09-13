//Emily Weston
//9-4-15
//HW 02
//Arithmetic Calculations
//
//the purpose of this program is to practice manipulating data
//stored in variables, running simple calculations, and printing
//numerical output.

// define a class
public class Arithmetic{
    
//add main method
    public static void main(String[] args) {
        //input variables
        int nSocks=3; //number of pairs of socks
        double sockCost$=2.58; //cost per pair of socks
        
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29; //cost per drinking glass
        
        int nEnvelopes=1; //number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of enevelopes
        
        double taxPercent=0.06; //cost of tax in percentage
        
        
        //declare and calculate total costs and sales tax for each item
        double allSockCost$=sockCost$*nSocks; //cost of all socks
        double sockTax1=allSockCost$*taxPercent; //total sales tax for socks
            double sockTax2=sockTax1*100;
            int sockTax=(int)sockTax2;
            double sockTax$=(double)sockTax/100;
        double totalSockCost1=allSockCost$+sockTax$; \\\\\\\\\\\\\\\\\\\\\\\\\\\\//total cost of all socks
            double totalSockCost2=totalSockCost1*100;
            int totalSockCost=(int)totalSockCost2;
            double totalSockCost$=(double)totalSockCost/100;
        
        double allGlassCost$=glassCost$*nGlasses; //cost of all glasses
        double glassTax1=allGlassCost$*taxPercent; //total sales tax for glasses
            double glassTax2=glassTax1*100;
            int glassTax=(int)glassTax2;
            double glassTax$=(double)glassTax/100;
        double totalGlassCost1=allGlassCost$+glassTax$; //total cost of all glasses
            double totalGlassCost2=totalGlassCost1*100;
            int totalGlassCost=(int)totalGlassCost2;
            double totalGlassCost$=(double)totalGlassCost/100;
        
        double allEnvelopeCost$=envelopeCost$*nEnvelopes; //cost of all envelopes
        double envelopeTax1=allEnvelopeCost$*taxPercent; //total sales tax for envelopes
            double envelopeTax2=envelopeTax1*100;
            int envelopeTax=(int)envelopeTax2;
            double envelopeTax$=(double)envelopeTax/100;       
        double totalEnvelopeCost1=allEnvelopeCost$+envelopeTax$; //total cost of all envelopes
            double totalEnvelopeCost2=totalEnvelopeCost1*100;
            int totalEnvelopeCost=(int)totalEnvelopeCost2;
            double totalEnvelopeCost$=(double)totalEnvelopeCost/100;        
        
        //declare and calculate total cost of all items without tax
        double allCost$=allSockCost$+allGlassCost$+allEnvelopeCost$; //total cost of all items without tax
        
        double totalTax$=sockTax$+glassTax$+envelopeTax$; //total sales tax of all items
        
        
        //declare and calculate total cost of all items with tax
        double totalCost$=allCost$+totalTax$; //total cost of all items with tax

        
        
        //print all calculations for socks
        System.out.println("I bought "+nSocks+" pairs of socks.");
        System.out.println("Each pair of socks cost $"+sockCost$+".");
        System.out.println("All "+nSocks+" pairs of socks cost $"+allSockCost$+".");
        System.out.println("The sales tax of "+nSocks+" pairs of socks was $"+sockTax$+".");
        System.out.println("The total cost of "+nSocks+" pairs of socks, with tax, was $"+totalSockCost$+".");
        System.out.println(" ");
        
        //print all calculations for glasses
        System.out.println("I bought "+nGlasses+" drinking glasses.");
        System.out.println("Each glass cost $"+glassCost$+".");
        System.out.println("All "+nGlasses+" drinking glasses cost $"+allGlassCost$+".");
        System.out.println("The sales tax of "+nGlasses+" drinking glasses was $"+glassTax$+".");
        System.out.println("The total cost of "+nGlasses+" drinking glasses, with tax, was $"+totalGlassCost$+".");
        System.out.println(" ");
        
        //print all calculations for envelopes
        System.out.println("I bought "+nEnvelopes+" box of envelopes.");
        System.out.println(nEnvelopes+" box of envelopes cost $"+envelopeCost$+".");
        System.out.println(nEnvelopes+" box of envelopes cost $"+allEnvelopeCost$+".");
        System.out.println("The sales tax of "+nEnvelopes+" box of envelopes was $"+envelopeTax$+".");
        System.out.println("The total cost of "+nEnvelopes+" box of evelopes, with tax, was $"+totalEnvelopeCost$+".");
        System.out.println(" ");
        
        //print all calculations for all items
        System.out.println("The total cost of all the items, without tax, was $"+allCost$+".");
        System.out.println("The total sales tax of all the items was $"+totalTax$+".");
        System.out.println("The total cost of all the items, with tax, was $"+totalCost$+".");
        
        
        
    } //ends main method
    
} //ends class Arithmetic