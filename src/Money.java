
public class Money {
	protected int amount ;
	protected String currency;

	Money times(int multiplier){
		return new Money(amount*multiplier,currency);
	}

	@Override
	public String toString() {
		return amount + ""+ currency;
	}

	public Money(int amount,String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return amount == money.amount
				&& currency().equals(money.currency);
	}
	static Money dollar(int amount){
		return new Money(amount,"USD");
	}
	static Money franc(int amount){
		return new Money(amount,"CHF");
	}
	String currency(){
		return currency;
	}

}