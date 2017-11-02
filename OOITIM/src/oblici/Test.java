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

	}

}
