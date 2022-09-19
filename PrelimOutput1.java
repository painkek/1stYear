import java.util.Scanner;

public class PrelimOutput1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double km;
		double m;
		double cm;
		double ft;
		double in;
		double mm;
		
		
		System.out.println("----------km to other units----------");
		System.out.println("Enter the distance in kilometers:");
		km = input.nextDouble();
		
		m = km * 1000;
		ft = km * 3280.84;
		in = km * 39370.1;
		cm = km * 100000;
		mm = km * 1000000;
		
		System.out.println("\t" + km + "km" + " = " + m + "m");
		System.out.println("\t" + km + "km" + " = " + ft + "ft");
		System.out.println("\t" + km + "km" + " = " + in + "in");
		System.out.println("\t" + km + "km" + " = " + cm + "cm");
		System.out.println("\t" + km + "km" + " = " + mm + "mm");
		
		
		System.out.println("----------m to other units----------");
		System.out.println("Enter the distance in meters:");
		m = input.nextDouble();
		
		km = m * 0.001;
		ft = m * 3.28084;
		in = m * 39.3701;
		cm = m * 100;
		mm = m * 1000;
		
		System.out.println("\t" + m + "m" + " = " + km + "km");
		System.out.println("\t" + m + "m" + " = " + ft + "ft");
		System.out.println("\t" + m + "m" + " = " + in + "in");
		System.out.println("\t" + m + "m" + " = " + cm + "cm");
		System.out.println("\t" + m + "m" + " = " + mm + "mm");
		
		
		System.out.println("----------ft to other units----------");
		System.out.println("Enter the distance in feet:");
		ft = input.nextDouble();
		
		km = ft * 0.0003048;
		m = ft * 0.3048;
		in = ft * 12;
		cm = ft * 30.48;
		mm = ft * 304.8;
		
		System.out.println("\t" + ft + "ft" + " = " + km + "km");
		System.out.println("\t" + ft + "ft" + " = " + m + "m");
		System.out.println("\t" + ft + "ft" + " = " + in + "in");
		System.out.println("\t" + ft + "ft" + " = " + cm + "cm");
		System.out.println("\t" + ft + "ft" + " = " + mm + "mm");
		
		
		System.out.println("----------in to other units----------");
		System.out.println("Enter the distance in inches:");
		in = input.nextDouble();
		
		km = in / 39370;
		m = in / 39.37;
		ft = in / 12;
		cm = in * 2.54;
		mm = in * 25.4;
		
		System.out.println("\t" + in + "in" + " = " + km + "km");
		System.out.println("\t" + in + "in" + " = " + m + "m");
		System.out.println("\t" + in + "in" + " = " + ft + "ft");
		System.out.println("\t" + in + "in" + " = " + cm + "cm");
		System.out.println("\t" + in + "in" + " = " + mm + "mm");
		
		
		System.out.println("----------cm to other units----------");
		System.out.println("Enter the distance in centimeters:");
		cm = input.nextDouble();
		
		km = cm / 100000;
		m = cm / 100;
		ft = cm / 30.48;
		in = cm / 2.54;
		mm = cm * 10;
		
		System.out.println("\t" + cm + "cm" + " = " + km + "km");
		System.out.println("\t" + cm + "cm" + " = " + m + "m");
		System.out.println("\t" + cm + "cm" + " = " + ft + "ft");
		System.out.println("\t" + cm + "cm" + " = " + in + "in");
		System.out.println("\t" + cm + "cm" + " = " + mm + "mm"); 
		
		
		System.out.println("----------mm to other units----------");
		System.out.println("Enter the distance in millimeters:");
		mm = input.nextDouble();
		
		km = mm * 1000;
		m = mm / 1000;
		ft = mm / 305;
		in = mm / 2.54;
		cm = mm / 10;
		
		System.out.println("\t" + mm + "mm" + " = " + km + "km");
		System.out.println("\t" + mm + "mm" + " = " + m + "m");
		System.out.println("\t" + mm + "mm" + " = " + ft + "ft");
		System.out.println("\t" + mm + "mm" + " = " + in + "in");
		System.out.println("\t" + mm + "mm" + " = " + cm + "cm");
		
		System.out.println("-------------------------------------");
		
		
		
		

	}

}
