package test1230;

public class Card {
	String kind;
	int number;
	static int width=100, height=250;
	
	public String toString() {
		return kind+":"+number+"("+width+")"+"("+height+")";
	}
}
