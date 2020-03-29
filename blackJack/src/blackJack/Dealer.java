package blackJack;

import java.util.Stack;

public class Dealer implements Player {
	
	private Stack<Card> deck;
	
	public Dealer() {
		deck = new Stack<Card>(); 
	}

	@Override
	public void getCard(Card card) {
		this.deck.add(card);
		
	}

	@Override
	public void printCards() {
		StringBuilder sb = new StringBuilder();
		sb.append("Dealer's Card : ");
		
		for(int i = 0; i < deck.size(); i++) {
			if (i == 0) {
				sb.append("(?) ");
			}else {
				sb.append(deck.get(i).toString());
				sb.append(" "); 
			}
		}
		
		System.out.println(sb.toString());
	}
	
	// 합 17 미만인 경우 이상으로 만들기
//	public ArrayList<Card> dealerGetCard(int dealerSum, ArrayList<Card> deck, ArrayList<Card> dealerCard) {
//		Dealer dealer = new Dealer(); 
//		Rule rule = new Rule(); 
//		int sum = dealerSum; 
//		
//		while(sum < 17) {
//			Card card = dealer.getCard(deck);
//			dealerCard.add(card);
//			sum = rule.getSum(dealerCard);
//		}
//		
//		return dealerCard; 
//	}
	
}
