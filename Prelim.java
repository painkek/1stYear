import java.util.Scanner;
import java.util.Arrays;

public class Prelim {
    //declaring public variables
    public static int length;
    public static double[] array;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("|===|==ENTER THE LENGTH OF THE PROBLEM==|===|");
        System.out.print("Insert length: ");
        length = sc.nextInt();
        System.out.println("-> " + length);

        System.out.println("|===|===|===|==ENTER NUMBER==|===|===|===|");
        //store input data or length
        array = new double[length];
        for(int i = 0; i < array.length; i++){
            System.out.print("-> ");
            array[i] = sc.nextDouble();
        }
        choicesMethod();
    }
    public static void choicesMethod(){
        
        byte response;

        while(true){
            System.out.println("|======WHAT DO YOU WANT TO CALCULATE?======| \n1. Mean\n2. Median\n3. Mode\n4. Exit");
            System.out.println("============================================");
            System.out.println("SELECT NUMBER FROM CHOICES:");
            response = sc.nextByte();

            if(response == 1){
                meanMethod(array);
            }else if(response == 2){
                medianMethod(array);
            }else if(response == 3){
                modeMethod(array);
            }else if(response == 4){
                System.out.println("T H A N K  Y O U !");
                break;
            }else if(response > 4){
                System.out.println("Invalid Input!");
            }
            System.out.println("Press any key to compute again");
            new Scanner(System.in).nextLine();
        }
    }
     //numberArray is the array to be computed
    public static void meanMethod(double[] numberArray){
        double sum = 0.0;
        double mean;
        length = numberArray.length;
        for(double num : numberArray){
            sum += num;
        }
        mean = sum / length;
        System.out.println("============================================");
        System.out.println("-> MEAN: " + mean + "\n");
    }
     //numberArray is the array to be computed
    public static void medianMethod(double[] numberArray){
        //arrcopy for sorted length
        double[] arrCopy = numberArray.clone();
        double median;
        Arrays.sort(arrCopy);
        int n = arrCopy.length; 
        //if length is odd
        if(n % 2 != 0){
            median = arrCopy[n / 2];
        //else if even
        }else{
            median = (arrCopy[n / 2] + arrCopy[n / 2 - 1]) / 2.0;
        }
        System.out.println("-> MEDIAN: " + median);
    }
     //numberArray is the array to be computed
    public static void modeMethod(double[] numberArray){
        double maxValue = 0;
        double maxCount = 0;
        for(int i = 0; i < length; ++i) {
            int count = 0;
            for(int j = 0; j < length; ++j) {
                //compare if the same, ++ the value of count
                if(numberArray[j] == numberArray[i]) {
                    ++count;
                }
                if(count > maxCount) {
                    maxCount = count;
                    maxValue = numberArray[i];
                }
            }
        }
        System.out.println("-> MODE: " + maxValue);
    }
}
