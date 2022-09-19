import java.util.Scanner;

public class PrelimOutput2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String firstName, middleInitial, lastName, fullName; //name
		
		System.out.println("-----------NAME-----------");
		System.out.println("First Name:");
		firstName = input.nextLine();
		System.out.println("Middle Initial:");
		middleInitial = input.nextLine();
		System.out.println("Last Name:");
		lastName = input.nextLine();
	
		System.out.println("----------PRELIM----------");
		System.out.println("Attendance Grade:");
		double attendanceGrade = input.nextDouble();
		System.out.println("Class Participation Grade:");
		double participationGrade = input.nextDouble();
		System.out.println("Quiz Grade:");
		double quizGrade = input.nextDouble();
		System.out.println("Exam Grade:");
		double examGrade = input.nextDouble();
	
		attendanceGrade = 0.05 * attendanceGrade;
		participationGrade = 0.15 * participationGrade;
		quizGrade = 0.30 * quizGrade;
		examGrade = 0.5 * examGrade;
		
		double prelimGrade = attendanceGrade + participationGrade + quizGrade + examGrade;
		
		System.out.println("----------MIDTERM---------");
		System.out.println("Attendance Grade:");
		double attendanceGrade1 = input.nextDouble();
		System.out.println("Class Participation Grade:");
		double participationGrade1 = input.nextDouble();
		System.out.println("Quiz Grade:");
		double quizGrade1 = input.nextDouble();
		System.out.println("Exam Grade:");
		double examGrade1 = input.nextDouble();
		
		attendanceGrade1 = 0.05 * attendanceGrade1;
		participationGrade1 = 0.15 * participationGrade1;
		quizGrade1 = 0.30 * quizGrade1;
		examGrade1 = 0.5 * examGrade1;
		
		double midtermGrade = attendanceGrade1 + participationGrade1 + quizGrade1 + examGrade1;
		
		System.out.println("-----------FINAL----------");
		System.out.println("Attendance Grade:");
		double attendanceGrade2 = input.nextDouble();
		System.out.println("Class Participation Grade:");
		double participationGrade2 = input.nextDouble();
		System.out.println("Quiz Grade:");
		double quizGrade2 = input.nextDouble();
		System.out.println("Exam Grade:");
		double examGrade2 = input.nextDouble();
		
		attendanceGrade2 = 0.05 * attendanceGrade2;
		participationGrade2 = 0.15 * participationGrade2;
		quizGrade2 = 0.30 * quizGrade2;
		examGrade2 = 0.5 * examGrade2;
		
		double finalGrade = attendanceGrade2 + participationGrade2 + quizGrade2 + examGrade2;
		
		double semesterGrade;
		semesterGrade = (0.25 * prelimGrade) + (0.25 * midtermGrade) + (0.5 * finalGrade);
		
		System.out.println("----------SUMMARY---------");
		fullName = firstName + " " + middleInitial + ". " + lastName;
		System.out.println("Name: " + fullName);
		System.out.println("Prelim Grade: " + prelimGrade);
		System.out.println("Midterm Grade: " + midtermGrade);
		System.out.println("Final Grade: " + finalGrade);
		
		String semGrade = ("Semester Grade: " + semesterGrade);
		char remarks;
		
		if(semesterGrade >= 95 && semesterGrade <= 100) {
			System.out.println(semGrade + "(" + (remarks = 'A') + ")");
		}else if(semesterGrade >= 90 && semesterGrade < 95) {
			System.out.println(semGrade + "(" + (remarks = 'B') + ")");
		}else if(semesterGrade >= 85 && semesterGrade < 90) {
			System.out.println(semGrade + "(" + (remarks = 'C') + ")");
		}else if(semesterGrade >= 80 && semesterGrade < 85) {
			System.out.println(semGrade + "(" + (remarks = 'D') + ")");
		}else if(semesterGrade >= 75 && semesterGrade < 80) {
			System.out.println(semGrade + "(" + (remarks = 'E') + ")");
		}else if(semesterGrade >= 60 && semesterGrade < 75) {
			System.out.println(semGrade + "(" + (remarks = 'F') + ")");
		}
		
		if(semesterGrade >= 75 && semesterGrade <= 100) {
			System.out.println("Status: PASSED");
		}else {
			System.out.println("Status: FAILED");
		}
	
		
		System.out.println("--------------------------");
	}

}
