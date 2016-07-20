import java.util.Scanner;

public class DaysOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("enter month");
 Scanner inputReader = new Scanner(System.in);
 int month=inputReader.nextInt();
 switch(month){
 case 1:
	 System.out.println("january month 31 days");
	 break;
 case 2:
	 System.out.println("febrauary month 29 days");
	 break;
	 
	 case 3:
		 System.out.println("march month 31 days");
		 break;
	 case 4:
		 System.out.println("april month 30 days");
		 break;
	 case 5:
		 System.out.println("may month 31 days");
		 break;
	 case 6:
		 System.out.println("june month 30 days");
		 break;
	 case 7:
		 System.out.println("july month 31 days");break;
	 case 8:
		 System.out.println("august month 30 days");
		 break;
	 default:
		 System.out.println("invalid"); 
		 break;
	 
 }
 
 
	}

}
