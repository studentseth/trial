
public class Blackjack {

	public int play(int a, int b) {
		if (a<21 && b>21) {
			return a;
	}
	else if (a<21 && b>21) {
		return a;
		
	}
	else if (a>21 && b<21) {
		return b;
	}
	else if(a<21 && b<21 && b<=a) {
		return a;
	}
	else if(a<21 && b<21 && a<=b) {
	return b;
	}
	else {
		return 0;
	}
    }
}


