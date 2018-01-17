class AllowedCreditCardTest {
	public static void main(String[] args){
		String card=args[0].toUpperCase();
		if(creditCard.equals(AllowedCreditCard.VISA.getName())){
			System.out.println(creditCard+" is accepted.");
		}
		else if(creditCard.equals(AllowedCreditCard.MASTER_CARD.getName())){
			System.out.println(creditCard+" is accepted.");
		}
		else if(creditCard.equals(AllowedCreditCard.AMERICAN_EXPRESS.getName())){
			System.out.println(creditCard+" is accepted.");
		}
		else {
			System.out.println("Credit card is not valid.");
		}
	}
}