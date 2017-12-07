package oblici;

public class Test {

	public static void main(String[] args) {
		Tacka t1 = new Tacka();
		
		t1.setX(5);
		t1.setY(5);
		
		System.out.println("Tacka se nalazi na x: " 
							+ t1.getX());
		System.out.println("Tacka se nalazi na y: " 
							+ t1.getY());
		
		t1.pomeriNa(10, 10);
		
		System.out.println("Tacka se nalazi na x: " 
							+ t1.getX());
		System.out.println("Tacka se nalazi na y: " 
							+ t1.getY());
		
		t1.pomeriZa(10, 10);
		
		System.out.println("Tacka se nalazi na x: " 
							+ t1.getX());
		System.out.println("Tacka se nalazi na y: " 
							+ t1.getY());
		
		Tacka t2 = new Tacka();
		
		t2.setX(30);
		t2.setY(30);
		
		double udaljenost = t1.udaljenost(t2);
		
		System.out.println(udaljenost);
		
		Linija l1 = new Linija();
		
		l1.setPocetna(t1);
		l1.setKrajnja(t2);
		
		System.out.println(l1.duzina());
		
		System.out.println("Testiranje linije");
		
		System.out.println(l1.getPocetna().getX());
		System.out.println(l1.getPocetna().getY());
		
		System.out.println(l1.getKrajnja().getX());
		System.out.println(l1.getKrajnja().getY());
		
		l1.pomeriZa(10, 10);
		
		System.out.println("Pomeri za 10-10");
		
		System.out.println(l1.getPocetna().getX());
		System.out.println(l1.getPocetna().getY());
		
		System.out.println(l1.getKrajnja().getX());
		System.out.println(l1.getKrajnja().getY());
		
		l1.pomeriNa(0,0);
		
		System.out.println("Pomeri na 10-10");
		
		System.out.println(l1.getPocetna().getX());
		System.out.println(l1.getPocetna().getY());
		
		System.out.println(l1.getKrajnja().getX());
		System.out.println(l1.getKrajnja().getY());
		
		Pravougaonik p1 = new Pravougaonik();
		
		p1.setGoreLevo(t1);
		p1.setSirina(20);
		p1.setVisina(10);
		
		System.out.println(p1.obim());
		System.out.println(p1.povrsina());
		
		Tacka t10 = new Tacka(10,10);
		Tacka t11 = new Tacka(20,20,"crvena");
		
		Kvadrat k1 = new Kvadrat(t1, 10);
		
		System.out.println(k1.obim());
		System.out.println(k1.povrsina());
		
		Krug kr1 = new Krug(t1, 10);
		
		System.out.println(kr1.obim());
		System.out.println(kr1.povrsina());
		
		/*Postavi Y koordinatu krajnje tacke linije l1,
		na vrednost visine pravougaonika p1*/
		
		l1.getKrajnja().setY(p1.getVisina());
		
		/*Postaviti stranicu kvadrata k1 na sumu X
		 * koordinate tacke gore levo pravougaonika p1 i
		 * poluprecnika kruga kr1
		 */
		
		k1.setSirina(p1.getGoreLevo().getX()+kr1.getPoluprecnik());
		
		/*Kreirati liniju l3 cija pocetna tacka ce imati X
		 * koordinatu koja je jednaka X koordinati tacke gore levo
		 * pravouganika p1 i Y koordinatu jednaku stranici
		 * kvadrata k1 i krajnju tacku t10)
		 */
		
		Linija l3 = new Linija();
		Tacka pocetna = new Tacka();
		pocetna.setX(p1.getGoreLevo().getX());
		pocetna.setY(k1.getSirina());
		l3.setPocetna(pocetna);
		l3.setKrajnja(t10);
		
		Tacka t8 = new Tacka(p1.getGoreLevo().getX(), k1.getSirina());
		Linija l4 = new Linija(t8, t10);
		
		Linija l5 = new Linija(new Tacka(p1.getGoreLevo().getX(), k1.getSirina()), t10);
		
		System.out.println(t1.getX());
		System.out.println(t1.getY());
		
		System.out.println(t1);
		System.out.println(l1.toString());
		
		System.out.println(p1);
		
		Tacka prva = new Tacka(10,10,"crvena");
		Tacka druga = new Tacka(10,10,"crvena");
		
		System.out.println(prva==druga);
		
		System.out.println(prva.equals(druga));
		
		System.out.println(prva.equals(l1));
		
		String prvi = "pera";
		String drugi = "pera";
		
		System.out.println(prvi==drugi);
		
		String treci = new String("pera");
		String cetvrti = new String("pera");
		
		System.out.println(treci==cetvrti);
		
		Tacka treca = new Tacka(10,10, treci);
		Tacka cetvrta = new Tacka(10,10, cetvrti);
		
		System.out.println(treca.equals(cetvrta));
		
		
	
		
		
		
		
		

	}

}
