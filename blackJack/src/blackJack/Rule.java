package blackJack;

import java.util.ArrayList;

public class Rule {

	// ī�� ���
	public int printCard(String who, ArrayList<Card> deck) {
		
		Rule rule = new Rule(); 
		int sum = 0; 
		for(int i = 0; i < deck.size(); i++) {
			
			if(i == 0){
				if(who.equals("dealer")) {
					System.out.print("���� ī�� : ? ");	
				}else {
					System.out.print("���̸� ī�� : (" + deck.get(0).getPattern() + ", " + deck.get(0).getNumber() + ") ");
				}
			}else {
				System.out.print("(" + deck.get(i).getPattern() + ", " + deck.get(i).getNumber() + ") ");
				if(who.equals("dealer")) {
					System.out.println();
				}
			}
			
			if(i == deck.size() - 1 && who.equals("gamer")) {
				sum = rule.getSum(deck);
				System.out.println("���� : " + sum);
			}
			
		}
		
		return sum; 
		
	}
	
	// ī�� �� ���ϱ�
	public int getSum(ArrayList<Card> deck) {

		int sum = 0;
		
		for(int i = 0; i < deck.size(); i++) {
			String number = deck.get(i).getNumber();
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
	
	// ����Ʈ
	public boolean isBust(String who, int sum) {
		if(sum > 21) {
			System.out.println(who + " Bust (���� : " + sum + ")");
			return true;
		}else {
			return false; 
		}
	}
	
	// ����Ʈ
	public boolean isBust(int sum) {
		if(sum > 21) {
			return true;
		}else {
			return false; 
		}
	}
	
	// ���� 21�̶� ������� ��
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
		
		System.out.println(str + "(���� ���� : " + dealerSum + ", ���̸� ���� : " + gamerSum + ")");

	}
}
