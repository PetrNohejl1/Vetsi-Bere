
public class BiggerTakesGameProcessor {

	public int evaluate(Card card1, Card card2) {
		
		if (card1.getValue() == card2.getValue()) {
			System.out.println("Stejn� velk� hodnota");
			return 0;
		}
		if (card1.getValue() > card2.getValue()) {
			System.out.println("karta 1 je v�t��");
			return -1;
		}
		else {
			System.out.println("karta 2 je v�t��");
			return +1;
		}
		


	}

}