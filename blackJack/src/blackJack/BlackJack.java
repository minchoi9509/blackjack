package blackJack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackJack {

	public void play() throws IOException {
		
		System.out.println("-------------BlackJack-------------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		Rule rule = new Rule();
		CardDeck cardDeck = new CardDeck(); 
		
		initGame(cardDeck, gamer, dealer); 
		playingGame(br, cardDeck, gamer, dealer, rule); 
		
	}
	
	private void playingGame(BufferedReader br, CardDeck cardDeck, Gamer gamer, Dealer dealer, Rule rule) throws IOException {
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.hit 2.stand 0.Close");
			String answer = br.readLine();
			
			if(answer.equals("1")) {
				// 게이머에게 한장 줌
				Card card = cardDeck.splitCard();
				gamer.getCard(card);
				dealer.printCards();
				gamer.printCards();
				
				if(rule.isBust(gamer, gamer.getSum())) {
					break; 
				}
				
			}else if(answer.equals("2")){
				// 딜러 합 확인 뒤 승패 결정
				dealer.checkDealerCards(cardDeck);
				dealer.printCards("last");
				gamer.printCards();
				
				if(rule.isBust(dealer, dealer.getSum())) {
					break;
				}else if(rule.isBust(gamer, gamer.getSum())) {
					break;
				}else {
					rule.getWinner(dealer.getSum(), gamer.getSum());
					break; 
				}				
				
			}else {
				// 게임 종료
				break;
			}
			System.out.println("----------------------------");
				
		}
	}
	
	private static final int INIT_RECEIVE_CARD_CNT = 2;
	private void initGame(CardDeck cardDeck, Gamer gamer, Dealer dealer) {
		for(int i = 0; i < INIT_RECEIVE_CARD_CNT; i++) {
			Card card = cardDeck.splitCard();
			gamer.getCard(card);
			
			Card card2 = cardDeck.splitCard();
			dealer.getCard(card2);
		}
		
		dealer.printCards();
		gamer.printCards();
	}

}
