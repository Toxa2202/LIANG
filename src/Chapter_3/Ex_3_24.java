package Chapter_3;

public class Ex_3_24 {

	public static void main(String[] args) {
		int card = (int)(Math.random() * 13);
		int suit = (int)(Math.random() * 4);
		
		
		switch (card) {
		case 0:
			System.out.print("The card you picked is Ace ");
			break;
		case 1:
			System.out.print("The card you picked is 2 ");
			break;
		case 2:
			System.out.print("The card you picked is 3 ");
			break;
		case 3:
			System.out.print("The card you picked is 4 ");
			break;
		case 4:
			System.out.print("The card you picked is 5 ");
			break;
		case 5:
			System.out.print("The card you picked is 6 ");
			break;
		case 6:
			System.out.print("The card you picked is 7 ");
			break;
		case 7:
			System.out.print("The card you picked is 8 ");
			break;
		case 8:
			System.out.print("The card you picked is 9 ");
			break;
		case 9:
			System.out.print("The card you picked is 10 ");
			break;
		case 10:
			System.out.print("The card you picked is Jack ");
			break;
		case 11:
			System.out.print("The card you picked is Queen ");
			break;
		case 12:
			System.out.print("The card you picked is King ");
			break;
		default:
			System.out.println("Something is wrong!");
			break;
		}
		
		switch (suit) {
		case 0:
			System.out.print("of Clubs");
			break;
		case 1:
			System.out.print("of Diamonds");
			break;
		case 2:
			System.out.print("of Hearts");
			break;
		case 3:
			System.out.print("of Spades");
			break;
		default:
			System.out.println("Something is wrong!");
			break;
		}
	}

}
