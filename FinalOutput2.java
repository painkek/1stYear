import java.util.Scanner;

public class FinalOutput2 {

    static Scanner ui = new Scanner(System.in); //forchoices

    //prelim
    static String attendanceGrade = "", classparticipationGrade = "", quizGrade = "", examGrade = "";
    static double attresponse = 0, cpResponse = 0, qgResponse = 0, egResponse = 0;

    //midterm
    static String attendanceGradeA = "", classparticipationGradeA = "", quizGradeA = "", examGradeA = "";
    static double attresponseA = 0, cpResponseA = 0, qgResponseA = 0, egResponseA = 0;

    //finals
    static String attendanceGradeB = "", classparticipationGradeB = "", quizGradeB = "", examGradeB = "";
    static double attresponseB = 0, cpResponseB = 0, qgResponseB = 0, egResponseB = 0;

    //overall
    static double prelimGrd, midtermGrd, finalGrd, semesterGrd;


    static String[] firstNameArray = new String[500];
    static String[] middleInitialArray = new String[500];
    static String[] lastNameArray = new String [500];
    static byte addStudentCounter = 0;
    static String firstname = "";
    static String middleInitial = "";
    static String lastname = "";
    static boolean validation = false;

    static char charStatus() {
        
        char toDisplay = 0;
        
        if (semesterGrd >= 95 && semesterGrd <= 100) {
            toDisplay = 'A';			
        } else if (semesterGrd >= 90 && semesterGrd < 95) {
            toDisplay = 'B';
        } else if (semesterGrd >= 85 && semesterGrd < 90) {
            toDisplay = 'C';
        } else if (semesterGrd >= 80 && semesterGrd < 85) {
            toDisplay = 'D';
        } else if (semesterGrd >= 60 && semesterGrd < 75) {
            toDisplay = 'E';
        }else if (semesterGrd >= 60 && semesterGrd < 75) {
            toDisplay = 'F';
        } return toDisplay;
        
    }
    static String strStatus() {
        
        String statusToDisplay = null;
        if (semesterGrd >= 75 && semesterGrd <= 100) {
            statusToDisplay = "PASSED";
        } else if ( semesterGrd >= 60 && semesterGrd > 75) {
            statusToDisplay = "FAILED";
        } 
        return statusToDisplay;
    }

    static boolean isNumber(String input){
        try {
            Byte.parseByte(input);
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    static boolean checkNum(String input){  //for GRADES VALIDATION
        try {
            Double.parseDouble(input);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public static void main(String args[]){
        runChoices();
    }

    public static void runChoices(){

        String user = "";
        byte response = 0;

        while(!validation){
            System.out.println("============SELECT FROM THE CHOICES===========");
            System.out.println("1 - Add Record");
            System.out.println("2 - View Records");
            System.out.println("3 - Exit");
            user = ui.nextLine();
            if(isNumber(user)){
                response = Byte.parseByte(user);
            if(response == 1){
                runAddRecord();
            }else if(response == 2){
                runViewRecords();
            }else if(response == 3){
                System.out.println("Thank you!");
                break;
            }else{
                System.out.println("Invalid Input!");
            }
        }else if(user.isBlank()){
            System.out.println("Invalid Input!");
        }else{
            System.out.println("Invalid Input!");
        }
    }
}

        public static void runAddRecord(){
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("==================ADD RECORD===================");
        
            System.out.println("---------------------NAME----------------------");

            while(!validation){
                System.out.println("First Name:");
                firstname = sc.nextLine().trim();
                if(firstname.isBlank()){
                    System.out.println("Input is required");
                }else{
                    break;
                }
            }
            while(!validation){
                System.out.println("Middle Initial:");
                middleInitial = sc.nextLine().trim();
                if(middleInitial.isBlank()){
                    System.out.println("Input is required!");
                }else{
                    break;
                }
            }
            while(!validation){
                System.out.println("Last name: ");
                lastname = sc.nextLine().trim();
                if(lastname.isBlank()){
                    System.out.println("Input is required!");
                }else{
                    break;
                }
            }
            runPrelim();
    }
        public static void runPrelim(){

            Scanner sc = new Scanner(System.in);

            System.out.println("--------------------PRELIM---------------------");
            while(!validation){
                System.out.println("Attendace Grade:");
                attendanceGrade = sc.nextLine();
                if(checkNum(attendanceGrade)){
                    attresponse = Double.parseDouble(attendanceGrade);
                if(attresponse < 60 || attresponse > 100){
                    System.out.println("Invalid Grade!");   
                }else{
                   break;
                }
            }else if(attendanceGrade.isBlank()){
                System.out.println("Input is required!");
            }else{
                System.out.println("Invalid Input!");
            }
        }
            while(!validation){
                System.out.println("Class Participation Grade:");
                classparticipationGrade = sc.nextLine();
                if(checkNum(classparticipationGrade)){
                    cpResponse = Double.parseDouble(classparticipationGrade);
                if(cpResponse < 60 || cpResponse > 100){
                    System.out.println("Invalid Grade!");
                }else{
                    break;
                }
            }else if(classparticipationGrade.isBlank()){
                System.out.println("Input is required!");
            }else{
                System.out.println("Invalid Input!");
            }
        }
            while(!validation){
                System.out.println("Quiz Grade:");
                quizGrade = sc.nextLine();
                if(checkNum(quizGrade)){
                    qgResponse = Double.parseDouble(quizGrade);
                    if(qgResponse < 60 || qgResponse > 100){
                        System.out.println("Invalid Grade!");
                    }else{
                        break;
                    }
                }else if(quizGrade.isBlank()){
                    System.out.println("Input is required!");
                }else{
                    System.out.println("Invalid Input!");
            }
        }      
        while(!validation){
            System.out.println("Exam Grade:");
            examGrade = sc.nextLine();
            if(checkNum(examGrade)){
                egResponse = Double.parseDouble(examGrade);
                if(egResponse < 60 || egResponse > 100){
                    System.out.println("Invalid Grade!");
                }else{
                    break;
                }
            }else if(examGrade.isBlank()){
                System.out.println("Input is required!");
            }else{
                System.out.println("Invalid Input!");
            }
        }   
        runMidterm();
    }
    public static void runMidterm(){
            Scanner sc = new Scanner(System.in);

            boolean validation = false;

            System.out.println("--------------------MIDTERM--------------------");
            while(!validation){
                System.out.println("Attendace Grade:");
                attendanceGradeA = sc.nextLine();
                if(checkNum(attendanceGradeA)){
                    attresponseA = Double.parseDouble(attendanceGradeA);
                if(attresponseA < 60 || attresponseA > 100){
                    System.out.println("Invalid Grade!");   
                }else{
                   break;
                }
            }else if(attendanceGradeA.isBlank()){
                System.out.println("Input is required!");
            }else{
                System.out.println("Invalid Input!");
            }
        }
            while(!validation){
                System.out.println("Class Participation Grade:");
                classparticipationGradeA = sc.nextLine();
                if(checkNum(classparticipationGradeA)){
                    cpResponseA = Double.parseDouble(classparticipationGradeA);
                if(cpResponseA < 60 || cpResponseA > 100){
                    System.out.println("Invalid Grade!");
                }else{
                    break;
                }
            }else if(classparticipationGradeA.isBlank()){
                System.out.println("Input is required!");
            }else{
                System.out.println("Invalid Input!");
            }
        }
            while(!validation){
                System.out.println("Quiz Grade:");
                quizGradeA = sc.nextLine();
                if(checkNum(quizGradeA)){
                    qgResponseA = Double.parseDouble(quizGradeA);
                    if(qgResponseA < 60 || qgResponseA > 100){
                        System.out.println("Invalid Grade!");
                    }else{
                        break;
                    }
                }else if(quizGradeA.isBlank()){
                    System.out.println("Input is required!");
                }else{
                    System.out.println("Invalid Input!");
            }
        }      
        while(!validation){
            System.out.println("Exam Grade:");
            examGradeA = sc.nextLine();
            if(checkNum(examGradeA)){
                egResponseA = Double.parseDouble(examGradeA);
                if(egResponseA < 60 || egResponseA > 100){
                    System.out.println("Invalid Grade!");
                }else{
                    break;
                }
            }else if(examGradeA.isBlank()){
                System.out.println("Input is required!");
            }else{
                System.out.println("Invalid Input!");
            }
        }   
        runFinals();
    }
    public static void runFinals(){
        Scanner sc = new Scanner(System.in);

            boolean validation = false;

            System.out.println("---------------------FINAL---------------------");
            while(!validation){
                System.out.println("Attendace Grade");
                attendanceGradeB = sc.nextLine();
                if(checkNum(attendanceGradeB)){
                    attresponseB = Double.parseDouble(attendanceGradeB);
                if(attresponseB < 60 || attresponseB > 100){
                    System.out.println("Invalid Grade!");   
                }else{
                   break;
                }
            }else if(attendanceGradeB.isBlank()){
                System.out.println("Input is required!");
            }else{
                System.out.println("Invalid Input!");
            }
        }
            while(!validation){
                System.out.println("Class Participation Grade");
                classparticipationGradeB = sc.nextLine();
                if(checkNum(classparticipationGradeB)){
                    cpResponseB = Double.parseDouble(classparticipationGradeB);
                if(cpResponseB < 60 || cpResponseB > 100){
                    System.out.println("Invalid Grade!");
                }else{
                    break;
                }
            }else if(classparticipationGradeB.isBlank()){
                System.out.println("Input is required!");
            }else{
                System.out.println("Invalid Input!");
            }
        }
            while(!validation){
                System.out.println("Quiz Grade:");
                quizGradeB = sc.nextLine();
                if(checkNum(quizGradeB)){
                    qgResponseB = Double.parseDouble(quizGradeB);
                    if(qgResponseB < 60 || qgResponseB > 100){
                        System.out.println("Invalid Grade!");
                    }else{
                        break;
                    }
                }else if(quizGradeB.isBlank()){
                    System.out.println("Input is required!");
                }else{
                    System.out.println("Invalid Input!");
            }
        }      
        while(!validation){
            System.out.println("Exam Grade:");
            examGradeB = sc.nextLine();
            if(checkNum(examGradeB)){
                egResponseB = Double.parseDouble(examGradeB);
                if(egResponseB < 60 || egResponseB > 100){
                    System.out.println("Invalid Grade!");
                }else{
                    break;
                }
            }else if(examGradeB.isBlank()){
                System.out.println("Input is required!");
            }else{
                System.out.println("Invalid Input!");
            }
        }   
        System.out.println("Record successfully saved.");
        runChoices();
    }

    public static void records(){

        System.out.println(lastname + ", " + firstname + " " + middleInitial + ".");

    }
    public static void recordsGrades(){


        prelimGrd = (0.05 * attresponse) + (.15 * cpResponse) + (.3 * qgResponse) + (.5 * egResponse);
        System.out.println("\tPrelim Grade: " + prelimGrd);
        System.out.println("\t\tAtt.: " + attresponse + ", " + "CP: " + cpResponse + ", " + "Quiz: " + qgResponse + ", " + "Exam: " + egResponse);

        midtermGrd = (0.05 * attresponseA) + (.15 * cpResponseA) + (.3 * qgResponseA) + (.5 * egResponseA);
        System.out.println("\tMidterm Grade: " + midtermGrd);
        System.out.println("\t\tAtt.: " + attresponseA + ", " + "CP: " + cpResponseA + ", " + "Quiz: " + qgResponseA + ", " + "Exam: " + egResponseA);

        finalGrd =  (0.05 * attresponseB) + (.15 * cpResponseB) + (.3 * qgResponseB) + (.5 * egResponseB);
        System.out.println("\tFinal Grade: " + finalGrd);
        System.out.println("\t\tAtt.: " + attresponseB + ", " + "CP: " + cpResponseB + ", " + "Quiz: " + qgResponseB + ", " + "Exam: " + egResponseB);

        semesterGrd = (0.25 * prelimGrd) + (0.25 * midtermGrd) + (0.5 * finalGrd);
        System.out.println("\tSemester Grade: " + semesterGrd + "(" + charStatus() + ")" + " - " + strStatus());
    }

    public static void runViewRecords(){

        System.out.println("====================RECORDS====================");
        
        records();
        recordsGrades();
    }
    
}

