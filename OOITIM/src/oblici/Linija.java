package oblici;

public class Linija {
	Tacka pocetna;
	Tacka krajnja;
	String boja;
	
	public void setPocetna(Tacka novaPocetna) {
		pocetna = novaPocetna;
	}
	
	public Tacka getPocetna() {
		return pocetna;
	}
	
	public void setKrajnja(Tacka novaKrajnja) {
		krajnja = novaKrajnja;
	}
	
	public Tacka getKrajnja() {
		return krajnja;
	}
	
	public void setBoja(String novaBoja) {
		boja = novaBoja;
	}
	
	public String getBoja() {
		return boja;
	}
	
	public void pomeriNa(int novoX, int novoY) {
		pocetna.pomeriNa(novoX, novoY);
		int rx = pocetna.getX()-novoX;
		int ry = pocetna.getY()-novoY;
		krajnja.pomeriZa(rx, ry);
	}
	
	public void pomeriZa(int novoX, int novoY) {
		pocetna.pomeriZa(novoX, novoY);
		krajnja.pomeriZa(novoX, novoY);
	}
	
	public double duzina() {
		return pocetna.udaljenost(krajnja);
	}
	

}
