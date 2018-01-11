package wb;

import javax.swing.JFrame;
import javax.swing.JPanel;

import oblici.Tacka;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmCrtez extends JFrame{
	public FrmCrtez() {
		
		PnlCrtez panel = new PnlCrtez();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int x = arg0.getX();
				int y = arg0.getY();
				
				Tacka t = new Tacka(x, y, "crvena");
				
				panel.getOblici().add(t);
			}
		});
		getContentPane().add(panel, BorderLayout.CENTER);
	}

}
