package oblici;

public class Tacka extends Oblik{
	private int x;
	private int y;
	
	public Tacka() {
		
	}
	
	public Tacka(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Tacka(int x, int y, String boja) {
		super(boja);		
		this.x=x;
		this.y=y;
	}
	
	public void setX(int novoX) {
		x = novoX;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int novoY) {
		y = novoY;
	}
	
	public int getY() {
		return y;
	}
	
	public void pomeriNa(int novoX, int novoY) {
		x = novoX;
		y = novoY;
	}
	
	public void pomeriZa(int novoX, int novoY) {
		x = x + novoX;
		y = y + novoY;
	}
	
	public double udaljenost(Tacka druga) {
		int rx = x - druga.getX(); 
		int ry = y - druga.getY();
		double rezultat = Math.sqrt(rx*rx+ry*ry);
		return rezultat;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Tacka) {
			Tacka prosledjena = (Tacka)obj;
			if(x==prosledjena.getX() &&
			   y==prosledjena.getY() &&
			   getBoja().equals(prosledjena.getBoja())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	
	}
	

}
