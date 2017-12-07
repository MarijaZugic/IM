package oblici;

public class Kvadrat extends Oblik{
	protected Tacka goreLevo;
	private int sirina;
	
	public Kvadrat() {
	
	}
	
	public Kvadrat(Tacka goreLevo, int stranica) {
		this.goreLevo = goreLevo;
		this.sirina = stranica;
	}

	public Kvadrat(Tacka goreLevo, int stranica, String boja) {
		super(boja);
		this.goreLevo = goreLevo;
		this.sirina = stranica;
	}


	public void setGoreLevo(Tacka novoGoreLevo) {
		goreLevo=novoGoreLevo;
	}
	public Tacka getGoreLevo() {
		return goreLevo;
	}
	public void setSirina(int novaStranica) {
		sirina=novaStranica;
	}
	public int getSirina() {
		return sirina;
		
	} 

	public void pomeriZa(int x,int y) {
		this.goreLevo.pomeriZa(x, y);
	}
	public void pomeriNa(int x,int y) {
		this.goreLevo.pomeriNa(x, y);
	}
	public int povrsina() {
		int povrsina= sirina*sirina;
		return povrsina;
		
	}
	public int obim() {
		int obim=sirina*4;
		return obim;
	}
	/*U klasi Kvadrat kreirati metodu 
	 * public Linija dijagonala() 
	 * koja vraca dijagonalu 
	 * od gore desno do dole levo 
	 * kvadrata.
	 */
	
	public Linija dijagonala() {
		Tacka goreDesno = new Tacka(goreLevo.getX() + sirina,
									goreLevo.getY());
		Tacka doleLevo = new Tacka(goreLevo.getX(),
									goreLevo.getY() + sirina);
		Linija dijagonala = new Linija(goreDesno, doleLevo);
		return dijagonala;
	}

}
