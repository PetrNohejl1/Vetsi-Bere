
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
				new Card (COLOR_RED,7,"�erven� 7"),
				new Card (COLOR_RED,8,"�erven� 8"),
				new Card (COLOR_RED,9,"�erven� 9"),
				new Card (COLOR_RED,10,"�erven� 10"),
				new Card (COLOR_RED,11,"�erven� spodek"),
				new Card (COLOR_RED,12,"�erven� svr�ek"),
				new Card (COLOR_RED,13,"�erven� kr�l"),
				new Card (COLOR_RED,14,"�erven� eso"),
				
				new Card (COLOR_GREEN,7,"zelen� 7"),
				new Card (COLOR_GREEN,8,"zelen� 8"),
				new Card (COLOR_GREEN,9,"zelen� 9"),
				new Card (COLOR_GREEN,10,"zelen� 10"),
				new Card (COLOR_GREEN,11,"zelen� spodek"),
				new Card (COLOR_GREEN,12,"zelen� svr�ek"),
				new Card (COLOR_GREEN,13,"zelen� kr�l"),
				new Card (COLOR_GREEN,14,"zelen� eso"),
				
				new Card (COLOR_ACORN,7,"�aludsk� 7"),
				new Card (COLOR_ACORN,8,"�aludsk� 8"),
				new Card (COLOR_ACORN,9,"�aludsk� 9"),
				new Card (COLOR_ACORN,10,"�aludsk� 10"),
				new Card (COLOR_ACORN,11,"�aludsk� spodek"),
				new Card (COLOR_ACORN,12,"�aludsk� svr�ek"),
				new Card (COLOR_ACORN,13,"�aludsk� kr�l"),
				new Card (COLOR_ACORN,14,"�aludsk� eso"),
				
				new Card (COLOR_BALL,7,"kulov� 7"),
				new Card (COLOR_BALL,8,"kulov� 8"),
				new Card (COLOR_BALL,9,"kulov� 9"),
				new Card (COLOR_BALL,10,"kulov� 10"),
				new Card (COLOR_BALL,11,"kulov� spodek"),
				new Card (COLOR_BALL,12,"kulov� svr�ek"),
				new Card (COLOR_BALL,13,"kulov� kr�l"),
				new Card (COLOR_BALL,14,"kulov� eso")
				};
		
		


		public String toString() {
			return "Card [color=" + color + ", value=" + value + ", name=" + name + ", getColor()=" + getColor()
					+ ", getValue()=" + getValue() + ", getName()=" + getName() + "]";
		}

	}


