
public class BiggerTakesGameProcessor {

	public int evaluate(Card card1, Card card2) {
		
		if (card1.getValue() == card2.getValue()) {
			System.out.println("Stejnì velká hodnota");
			return 0;
		}
		if (card1.getValue() > card2.getValue()) {
			System.out.println("karta 1 je vìtší");
			return -1;
		}
		else {
			System.out.println("karta 2 je vìtší");
			return +1;
		}
		


	}

}