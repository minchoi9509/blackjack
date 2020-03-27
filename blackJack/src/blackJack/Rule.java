package blackJack;

import java.util.ArrayList;

public class Rule {

	// 카드 출력
	public int printCard(String who, ArrayList<Card> deck) {
		
		Rule rule = new Rule(); 
		int sum = 0; 
		for(int i = 0; i < deck.size(); i++) {
			
			if(i == 0){
				if(who.equals("dealer")) {
					System.out.print("딜러 카드 : ? ");	
				}else {
					System.out.print("게이머 카드 : (" + deck.get(0).getPattern() + ", " + deck.get(0).getDenomination() + ") ");
				}
			}else {
				System.out.print("(" + deck.get(i).getPattern() + ", " + deck.get(i).getDenomination() + ") ");
				if(who.equals("dealer")) {
					System.out.println();
				}
			}
			
			if(i == deck.size() - 1 && who.equals("gamer")) {
				sum = rule.getSum(deck);
				System.out.println("총합 : " + sum);
			}
			
		}
		
		return sum; 
		
	}
	
	// 카드 합 구하기
	public int getSum(ArrayList<Card> deck) {

		int sum = 0;
		
		for(int i = 0; i < deck.size(); i++) {
			String number = deck.get(i).getDenomination();
			if(number.equals("A")) {
				sum += 1;
			}else if(number.equals("J") || number.equals("Q") || number.equals("K")) {
				sum += 10;
			}else {
				sum += Integer.parseInt(number);
			}

		}
		
		return sum; 
	}
	
	// 버스트
	public boolean isBust(String who, int sum) {
		if(sum > 21) {
			System.out.println(who + " Bust (총합 : " + sum + ")");
			return true;
		}else {
			return false; 
		}
	}
	
	// 버스트
	public boolean isBust(int sum) {
		if(sum > 21) {
			return true;
		}else {
			return false; 
		}
	}
	
	// 누가 21이랑 가까운지 비교
	public void whoWin(int dealerSum, int gamerSum) {
		int dealer = 21 - dealerSum;
		int gamer = 21 - gamerSum; 
		String str = "Winner is "; 
		if(dealer > gamer) {
			str += "GAMER";
		}else if(dealer == gamer) {
			str = "DRAW "; 
		}else {
			str += "DEALER";
		}
		
		System.out.println(str + "(딜러 총합 : " + dealerSum + ", 게이머 총합 : " + gamerSum + ")");

	}
}