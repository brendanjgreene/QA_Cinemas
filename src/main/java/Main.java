

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int StandardTickets=5, OAPTickets = 0 , StudentTickets= 2 , ChildTickets= 0;
		
		
		System.out.println("Welcome tp QaCinemas");
		
		StandardTicket standardPrice = new StandardTicket();
		int STP = standardPrice.applyDiscount();
		;
		OAPTicket OAP = new OAPTicket();
		int OAp = OAP.applyDiscount();
		 
		StudentTicket StudentPrice = new StudentTicket();
		int SDP = StudentPrice.applyDiscount();
		ChildTicket childPrice = new ChildTicket();
		int CP = childPrice.applyDiscount();
		System.out.println("Todays Prices Standard Price: "+STP+"  OAP Price:"+ OAp+"  Student Price:"+ SDP+"  Child Price:"+ CP);
		System.out.println("How Many Standard Tickets do you want?");
		System.out.println("How Many OAP Tickets do you want?");
		System.out.println("How Many Student Tickets do you want?");	
		System.out.println("How Many Child Tickets do you want?");
		int Total = StandardTickets*STP+OAPTickets*OAp+StudentTickets*SDP+ChildTickets*CP;
			
		System.out.println("The total cast of tickets for this movie is £"+Total);
		}
}