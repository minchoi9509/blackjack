package blackJack;

import java.util.Collections;
import java.util.Stack;

public class CardDeck {
	
	private static Stack<Card> deck; 
	private static String[] PATTERNS = {"hearts", "spades", "diamonds", "clubs"};
	private static int CARD_CNT = 13; 
	

	public CardDeck() {
		deck = this.generatedDeck();
		Collections.shuffle(deck);
	}
	
	private Stack<Card> generatedDeck() {
		Stack<Card> deck = new Stack<Card>();
		
		for(String pattern : PATTERNS) {
			for(int i = 1; i <= CARD_CNT; i++) {
				
				String number = ""; 
				int point = 0; 
				
				switch(i) {
				case 1 :
					number = "A"; 
					break;
				case 11 :
					number = "J";
					break;
				case 12 :
					number = "Q";
					break;
				case 13 :
					number = "K";
					break;
				default :
					number = Integer.toString(i);
					break;
				}
				
				if(i == 1) {
					point = 1;
				}else if(i >= 11) {
					point = 10;
				}else {
					point = i; 
				}
				
				Card card = new Card(pattern, number, point); 
				deck.add(card); 			
			}
		}
		
		return deck; 
	}
	
	public Card splitCard() {
		return deck.pop();
	}
	
	@Override 
	public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Card card : deck){
            sb.append(card.toString());
            sb.append("\n");
        }

        return sb.toString();		
	}
	
    public Stack<Card> getDeck() {
        return deck;
    }

   
}
