package oblici;

import java.awt.Graphics;

public class Pravougaonik extends Kvadrat{
	private int visina;
	
	public Pravougaonik() {
		
	}

	public Pravougaonik(Tacka goreLevo, int visina, int sirina) {
		this.goreLevo = goreLevo;
		this.visina = visina;
		setSirina(sirina);
	}

	public Pravougaonik(Tacka goreLevo, int visina, int sirina, String boja) {
		this(goreLevo, visina, sirina);
		setBoja(boja);
	}
	
	public Pravougaonik(Tacka goreLevo, int visina, int sirina, String boja, String bojaUnutrasnjosti) {
		this(goreLevo, visina, sirina);
		setBoja(boja);
		this.setBojaUnutrasnjosti(bojaUnutrasnjosti);
	}

	public int getVisina() {
		return visina;
	}
	
	public void setVisina(int novaVisina) {
		visina = novaVisina;
	}
	
	public double obim() {
		double obim = 2*visina + 2*getSirina();
		return obim;
	}
	
	public double povrsina() {
		return visina*getSirina();
	}
	
	public String toString() {
		return "Tacka goreLevo=" + goreLevo
		+", sirina="+getSirina()+", visina="+visina;
	}
	
	public Linija dijagonala() {
		Tacka goreDesno = new Tacka(goreLevo.getX() + getSirina(),
									goreLevo.getY());
		Tacka doleLevo = new Tacka(goreLevo.getX(),
									goreLevo.getY() + visina);
		Linija dijagonala = new Linija(goreDesno, doleLevo);
		return dijagonala;
	}
	
	public void crtajSe(Graphics g) {
		g.setColor(this.pronadjiBoju(this.getBoja()));
		g.drawRect(this.goreLevo.getX(), 
					this.goreLevo.getY(), 
					getSirina(), visina);
	}
	
	public void popuni(Graphics g) {
		g.setColor(this.pronadjiBoju(this.getBojaUnutrasnjosti()));
		g.fillRect(this.goreLevo.getX(), 
					this.goreLevo.getY(), 
					getSirina(), visina);
	}

	
}
