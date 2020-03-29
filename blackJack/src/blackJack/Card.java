package blackJack;

public class Card {

	private String pattern;
	//hearts, spades, diamonds, clubs
	private String denomination;
	private int point;
	
	public Card(String pattern, String denomination, int point) { 
		this.pattern = pattern;
		this.denomination = denomination; 
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "(" + pattern + ", " + denomination + ")";
	}
	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}
