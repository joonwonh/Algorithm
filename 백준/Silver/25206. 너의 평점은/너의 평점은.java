import java.util.Scanner;

public class Main {

	public static double calRank(String rank)	{
		double result=0.0;
		while(true)	{
			switch(rank)	{
			case "A+":
				result = 4.5;
				break;
				
			case "A0":
				result = 4.0;

				break;
			case "B+":
				result = 3.5;
				break;
				
			case "B0":
				result = 3.0;
				break;
				
			case "C+":
				result = 2.5;
				break;
				
			case "C0":
				result = 2.0;
				break;
				
			case "D+":
				result = 1.5;
				break;
				
			case "D0":
				result = 1.0;
				break;
				
			case "F":
				result = 0.0;
				break;
				
				default:
					System.out.println("잘못된 값입니다.");
					
					break;
			}
			return result;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		double scoreSum = 0.0;
		double gradeSum = 0.0;
		
		for(int i=0; i<20; i++)	{
			String subject = sc.next();
			double grade = sc.nextDouble();
			String rank = sc.next();
			if(rank.equals("P"))	{
				continue;
			}
			double resultRank = calRank(rank);
			double score = grade * resultRank;
			gradeSum += grade;
			scoreSum += score;
		}
		System.out.println(scoreSum/gradeSum);
	}
}