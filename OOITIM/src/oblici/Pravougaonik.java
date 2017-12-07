package oblici;

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

	public int getVisina() {
		return visina;
	}
	
	public void setVisina(int novaVisina) {
		visina = novaVisina;
	}
	
	public int obim() {
		int obim = 2*visina + 2*getSirina();
		return obim;
	}
	
	public int povrsina() {
		return visina*getSirina();
	}
	public String toString() {
		return "Tacka goreLevo=" + goreLevo
		+", sirina="+getSirina()+", visina="+visina;
	}

}
