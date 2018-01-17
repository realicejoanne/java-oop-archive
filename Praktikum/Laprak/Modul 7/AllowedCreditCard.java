public class AllowedCreditCard {
	protected final String card;
	public final static AllowedCreditCard VISA = new AllowedCreditCard("VISA");
	public final static AllowedCreditCard MASTER_CARD = new AllowedCreditCard("MASTER_CARD");
	public final static AllowedCreditCard AMERICAN_EXPRESS = new AllowedCreditCard("AMERICAN_EXPRESS");
	
	private AllowedCreditCard(String str){
		card = str;
	}
	
	public String getName(){
		return card;
	}
}
/*enum AllowedCreditCard {VISA, MASTER_CARD, AMERICAN_EXPRESS};
AllowedCreditCard visa = AllowedCreditCard.VISA;*/