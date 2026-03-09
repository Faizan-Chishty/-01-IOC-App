package in.LegendOp.beans;

public class DebitCardPayment implements Ipayment {
	
	
public DebitCardPayment() {
	System.out.println("Hello From Debit");
}
	@Override
	public boolean payBill(double amt) {
		return false;
	}

}
