import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CardPack {

	private ArrayList<Card> packet;

	public CardPack() {

		this.packet = new ArrayList<Card>();
		
	}

	public CardPack(ArrayList<Card> packet) {

		this.packet = packet;

	}

	public void mix() {

		
		Random rnd = ThreadLocalRandom.current();

		for (int i = packet.size() - 1; i > 0; i--) {

			int index = rnd.nextInt(i + 1);

			Card a = packet.get(index);

			packet.set(index, packet.get(i));

			packet.set(i, a);
		}

	}
	
	public Card getCardFromTheTop() {
	
		if (packet == null || packet.size() == 0) {
			return null;
		} else {
			return packet.remove(0);
		}
	}

	public void putCardToPacket(Card card) {
		packet.add(card);

	}
	
	public int size() {
		return packet.size();
	}
	
	
	public ArrayList<Card> getAllCardsFromPacket() {
		ArrayList<Card> packet = this.packet;
		this.packet = new ArrayList<Card>();
		return packet;
	}

	
	public void putAllCardsToPacket(ArrayList<Card> packet) {
		this.packet.addAll(packet);
	}
}