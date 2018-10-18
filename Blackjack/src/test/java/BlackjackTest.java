import static org.junit.Assert.*;

import org.junit.Test;

public class BlackjackTest {
	
	
	@Test
	public void Test() {
		Blackjack blackjack = new Blackjack();
		
		assertEquals(20, blackjack.play(20,22)); 	
		assertEquals(20, blackjack.play(22,20)); 
		assertEquals(20, blackjack.play(19,20)); 
		assertEquals(20, blackjack.play(20,19)); 
		assertEquals(0, blackjack.play(22,22));
		
	}
	
	

}
