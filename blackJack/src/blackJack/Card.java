package blackJack;

public class Card {

	private String pattern;
	//hearts, spades, diamonds, clubs
	private String denomination;
	
	public Card(String pattern, String denomination) { 
		this.pattern = pattern;
		this.denomination = denomination; 
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

}
