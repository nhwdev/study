package test1230;

public class Coin {
	int side = (int)(Math.random()*2);
	
	void flip() {
		side = (int)(Math.random()*2);
		if(side == 0) System.out.println(side + "앞면");
		else System.out.println(side + "뒷면");
	}
}
