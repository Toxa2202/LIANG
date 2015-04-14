package Chapter_4;
//V ymovi pidkazka dlja rozvjazky
public class Ex_4_26 {
	public static void main(String[] args) {
		//Li4uljnuk from 10 000 to 100 000
		for (int count = 10000; count <= 100000; count += 10000) {
			//Inicializacija zminnuh
			double e = 1;
			double item = 1;
			//Ob4uslennja factoriala(duvne)
			for (int i = 2; i <= count; i++) {
				e += item;
				item /= i;
			}
			//Vuvedennja rezult
			System.out.println("e for i = " + count + ": " + e);
		}
	}

}

//NEDOPUSANO