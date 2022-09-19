import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Finals {

     //prelim grade
     static String attendanceGrade = "", classparticipationGrade = "", quizGrade = "", examGrade = "";
     static double attresponse = 0, cpResponse = 0, qgResponse = 0, egResponse = 0;
 
     //midterm grade
     static String attendanceGradeA = "", classparticipationGradeA = "", quizGradeA = "", examGradeA = "";
     static double attresponseA = 0, cpResponseA = 0, qgResponseA = 0, egResponseA = 0;
 
     //finals grade
     static String attendanceGradeB = "", classparticipationGradeB = "", quizGradeB = "", examGradeB = "";
     static double attresponseB = 0, cpResponseB = 0, qgResponseB = 0, egResponseB = 0;

     //overall computation
     static double prelimGrd, midtermGrd, finalGrd, semesterGrd;


    static boolean validation = false;
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

    private static boolean stillAddingRecord = true;
    static double semesterGrade ;

    public static void main(String[] args) throws Exception {

        String firstName = "";
        char middleInitial = ' ';
        String lastName = "";
        Person person = new Person();

        char choice = ' ';
        String temporaryString;
        Scanner scanner = new Scanner(System.in);
        File file = new File("Codes\\files\\students\\Readme.txt");

        do {
            FileFactory.readFile(file);
            System.out.print(">>: ");
            choice = scanner.nextLine().toLowerCase().charAt(0);

            if (choice == 'a' || choice == 'b' ||
                choice == 'c' || choice == 'd') {
                if (choice == 'a') {
                    File student;
                    while (stillAddingRecord) {
                        System.out.println("<-----------------STUDENT------------------->");
                        System.out.print("Enter First Name : ");
                        firstName = scanner.nextLine().trim();
                        System.out.print("Enter Middle Name: ");
                        middleInitial = scanner.nextLine().toUpperCase().charAt(0);
                        System.out.print("Enter Last Name  : ");
                        lastName = scanner.nextLine().trim();
               
                        person.setFirstName(firstName);
                        person.setMiddleInitial(middleInitial);
                        person.setLastName(lastName);

                        //to get the info or search
                        String fileName = person.getFirstName().replaceAll("\\s", "") + person.getMiddleInitial() + person.getLastName();

                        student = new File("Codes\\files\\students\\" + fileName + ".txt");
                        //grades method
                        Grades();

                                boolean isSuccess = student.createNewFile();
                                FileFactory.writeToATextFile(student, person.toString());
                                if (isSuccess) {
                                    System.out.println("--- STUDENT ADDED TO THE RECORD ---");
                                }
                            else if (student.exists()){
                                System.out.println("->> STUDENT ALREADY EXIST!");
                                System.out.println("-- ADD AGAIN? --");
                            }
                            tryAgainPrompt(scanner);
                        }
                    }
                    else if (choice == 'b') {
                        System.out.println("->> Choose a File");
                        System.out.print("Enter Full Name: ");
                        temporaryString = scanner.nextLine().trim();
                        FileFactory.readFile(new File("Codes\\files\\students\\" + temporaryString.replaceAll("\\s", "") + ".txt"));
                    }
                    else if (choice == 'c') {
                        System.out.println("->> Delete A File");
                        System.out.print("Enter Full Name: ");
                        temporaryString = scanner.nextLine().trim();
                        String status = FileFactory.removeStudent(new File("Codes\\files\\students\\" + temporaryString.replaceAll("\\s", "") + ".txt"));
                        System.out.println(status);
                    }else if (choice == 'd'){
                        System.out.println("Notice: The program has been Terminated. Thank you!");
                    }
                }
            } while (choice != 'd'); 
        }
        private static void Grades() {
            
           
            Scanner sc = new Scanner(System.in);

            System.out.println("<-------------------PRELIM-------------------->");
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

            System.out.println("<-------------------MIDTERM------------------->");
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

            System.out.println("<--------------------FINAL-------------------->");
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
        runRecords();
    }
    public static void runRecords(){
        
        prelimGrd = (0.05 * attresponse) + (.15 * cpResponse) + (.3 * qgResponse) + (.5 * egResponse);
        midtermGrd = (0.05 * attresponseA) + (.15 * cpResponseA) + (.3 * qgResponseA) + (.5 * egResponseA);
        finalGrd =  (0.05 * attresponseB) + (.15 * cpResponseB) + (.3 * qgResponseB) + (.5 * egResponseB);
        semesterGrd = (0.25 * prelimGrd) + (0.25 * midtermGrd) + (0.5 * finalGrd);
    }
        private static void tryAgainPrompt(Scanner scanner) {

            char addAnotherRecord;
            System.out.println("DO YOU WANT TO ADD ANOTHER RECORD?");
            System.out.println("Y : N");
            System.out.print(": ");
            addAnotherRecord = scanner.nextLine().toUpperCase().charAt(0);
            if (addAnotherRecord == 'N') {
                stillAddingRecord = false;
            }
            else if (addAnotherRecord == 'Y') {
                System.out.println();
            }
            else {
                System.out.println("INVALID, RETURNING TO MAIN SELECTION");
                stillAddingRecord = false;
            }
        }
        static class Person {

            private String firstName;
            private char middleInitial;
            private String lastName;

            public Person() {
                this.firstName = "";
                this.middleInitial = ' ';
                this.lastName = "";
            }

            public Person(String firstName, char middleInitial, String lastName) {

                this.firstName = firstName;
                this.middleInitial = middleInitial;
                this.lastName = lastName;

            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public char getMiddleInitial() {
                return middleInitial;
            }

            public void setMiddleInitial(char middleInitial) {
                this.middleInitial = middleInitial;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String toString() {
                return  "FirstName     : " + firstName     + "\n" +
                        "Middle Initial: " + middleInitial + "\n" +
                        "LastName      : " + lastName      + "\n" +
                        "Full Name     : " + firstName + " " + middleInitial + ". " + lastName + "\n" +
                        "Semester Grade: " + semesterGrd;                     
            } 
        }
    }
    final class FileFactory {
        /**
        * Cannot create an object
        */
        private FileFactory() {}

        public static void writeToATextFile(File fileToSave, String whatToWrite) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileToSave));
            bufferedWriter.write(whatToWrite);
            bufferedWriter.flush();
            bufferedWriter.close();
        }

        public static void readFile(File fileToRead) throws FileNotFoundException {
            if (fileToRead.exists() && fileToRead.isFile()) {
                Scanner scanner = new Scanner(fileToRead);
                while (scanner.hasNextLine()) {
                    String eachLine = scanner.nextLine();
                    System.out.println(eachLine);
                }
                scanner.close();
            }
            else    {
                System.out.println("FILE DOES NOT EXIST");
        }
    }
    public static String removeStudent(File file) {
        if (file.exists()) {
            boolean success = file.delete();
            if (success)  {
                return "->> REMOVED SUCCESSFULLY";
            }
        }
        else {
            return "DOES NOT EXIST";
        }
        return "ERROR REMOVING";
    }
}