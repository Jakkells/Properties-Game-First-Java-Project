
package wordstostorethenamesof20students;
import java.util.Scanner;







public class WordsToStoreTheNamesOf20Students {

static int numNames = 20;    
static String [] StudentsNames = new String [numNames]; 


    
    
    static void showWords (String StudentsNames[]) {
        
        for (int i = 0; i<=19; i++){
            System.out.println((i+1) + ". " + StudentsNames[i]);
        }
        
    }
    
    static void howManyWords (String [] StudentsNames) {
        int CharNums = 0;
        
        for (int i = 0; i <= 19; i++){
            
            if (StudentsNames[i].length() > 5) {
                CharNums = CharNums + 1;             
            }
             
          
        }
        System.out.println("Of the student names " + CharNums + " has more than 5 characters.");
        System.out.println();
        
        
    }
        
    
    
    
    

    public static void main(String[] args) {
                         
        //howMnayWords counts number of names with more than 5 characters
        //call other methods
        //here show names with more than 5 characters
        // {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19}
        
                
        
        Scanner myObj = new Scanner(System.in);
        
        
        for (int i = 0; i <= 19; i++){
            
            System.out.println("Please input the name of student " + (i+1) );            
            StudentsNames[i] = myObj.nextLine();
            
        }   
            System.out.println();
            System.out.println("Student Names Successfully saved.\n");                                   
            System.out.println("Here are the names:");
            
            showWords(StudentsNames);
            
            System.out.println();
            
            howManyWords(StudentsNames);
            
            
            
            
        
        
        
    }
    
}
