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

	}

}
