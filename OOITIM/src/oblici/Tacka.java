package oblici;

public class Tacka {
	private int x;
	private int y;
	private String boja;
	
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
	
	public void setBoja(String novaBoja) {
		boja = novaBoja;
	}
	
	public String getBoja() {
		return boja;
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
	

}
