import java.util.*;
public class Quiz1 {

	 public static void main(String[] Strings) {

	        Scanner sc=new Scanner(System.in);
	        
	        double feet,inches, totalinches, kg, f, m;
	        

	        System.out.println("Enter height in feet and inches,");
	        System.out.print("Feet: ");
	        feet = sc.nextDouble();

	        System.out.print("Inches: ");
	        inches = sc.nextDouble();

	        System.out.print("Enter weight in kg: ");
	        kg = sc.nextDouble();
	        
	        totalinches = inches+((feet-5)*12);
	        
	        f = kg + (5*totalinches);
	        m = kg + (6*totalinches);
	        
	        System.out.println("Ideal weight for female: "+f);
	        System.out.print("Ideal weight for male: "+m);
	        sc.close();
	    }
   }