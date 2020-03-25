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

//		dealerCard.add(dealer.getCard(deck));
//		dealerCard.add(dealer.getCard(deck));
//		gamerCard.add(dealer.getCard(deck));
//		gamerCard.add(dealer.getCard(deck));

		int dealerSum = rule.printCard("dealer", dealerCard);
		int gamerSum = rule.printCard("gamer", gamerCard);

		System.out.println("\n---------------------------------");

//		while (!(rule.isBust(gamerSum))) {
//
//			System.out.println("1.HIT 2.STAND");
//
//			Scanner sc = new Scanner(System.in);
//
//			// hit 선택한 경우
//			if (sc.nextInt() == 1) {
//				Card card = gamer.hit(dealer, deck);
//				gamerCard.add(card);
//				gamerSum = rule.printCard("gamer", gamerCard);
//				rule.isBust("Gamer", gamerSum);
//			} else {
//				// stand 선택한 경우
//				dealerCard = dealer.dealerGetCard(dealerSum, deck, dealerCard);
//				dealerSum = rule.getSum(dealerCard); 
//				if(rule.isBust("Dealer", dealerSum)) {
//					break; 
//				}
//				rule.whoWin(dealerSum, gamerSum);
//				break;
//			}
//
//		}

	}

}
