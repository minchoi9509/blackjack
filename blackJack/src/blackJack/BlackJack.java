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
		playingGame(br, cardDeck, gamer); 
		
	}
	
	private void playingGame(BufferedReader br, CardDeck cardDeck, Gamer gamer) throws IOException {
		while(true) {
			System.out.println("1.hit 2.stand 0.Close");
			String answer = br.readLine();
			if(answer.equals("1")) {
				// 게이머에게 한장 줌
				Card card = cardDeck.splitCard();
				gamer.getCard(card);
				gamer.printCards();
			}else if(answer.equals("2")){
				// 승패 확인
			}else {
				// 게임 종료
				break;
			}
				
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
