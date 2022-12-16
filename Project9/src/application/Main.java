package application;
	/*
	 * Sai Sree battula
	 * Cs501
	 * JavaFx application that will allow user to choose planet
	 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;




public class Main{

	public static void main(String[] args) {
		System.out.print("heello");
		
		LinkedList<Student> ls= new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter grade earned by student to display :");
		
		
		
		while(true) {
			String in = sc.nextLine();
			if(in.equalsIgnoreCase("A")||in.equalsIgnoreCase("A-")||
					in.equalsIgnoreCase("B")||in.equalsIgnoreCase("B+")||
					in.equalsIgnoreCase("C")||in.equalsIgnoreCase("C+")||in.equalsIgnoreCase("C-")
					||in.equalsIgnoreCase("D")||in.equalsIgnoreCase("D-")||in.equalsIgnoreCase("D+")
					||in.equalsIgnoreCase("F")) {
				
				//getScores(in);
				System.out.println("correct letter grade entered");
				break;
			}else {
				System.out.println("Incorrect letter grade entered, try afain :");
			}
		}
		
		
		
		
	}

	private static void getScores(String in) {
		// TODO Auto-generated method stub
		List<Student> ootput= new ArrayList();
		if(in.equalsIgnoreCase("a")) {
			for (Student s : Stutentlist) {
	            if(s.getAvg()>94) {
	            	ootput.add(s);
	            }
	        }
		}
		if(in.equalsIgnoreCase("b")) {
			for (Student s : Stutentlist) {
	            if(s.getAvg()>94) {
	            	ootput.add(s);
	            }
	        }
		}
		
	}
}
