package blackJack;

import java.util.ArrayList;

public class Dealer {

	// 카드 deck 생성하기 
	public ArrayList<Card> setCardDeck() {
		
		ArrayList<Card> deck = new ArrayList<Card>();
		
		for(int i = 0; i < 52; i ++) {
			Card card = new Card(); 
			switch(i%4) {
			case 0 :
				card.setPattern("hearts");
				break;
			case 1 :
				card.setPattern("spades");
				break;
			case 2 :
				card.setPattern("diamonds");
				break;
			case 3 :
				card.setPattern("clubs");
				break;
			}
			
			switch(i%13) {
			case 1 :
				card.setNumber("A");
				break;
			case 2 :
				card.setNumber("2");
				break;
			case 3 :
				card.setNumber("3");
				break;
			case 4 :
				card.setNumber("4");
				break;
			case 5 :
				card.setNumber("5");
				break;
			case 6 :
				card.setNumber("6");
				break;
			case 7 :
				card.setNumber("7");
				break;
			case 8 :
				card.setNumber("8");
				break;
			case 9 :
				card.setNumber("9");
				break;
			case 10 :
				card.setNumber("10");
				break;
			case 11 :
				card.setNumber("J");
				break;
			case 12 :
				card.setNumber("Q");
				break;
			case 0 :
				card.setNumber("K");
				break;				
			}
			
			deck.add(card);
		}
		
		return deck; 
	}
	
	// 카드 나눠 주기 
	public Card getCard(ArrayList<Card> deck) {
		
		int size = deck.size();
		int num = (int)(Math.random() * size);
		Card card = deck.get(num);
		deck.remove(num);
		
		return card;
	}
	
	// 합 17 미만인 경우 이상으로 만들기
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
