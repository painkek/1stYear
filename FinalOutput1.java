
import java.util.Scanner;

public class FinalOutput1 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter a number:");
        int size = sc.nextInt();
        int nc = size * (size - 1) + 1;
        //int spaces = 2 * size - 3;

        if(size < 1){
            System.out.println("Invalid Input!");
        }else if (size == 1){
           System.out.println("*");
        }else if (size >= 1 && size <= 4){
            for(int i = 0; i < nc; i++){
                for(int j = 0; j < nc; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }else{
            for (int i = 1; i <= nc; i++) {     //prints the diagonal 
                for (int j = 1; j <= nc; j++) {
                    if (i == 1 || i == nc || j == 1 || j == nc) {   //  a==b || a+b==length+1
                         System.out.print("* ");
                    }else if (i == j || i + j == nc + 1 || i + j == size + 1) { //prints the diagonal 
                        System.out.print("* ");
                      } else {
                      System.out.print("  ");   //empty spaces
                      }
                  } 
                  System.out.println();     
            }
        }
    }
}
