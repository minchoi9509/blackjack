package blackJack;

import java.util.Stack;

public class Gamer implements Player {

	private Stack<Card> deck;
	private static final String NAME = "Gamer";
	
	public Gamer() {
		deck = new Stack<Card>(); 
	}
	
	public String getName() {
		return NAME;
	}
	
	// 카드 받음
	@Override
	public void getCard(Card card) {
		this.deck.add(card); 
	}
	
	// 카드 오픈
	@Override
	public void printCards() {
		StringBuilder sb = new StringBuilder();
		sb.append("Gamer's Card : ");
		
		for(Card card : deck) {
			sb.append(card.toString());
			sb.append(" ");
		}
		
		System.out.println(sb.toString() + " 총합 : " + this.getSum());
		
	}
	
	@Override
	public int getSum() {
		int sum = 0; 
		for(Card card : deck) {
			sum += card.getPoint();
		}
		return sum; 
	}

}
