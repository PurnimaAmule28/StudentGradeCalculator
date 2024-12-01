package pack1;

import java.util.Scanner;

public class StudentGradeCalculator {
  
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double e;
		double sum;
		double subjects =5;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks obtained in Physics" );
		a=sc.nextDouble();
		System.out.println("Enter the marks obtained in Mathematics" );
		b=sc.nextDouble();
		System.out.println("Enter the marks obtained in Chemistry" );
		c=sc.nextDouble();
		System.out.println("Enter the marks obtained in English" );
		d=sc.nextDouble();
		System.out.println("Enter the marks obtained in Sanskrit" );
		e=sc.nextDouble();
		
		sum=a+b+c+d+e;
		System.out.println("Total marks obtained by student is "+sum);
		
		//calculate percentage
		
		double percentage=(Math.abs(sum/(subjects*100))*100);
		System.out.println("percentage is :"+percentage+"%");
		
		char grade=calculateGrade(percentage);
		System.out.println("Grade : "+grade);
}

	private static char calculateGrade(double percentage) {
		
		if(percentage>=90) {
		return 'A';
		}
		else if(percentage>=80) {
			return 'B';
		}
		else if(percentage>=70) {
			return 'C';
		}
		else if(percentage>=60) {
			return 'D';
		}
		else {
			return 'F';
		}
		
	}
}
