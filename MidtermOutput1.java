import java.util.Scanner;

public class MidtermOutput1{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int userInput;
        int eq;

        System.out.println("(Note: The number should be greater than or equal to 1.)");
        
        System.out.println("Enter a number:");
        userInput = input.nextInt();

        eq = (userInput * userInput) - userInput + 1;
      
        if (userInput >= 1){
            for(int i = 1; i <= eq; i++){
                for(int j = 1; j <= eq; j++){
                    if(i == 1 ||
                       j == 1 ||
                       i == userInput || 
                       j == userInput ||
                       i == (userInput * userInput) - userInput + 1 || 
                       j == (userInput * userInput) - userInput + 1 ||
                       i == userInput + userInput - 1 ||
                       j == userInput + userInput - 1 ||
                       i == userInput + userInput + userInput - 2 ||
                       j == userInput + userInput + userInput - 2 ||
                       i == userInput + userInput + userInput + userInput - 3 ||
                       j == userInput + userInput + userInput + userInput - 3 ||
                       i == userInput + userInput + userInput + userInput + userInput - 4 ||
                       j == userInput + userInput + userInput + userInput + userInput - 4 ||
                       i == userInput + userInput + userInput + userInput + userInput + userInput - 5 ||
                       j == userInput + userInput + userInput + userInput + userInput + userInput - 5 ||
                       i == userInput + userInput + userInput + userInput + userInput + userInput  + userInput - 6 ||
                       j == userInput + userInput + userInput + userInput + userInput + userInput  + userInput - 6){         
                        System.out.print("* ");        
                   } else {                                      
                       System.out.print("  ");   	                   
                   }
               }
               System.out.println();
               }
               }else {
                       System.out.println("Invalid input!");                   
                     }
               }
               
   }

   




