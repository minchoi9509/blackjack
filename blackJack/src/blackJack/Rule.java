package blackJack;

public class Rule { 
	
	private static final int BLACKJACK_NUM = 21;
	
	// 승패 확인
	public void getWinner(int dealerSum, int gamerSum) {
		
		int dealerMinus = BLACKJACK_NUM - dealerSum;
		int gamerMinus = BLACKJACK_NUM - gamerSum;
		
		if(dealerMinus > gamerMinus) {
			System.out.println("게이머 승리");
		}else if(dealerMinus == gamerMinus) {
			System.out.println("무승부");
		}else {
			System.out.println("딜러 승리");
		}
	}
	
	// 버스트 확인
	public boolean isBust(Player player, int sum) {
		String name = player.getName();
		if(sum > 21) {
			System.out.println(name + " Bust");
			return true;
		}else {
			return false; 
		}
	}
}