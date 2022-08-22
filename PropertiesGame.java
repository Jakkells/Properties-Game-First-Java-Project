package propertiesgame;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;



public class PropertiesGame {
   
static double  fullPay;
static Scanner myObj = new Scanner (System.in);
static int CapitalStart;
static int PropPrice;
static double discountFullPay;
static double endCapital;
static double Debt;
static double finalFullPay;
    
                             
static void Welcome (){
    
    Random rand = new Random();
        int upperbound = 10000;
        int int_random = rand.nextInt(upperbound);        
       
                
        System.out.println("Welcome to Jaco's Property Game Player " + int_random);
        System.out.println();
        
        
        
        System.out.println("Here are the list of properties available:");
        System.out.println();
        System.out.println(" ____________________ ");
        System.out.println("|Property |  Price   |");
        System.out.println("|_________|__________|");        
        System.out.println("|House    |  R700000 |");
        System.out.println("|_________|__________|");
        System.out.println("|Flat     |  R150000 |");
        System.out.println("|_________|__________|");
        System.out.println("|Duplex   |  R300000 |");
        System.out.println("|_________|__________|");
        System.out.println("|Loft     |  R180000 |");
        System.out.println("|_________|__________|");
        System.out.println();
        
        
        
            
         
                 
            
            
        
    
}

static void CapitalTry () {
    
                boolean done = true;     
            while (done) {         
    try {
            System.out.println("What is your starting capital? Please enter below"); 
            System.out.print("R"); CapitalStart = myObj.nextInt(); 
            done = false;
            
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");
            System.out.println();
            myObj.next();
           
            
        }
    }
}


static void HouseBuys () {
    
    System.out.println("Please enter the price of the properties you would like to purchase");
    System.out.println("In the price area enter 0 when done.");
    System.out.println();
    
    
                 
    do {
        System.out.print("R"); PropPrice = myObj.nextInt ();
        fullPay = fullPay + PropPrice;
    }
        while (PropPrice > 0);
    
    System.out.println("Your Full Amount to be paid is R" + fullPay);
    
    if (fullPay > 500000){
        System.out.println();
        System.out.println("You qualify for a discount of 15% off!");
        System.out.println();
        discountFullPay = fullPay - fullPay * .15 ;
        System.out.println("Your new amount to be paid is " + discountFullPay);
        System.out.println();
}
    
    finalFullPay = discountFullPay + fullPay;


}

static void CapitalCheck () {
    
    endCapital = CapitalStart - finalFullPay;
    
    if (endCapital > -1){
                
        System.out.println("Your capital balance is now " + endCapital);
    }
    else if (endCapital < -1){
        Debt = CapitalStart - finalFullPay * -1;
        System.out.println("Your Debt is " + Debt);
    }
    
}

   
    public static void main(String[] args) throws Exception {
        /* References
            https://www.studytonight.com/java-examples/check-if-input-is-integer-in-java
            https://www.tutorialspoint.com/java/lang/character_isdigit.htm
            https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
        */                       
        
        
    Welcome ();   
    CapitalTry ();
    HouseBuys ();
    CapitalCheck ();
    
   
    
    
        
        
        
        
        
            
        
    
        
        
                               
        
        
        
        
       
    }
}
