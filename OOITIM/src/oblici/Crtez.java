package oblici;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Crtez extends JPanel{

	public static void main(String[] args) {
		JFrame prozor = new JFrame();
		Crtez c = new Crtez();
		prozor.getContentPane().add(c);
		prozor.setVisible(true);
		prozor.setSize(600, 400);
		prozor.setTitle("Vidi prozor...");
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g) {
		Tacka t1 = new Tacka(10,10, "crvena");
		Linija l1 = new Linija(new Tacka(20,20),
								new Tacka(30,30),
								"plava");
		Kvadrat k = new Kvadrat(new Tacka(40,40), 10, "zuta");
		Pravougaonik p = new Pravougaonik(new Tacka(60,60),
											30, 20, "zelena");
		Krug kr = new Krug(new Tacka(120,120), 10, "crna");
		
		t1.crtajSe(g);
		l1.crtajSe(g);
		k.crtajSe(g);
		p.crtajSe(g);
		kr.crtajSe(g);
	}

}
