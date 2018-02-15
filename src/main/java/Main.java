import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome tp QaCinemas");
		
		StandardTicket standardPrice = new StandardTicket();
		int STP = standardPrice.applyDiscount();
		OAPTicket OAP = new OAPTicket();
		int OAp = OAP.applyDiscount();
		 
		StudentTicket StudentPrice = new StudentTicket();
		int SDP = StudentPrice.applyDiscount();
		ChildTicket childPrice = new ChildTicket();
		int CP = childPrice.applyDiscount();
		System.out.println("Todays Prices Standard Price: "+STP+"  OAP Price:"+ OAp+"  Student Price:"+ SDP+"  Child Price:"+ CP);
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Standard Tickets do you want?");
		int StandardTickets=sc.nextInt();
		System.out.println("How Many OAP Tickets do you want?");
		int OAPTickets=sc.nextInt();
		System.out.println("How Many Student Tickets do you want?");
		int StudentTickets=sc.nextInt();
		System.out.println("How Many Child Tickets do you want?");
		int ChildTickets=sc.nextInt();
		int Total = StandardTickets*STP+OAPTickets*OAp+StudentTickets*SDP+ChildTickets*CP;
			
		System.out.println("The total cast of tickets for this movie is £"+Total);
		}
}