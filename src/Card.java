
public class Card {
	

		public static final String COLOR_RED = "RED";
		public static final String COLOR_GREEN = "GREEN";
		public static final String COLOR_ACORN = "ACORN";
		public static final String COLOR_BALL = "BALL";
		
		private String color;
		private int value;
		private String name;

		public Card(String color, int value, String name) {
			this.color = color;
			this.value = value;
			this.name = name;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}


		public static Card[] CARDS = {
				new Card (COLOR_RED,7,"èervená 7"),
				new Card (COLOR_RED,8,"èervená 8"),
				new Card (COLOR_RED,9,"èervená 9"),
				new Card (COLOR_RED,10,"èervená 10"),
				new Card (COLOR_RED,11,"èervený spodek"),
				new Card (COLOR_RED,12,"èervený svršek"),
				new Card (COLOR_RED,13,"èervený král"),
				new Card (COLOR_RED,14,"èervené eso"),
				
				new Card (COLOR_GREEN,7,"zelená 7"),
				new Card (COLOR_GREEN,8,"zelená 8"),
				new Card (COLOR_GREEN,9,"zelená 9"),
				new Card (COLOR_GREEN,10,"zelená 10"),
				new Card (COLOR_GREEN,11,"zelený spodek"),
				new Card (COLOR_GREEN,12,"zelený svršek"),
				new Card (COLOR_GREEN,13,"zelený král"),
				new Card (COLOR_GREEN,14,"zelené eso"),
				
				new Card (COLOR_ACORN,7,"žaludská 7"),
				new Card (COLOR_ACORN,8,"žaludská 8"),
				new Card (COLOR_ACORN,9,"žaludská 9"),
				new Card (COLOR_ACORN,10,"žaludská 10"),
				new Card (COLOR_ACORN,11,"žaludský spodek"),
				new Card (COLOR_ACORN,12,"žaludský svršek"),
				new Card (COLOR_ACORN,13,"žaludský král"),
				new Card (COLOR_ACORN,14,"žaludské eso"),
				
				new Card (COLOR_BALL,7,"kulová 7"),
				new Card (COLOR_BALL,8,"kulová 8"),
				new Card (COLOR_BALL,9,"kulová 9"),
				new Card (COLOR_BALL,10,"kulová 10"),
				new Card (COLOR_BALL,11,"kulový spodek"),
				new Card (COLOR_BALL,12,"kulový svršek"),
				new Card (COLOR_BALL,13,"kulový král"),
				new Card (COLOR_BALL,14,"kulové eso")
				};
		
		


		public String toString() {
			return "Card [color=" + color + ", value=" + value + ", name=" + name + ", getColor()=" + getColor()
					+ ", getValue()=" + getValue() + ", getName()=" + getName() + "]";
		}

	}


