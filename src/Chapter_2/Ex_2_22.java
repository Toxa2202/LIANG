package Chapter_2;

public class Ex_2_22 {

	public static void main(String[] args) {
		//�������� ����� �������� ��������� currentTimeMillis
		long totalLetters = System.currentTimeMillis();
		
		//���������� ��������� �������� �� 65 �� 90
		int currentLetter = (int)(totalLetters / 1000) % 26 + 65;
		
		//������������ �������� �� char, �� ����� ��� ����� � �����
		char letter = (char)currentLetter;
		
		//�������� ��� �� �����
		System.out.println("The random letter is -> " + letter);
	}

}

//����� ����� � ��� ������ �������, ��� ���� �� ����� ��������� ����� �� � �� Z