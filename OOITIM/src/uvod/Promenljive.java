package uvod;

public class Promenljive {

	public static void main(String[] args) {
		boolean b;
		int prviBroj;
		
		prviBroj = 7;
		
		int drugiBroj = 5;
		
		int kolicnik = prviBroj / drugiBroj;
		
		System.out.println(kolicnik);
		
		boolean prviVeciOdDrugog = prviBroj > drugiBroj;

		System.out.println(prviVeciOdDrugog);
		
		boolean uvekFalse = false;
		
		System.out.println(prviVeciOdDrugog && uvekFalse);
		
		System.out.println(prviVeciOdDrugog || uvekFalse);
		
		char space = ' ';
		
		String ime = "Petar";
		
		String prezime = "Petrovic";
		
		System.out.println(ime + space + prezime);
		
		System.out.println("Grananje IF");
		
		if (prviBroj > 0) {
			System.out.println("Broj je pozitivan.");
		} else if (prviBroj == 0) {
			System.out.println("Broj je 0.");
		} else {
			System.out.println("Broj je negativan.");
		}
		
		System.out.println("Petlje WHILE");
		int i = 1;
		
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Petlje DO WHILE");
		
		i = 1;
		
		do {
			System.out.println(i);
		} while (i>10);
		
		System.out.println("Petlje FOR");
		for (i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("Poziv metode sabiranje(5,6)");
		System.out.println(sabiranje(5,6));
		
		System.out.println("Poziv metode konobar()");
		konobar();
		
	}
	
	public static int sabiranje(int x, int y) {
		return x + y;
	}
	
	public static void konobar(){
		System.out.println("Dobar dan. Izvolite...");
	}

}
