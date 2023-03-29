package chap11_interface.multiinherit;

public class _02_multiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiflexStadium ms = new SeoulMultiflexStadium();
		Stadium sta = new SeoulMultiflexStadium();
		
		sta.getSportsSchedule(2);
		
		
		ms.getSportsSchedule(3);
		int price = ms.getSportsTicketPrice(2);
		ms.getSupportersItem(2);
		ms.getRemainSeat();
		int ticketPrice = ms.getTicketPrice(2);
		
	}

}
