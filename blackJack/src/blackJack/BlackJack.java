package blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {

	public void play() {
		
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		Rule rule = new Rule();

		ArrayList<Card> dealerCard = new ArrayList<Card>();
		ArrayList<Card> gamerCard = new ArrayList<Card>();

		System.out.println("------------BLACKJACK------------");
		System.out.println("카드를 나누겠습니다.");

		int dealerSum = rule.printCard("dealer", dealerCard);
		int gamerSum = rule.printCard("gamer", gamerCard);

		System.out.println("\n---------------------------------");


	}

}
