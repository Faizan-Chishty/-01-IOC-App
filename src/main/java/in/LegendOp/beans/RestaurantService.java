package in.LegendOp.beans;

public class RestaurantService {
	
	public RestaurantService() {
		System.out.println("Heyyy");
	}
	
	Ipayment payment ;
	public RestaurantService(Ipayment payment) {
		this.payment=payment;
	}

}
