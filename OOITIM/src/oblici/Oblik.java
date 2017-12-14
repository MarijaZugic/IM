package oblici;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Oblik {
	private String boja;
	
	public Oblik() {
		
	}
	
	public Oblik(String boja) {
		this.boja = boja;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	public static Color pronadjiBoju(String boja) {
		switch(boja) {
		case "zuta":
			return Color.YELLOW;
		case "zelena":
			return Color.GREEN;
		case "plava":
			return Color.BLUE;
		case "crvena":
			return Color.RED;
		case "bela":
			return Color.WHITE;
		default:
			return Color.BLACK;
		}
	}
	
	public abstract void crtajSe(Graphics g);
	
	

}
