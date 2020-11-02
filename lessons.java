import java.util.Scanner;
public class lessons{
public static void main(String args[]){

	String day;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Choose a day");
	day =sc.next();
	
			switch (day){
				case:"monday":
				case:"wednesday":
				System.out.println("Evening Classes");break;
		
				case:"Tuesday":
				case:"Thursday":
				case:"Friday":
				System.out.println("No classes");break;
		
				case:"Saturday":
				System.out.println("Morning class");break;
		
				case:"Sunday":
				System.out.println("Sunday!!");break;
	
				default:
				System.out.println("Invalid");break;
			}
		}
	}