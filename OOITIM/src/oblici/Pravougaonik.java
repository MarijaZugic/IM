package oblici;

public class Pravougaonik {
	private Tacka goreLevo;
	private int visina;
	private int sirina;
	private String boja;
	
	public Tacka getGoreLevo() {
		return goreLevo;
	}
	
	public void setGoreLevo(Tacka novoGoreLevo) {
		goreLevo = novoGoreLevo;
	}
	
	public int getVisina() {
		return visina;
	}
	
	public void setVisina(int novaVisina) {
		visina = novaVisina;
	}
	
	public int getSirina() {
		return sirina;
	}
	
	public void setSirina(int novaSirina) {
		sirina = novaSirina;
	}
	
	public void setBoja(String novaBoja) {
		boja = novaBoja;
	}
	
	public String getBoja() {
		return boja;
	}
	
	public void pomeriNa(int novoX, int novoY) {
		goreLevo.pomeriNa(novoX, novoY);
	}
	
	public void pomeriZa(int novoX, int novoY) {
		goreLevo.pomeriZa(novoX, novoY);
	}
	
	public int obim() {
		int obim = 2*visina + 2*sirina;
		return obim;
	}
	
	public int povrsina() {
		return visina*sirina;
	}

}