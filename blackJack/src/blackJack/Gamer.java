package blackJack;

import java.util.Stack;

public class Gamer implements Player {

	private Stack<Card> deck;
	
	public Gamer() {
		deck = new Stack<Card>(); 
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
		sb.append("보유 카드 : ");
		
		for(Card card : deck) {
			sb.append(card.toString());
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
	}

}
