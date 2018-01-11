package wb;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

import oblici.Tacka;

public class PnlCrtez extends JPanel{
	
	private ArrayList<Tacka> oblici = new ArrayList<Tacka>();
	
	public ArrayList<Tacka> getOblici() {
		return oblici;
	}

	public static void main(String[] args) {
		FrmCrtez crtez = new FrmCrtez();
		crtez.setSize(600,400);
		crtez.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		crtez.setVisible(true);

	}
	
	public void paint(Graphics g) {
		Iterator<Tacka> it = oblici.iterator();
		while (it.hasNext()) {
			it.next().crtajSe(g);
		}
		repaint();
	}

}
