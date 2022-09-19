import java.util.Scanner;

public class MidtermOutput2 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int x; 
        int sumofAllnum = 0;

        System.out.println("(Note: The number should be greater than or equal to 1.) ");

        System.out.println("Enter the number of numbers you want to process: ");
        x = input.nextInt();
        
        if(x >= 1){
            int [] myNumber = new int [x];
            for(int a = 0; a < myNumber.length; a++){
                System.out.println("Number " + (a + 1) + ": ");
                myNumber[a] = input.nextInt();
            }
            System.out.println("--------------------ALL NUMBERS--------------------");
            for(int al = 0; al < myNumber.length; al++){
                System.out.println(" => " + myNumber[al]);             
            }
            //for sum of all numbers
            System.out.print("Sum: \t\t");

            //ans - all number sum
            for(int ans = 0; ans < myNumber.length; ans++){
                sumofAllnum = sumofAllnum + myNumber[ans];
                System.out.print(myNumber[ans]);

                if(ans < myNumber.length - 1){
                    System.out.print(" + ");
                }else{
                    System.out.println(" = " + sumofAllnum);
                }
            }
            //for difference of all numbers
            System.out.print("Difference: \t");
            int diffofAllnum = myNumber[0] * 2;
            
            //and - all number difference
            for(int and = 0; and < myNumber.length; and++){
                diffofAllnum = diffofAllnum - myNumber[and];
                System.out.print(myNumber[and]);

                if(and < myNumber.length - 1){
                    System.out.print(" - ");
                }else{
                    System.out.println(" = " + diffofAllnum);
                }
            }
            //for product of all numbers
            System.out.print("Product: \t");
            int productofAllsum = 1;
            //ap - all product
            for(int ap = 0; ap < myNumber.length; ap++){
                productofAllsum = productofAllsum * myNumber[ap];
                System.out.print(myNumber[ap]);

                if(ap < myNumber.length - 1){
                    System.out.print(" * ");
                }else{
                    System.out.println(" = " + productofAllsum);
                }
            }
            System.out.println("--------------------EVEN NUMBERS-------------------");
            for(int e = 0; e < myNumber.length; e++){
                if(myNumber[e] % 2 == 0){
                    System.out.println(" => " + myNumber[e]);
                }else{
                    System.out.println("NONE!");
                }
            }
                    //sum of even numbers
                    System.out.print("Sum: \t\t");
                    int sumofEven = 0;
                        //evs - sum of even nums
                        for(int evs = 0; evs < myNumber.length; evs++){
                            if(myNumber[evs] % 2 == 0){
                                System.out.print(myNumber[evs]);
                                sumofEven = sumofEven + myNumber[evs];

                                if(evs < myNumber.length - 1){
                                    System.out.print(" + ");
                                }else{
                                    System.out.println(" = " + sumofEven);
                                }
                            }
                        }
                            //for Difference
                            System.out.print("Difference: \t");
                            int evenDiff = myNumber[0] * 2;
                            //ed - for difference even
                            for(int ed = 0; ed < myNumber.length; ed++){
                                    if(myNumber[ed] % 2 == 0){
                                    System.out.print(myNumber[ed]);
                                    evenDiff = evenDiff - myNumber[ed];

                                    if(ed < myNumber.length - 1){
                                        System.out.print(" - ");
                                    }else {
                                        System.out.println(" = " + evenDiff);
                                    }              
                            }
                        }
                            System.out.print("Product \t");
                            int proEve = 1;
                                //prdtE -- for product even
                                for(int prdtE = 0; prdtE < myNumber.length; prdtE++){
                                    if(myNumber[prdtE] % 2 == 0){
                                    System.out.print(myNumber[prdtE]);
                                    proEve = proEve * myNumber[prdtE];

                                    if(prdtE < myNumber.length - 1){
                                        System.out.print(" * ");
                                    }else{
                                        System.out.println(" = " + proEve);
                                    }
                                }
                            }
                            System.out.println();
                                System.out.println("--------------------ODD NUMBERS--------------------");
                                for(int oddN = 0; oddN < myNumber.length; oddN++){
                                    if(myNumber[oddN] % 2 != 0){
                                        System.out.println(" => " + myNumber[oddN]);
                                    }else{
                                        System.out.println("NONE!");
                                    }
                                }
                                    //sum of odd numbers
                                    System.out.print("Sum: \t\t");
                                    int sumofOdd = 0;
                                    for(int odd1 = 1; odd1 < myNumber.length; odd1++){
                                        if(myNumber[odd1] % 2 != 0){
                                            System.out.print(myNumber[odd1]);
                                            sumofOdd = sumofOdd + myNumber[odd1];

                                            if(odd1 < myNumber.length - 1){
                                                System.out.print(" + ");
                                            }else{
                                                System.out.println(" = " + sumofOdd);
                                            }
                                        }
                                    }
                                    //for Difference
                                    System.out.print("Difference: \t");
                                    int oddDiff = myNumber[0] * 2;
                                    for(int diOdd = 0; diOdd < myNumber.length; diOdd++){
                                        if(myNumber[diOdd] % 2 != 0){
                                            System.out.print(myNumber[diOdd]);
                                            oddDiff = oddDiff - myNumber[diOdd];

                                            if(diOdd < myNumber.length - 1){
                                                System.out.print(" - ");
                                            }else{
                                                System.out.println(" = " + oddDiff);
                                            }
                                        }
                                    }
                                    //for product odd
                                    System.out.print("Product \t");
                                    int prodd = 1;
                                    for(int prOdd = 0; prOdd < myNumber.length; prOdd++){
                                        if(myNumber[prOdd] % 2 != 0){
                                            System.out.print(myNumber[prOdd]);
                                            prodd = prodd * myNumber[prOdd];

                                            if(prOdd < myNumber.length - 1){
                                                System.out.print(" + ");
                                            }else{
                                                System.out.println(" = " + prodd);
                                            }
                                        }
                                    }


               }else if(x < 1){
                   System.out.println("Invalid input!");
               }
           }
                
            
        {

    }
}
