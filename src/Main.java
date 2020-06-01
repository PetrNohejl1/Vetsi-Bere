import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// vytvorim si procesor pro hru
		CardGameProcessor gameProcessor = (CardGameProcessor) new BiggerTakesGameProcessor();

		CardPack mainPack = new CardPack(new ArrayList<Card>(Arrays.asList(Card.CARDS)));

		CardPack player1Pack = new CardPack();
		CardPack player2Pack = new CardPack();
 
		
		mainPack.mix();
		Card card = null;
		int counter = 0;
		// dokud jsou v hlavnim baliku karty, tak je musim rozdat
		while ((card = mainPack.getCardFromTheTop()) != null) {
			// musim zajistit, ze budu stridave davat do jednoho a druhyho baliku. Udelam to
			// pomoci counteru, ktery budu
			// pricitat a podle toho, jestli bude liche cislo nebo sude, budu davat kartu
			// hraci 1 nebo 2

			if (counter % 2 == 0) {
				player1Pack.putCardToPacket(card);
			} else {
				player2Pack.putCardToPacket(card);
			}
			counter++;

		}

		counter = 0;
		boolean helpVariable = true;
		while (helpVariable && counter < 1000) {
			// vezmu si karty z obou baliku
			Card cardPlayer1 = player1Pack.getCardFromTheTop();
			Card cardPlayer2 = player2Pack.getCardFromTheTop();

			// zkotroluju, jestli nahodou nejsem uz na konci, tj. jeden z hracu nevyhral
			if (cardPlayer1 == null) {
				System.out.println("Vyhral hrac cislo 2");
				// ukoncim hru
				helpVariable = false;
			} else if (cardPlayer2 == null) {
				System.out.println("Vyhral hrac cislo 1");
				// ukoncim hru
				helpVariable = false;
			} else {
				// hrajeme
				int result = gameProcessor.evaluate(cardPlayer1, cardPlayer2);
				if (result == 0) {
					// nerozhodne, obe karty jdou do hlavniho baliku
					mainPack.putCardToPacket(cardPlayer1);
					mainPack.putCardToPacket(cardPlayer2);
				} else if (result == -1) {
					// bere hrac cislo 1 cely balik. Strcim karty do hlavniho baliku a pak ho cely
					// prendam do hracova
					mainPack.putCardToPacket(cardPlayer1);
					mainPack.putCardToPacket(cardPlayer2);
					player1Pack.putAllCardsToPacket(mainPack.getAllCardsFromPacket());
				} else if (result == 1) {
					// bere hrac cislo 1 cely balik. Strcim karty do hlavniho baliku a pak ho cely
					// prendam do hracova
					mainPack.putCardToPacket(cardPlayer1);
					mainPack.putCardToPacket(cardPlayer2);
					player2Pack.putAllCardsToPacket(mainPack.getAllCardsFromPacket());
				}
				counter++;
			}
			// pokud jsme dosli az do 1000, tak musime vyhodnotit baliky
			if (counter == 1000) {
				if (player1Pack.size() > player2Pack.size()) {
					System.out.println(
							"Vyhral hrac cislo 1 vysledkem " + player1Pack.size() + " ku " + player2Pack.size());
				} else if (player1Pack.size() < player2Pack.size()) {
					System.out.println(
							"Vyhral hrac cislo 2 vysledkem " + player1Pack.size() + " ku " + player2Pack.size());
				} else
					System.out.println("Nikdo nevyhral");
			}
		}

	}

}