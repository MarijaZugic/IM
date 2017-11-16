package oblici;

public class Kvadrat {
	private Tacka goreLevo;
	private int stranica;
	private String boja;
	
	public Kvadrat() {
	
	}
	
	public Kvadrat(Tacka goreLevo, int stranica) {
		this.goreLevo = goreLevo;
		this.stranica = stranica;
	}

	public Kvadrat(Tacka goreLevo, int stranica, String boja) {
		this.goreLevo = goreLevo;
		this.stranica = stranica;
		this.boja = boja;
	}


	public void setGoreLevo(Tacka novoGoreLevo) {
		goreLevo=novoGoreLevo;
	}
	public Tacka getGoreLevo() {
		return goreLevo;
	}
	public void setStranica(int novaStranica) {
		stranica=novaStranica;
	}
	public int getStranica() {
		return stranica;
		
	} public void setBoja(String novaBoja) {
		boja=novaBoja;
		
	}public String getBoja() {
		return boja;
	}
	public void pomeriZa(int x,int y) {
		this.goreLevo.pomeriZa(x, y);
	}
	public void pomeriNa(int x,int y) {
		this.goreLevo.pomeriNa(x, y);
	}
	public int povrsina() {
		int povrsina= stranica*stranica;
		return povrsina;
		
	}
	public int obim() {
		int obim=stranica*4;
		return obim;
	}

}
