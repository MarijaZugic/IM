package oblici;

import java.awt.Graphics;

public class Linija extends Oblik{
	private Tacka pocetna;
	private Tacka krajnja;
	
	public Linija() {

	}

	public Linija(Tacka pocetna, Tacka krajnja) {
		this.pocetna = pocetna;
		this.krajnja = krajnja;
	}

	public Linija(Tacka pocetna, Tacka krajnja, String boja) {
		super(boja);
		this.pocetna = pocetna;
		this.krajnja = krajnja;
	
	}

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
	
	public void pomeriNa(int novoX, int novoY) {
		int rx = novoX - pocetna.getX();
		int ry = novoY - pocetna.getY();
		pocetna.pomeriNa(novoX, novoY);
		krajnja.pomeriZa(rx, ry);
	}
	
	public void pomeriZa(int novoX, int novoY) {
		pocetna.pomeriZa(novoX, novoY);
		krajnja.pomeriZa(novoX, novoY);
	}
	
	public double duzina() {
		return pocetna.udaljenost(krajnja);
	}
	public String toString() {
		return pocetna.toString() + "->" + krajnja;
	}
	
	/*U klasi Linija kreirati metodu 
	 * public Tacka sredinaLinije() 
	 * koja vraca središnu tacku linije.
	 */
	
	public Tacka sredinaLinije() {
		int xs = (pocetna.getX() + krajnja.getX())/2;
		int ys = (pocetna.getY() + krajnja.getY())/2;
		Tacka sredina = new Tacka(xs,ys);
		return sredina;
	}

	@Override
	public void crtajSe(Graphics g) {
		g.setColor(this.pronadjiBoju(this.getBoja()));
		g.drawLine(this.pocetna.getX(), 
					this.pocetna.getY(), 
					this.krajnja.getX(), 
					this.krajnja.getY());
	}
	
}
