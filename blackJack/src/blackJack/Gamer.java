package blackJack;

import java.util.ArrayList;

public class Gamer {

	// hit
	public Card hit(Dealer dealer, ArrayList<Card> deck) {
		Card card = dealer.getCard(deck);
		return card;
	}

}
