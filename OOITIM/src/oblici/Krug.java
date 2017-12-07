package oblici;

public class Krug extends Oblik{
	private Tacka centar;
	private int poluprecnik;
	
	public Krug() {
		
	}
	
	public Krug(Tacka centar, int poluprecnik) {
		this.centar = centar;
		this.poluprecnik = poluprecnik;
	}

	public Krug(Tacka centar, int poluprecnik, String boja) {
		super(boja);
		this.centar = centar;
		this.poluprecnik = poluprecnik;
	}

	public Tacka getCentar() {
		return centar;
	}
	public void setCentar(Tacka centar) {
		this.centar = centar;
	}
	public int getPoluprecnik() {
		return poluprecnik;
	}
	public void setPoluprecnik(int poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	public double obim() {
		double obim = 2*poluprecnik*Math.PI;
				return obim;
	}
	public double povrsina() {
		double povrsina = poluprecnik*poluprecnik*Math.PI;
		return povrsina;
	}
	
	public void pomeriNa(int novoX, int novoY) {
		centar.pomeriNa(novoX, novoY);
	}
	
	public void pomeriZa(int novoX, int novoY) {
		centar.pomeriZa(novoX, novoY);
	}
	
	
	

}
