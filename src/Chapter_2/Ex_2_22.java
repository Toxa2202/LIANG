package Chapter_2;

public class Ex_2_22 {

	public static void main(String[] args) {
		//Витягуємо метод атомного годинника currentTimeMillis
		long totalLetters = System.currentTimeMillis();
		
		//Обчислюємо випадкове значення від 65 до 90
		int currentLetter = (int)(totalLetters / 1000) % 26 + 65;
		
		//Перетворюємо значення на char, що дасть код літери в юнікоді
		char letter = (char)currentLetter;
		
		//Виводимо код на екран
		System.out.println("The random letter is -> " + letter);
	}

}

//Таким чином у нас вийшла задачка, яка видає на екран випадкову літеру від А до Z