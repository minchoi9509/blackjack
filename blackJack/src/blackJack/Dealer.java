package blackJack;

import java.util.ArrayList;

public class Dealer {
	
	// �� 17 �̸��� ��� �̻����� �����
	public ArrayList<Card> dealerGetCard(int dealerSum, ArrayList<Card> deck, ArrayList<Card> dealerCard) {
		Dealer dealer = new Dealer(); 
		Rule rule = new Rule(); 
		int sum = dealerSum; 
		
		while(sum < 17) {
			Card card = dealer.getCard(deck);
			dealerCard.add(card);
			sum = rule.getSum(dealerCard);
		}
		
		return dealerCard; 
	}
	
}
