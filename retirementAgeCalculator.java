import java.util.Scanner;
 
public class retirementAgeCalculator {

   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
      String month = "";
   int day = 0;
   int year; 
      
      //Get user birth month, day and year
      System.out.print("Enter the month you were born: ");
      month = in.nextLine();
      System.out.print("Enter the day you were born: ");
      day = in.nextInt();
      System.out.print("Enter the year you were born: ");
      year = in.nextInt();
      
      //Print users 67th brithday
      System.out.print("You will retire on " + month + " " + day + ", ");
      System.out.print(year += 67);
      System.out.print(".");
 
	}








}
